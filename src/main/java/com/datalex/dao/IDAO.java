package com.datalex.dao;


import com.datalex.bean.Customer;
import com.datalex.bean.FareFamily;
import com.datalex.bean.Reservation;

public interface IDAO {
    Reservation getReservation(String nameFile);
    Customer getCustomer(String nameFile);
    FareFamily getFareFamily(String nameFile);
}
