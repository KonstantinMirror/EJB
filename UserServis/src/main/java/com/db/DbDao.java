package com.db;


import com.datalex.logging.bean.User;

import java.sql.*;


public class DbDao implements IUserDao {


    @Override
    public boolean getUser(String login, String password) {
        Connection con = null;
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            con = DButility.getConnection();
            statement = con.prepareStatement("SELECT  * FROM users.logins " +
                    "WHERE login = ? AND pwd = ? ");
            statement.setString(1, login);
            statement.setString(2, password);
            result = statement.executeQuery();
            if (result.next()) {
                return true;
            }
            return false;
        } catch (SQLException e) {
            throw new IllegalStateException("Problem with DB", e);
        } finally {
            DButility.closeResultSet(result);
            DButility.closeStatement(statement);
            DButility.closeConnection(con);
        }

    }


}
