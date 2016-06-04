package com.db;


import com.datalex.logging.bean.User;

public interface IUserDao {

    boolean getUser (String login, String password);
}
