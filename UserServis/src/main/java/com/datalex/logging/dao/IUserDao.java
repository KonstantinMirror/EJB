package com.datalex.logging.dao;

import com.datalex.logging.bean.User;


public interface IUserDao {
User getUser(String name,String pswd);
}
