package com.datalex.flight.dao;


import com.datalex.flight.bean.Customer;
import com.datalex.flight.bean.FareFamily;
import com.datalex.flight.bean.Reservation;

public interface IDAO {
    Reservation getReservation(String nameFile);
    Customer getCustomer(String nameFile);
    FareFamily getFareFamily(String nameFile);
}
