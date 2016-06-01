package com.datalex.dao;


import com.datalex.bean.DAOxml;

public class DAOFabric {

    public static IDAO getInstance(){
        return new DAOxml();
    }
}
