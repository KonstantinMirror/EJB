package com.datalex.dao;



public class DAOFabric {

    public static IDAO getInstance(){
        return new DAOxml();
    }
}
