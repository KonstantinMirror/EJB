package com.datalex;




import com.datalex.bean.Customer;
import com.datalex.bean.FareFamily;
import com.datalex.bean.Reservation;

import javax.ejb.EJBObject;
import java.rmi.RemoteException;

public interface Flight extends EJBObject {
    Customer getCustomer() throws RemoteException;
    FareFamily getFareFamily() throws RemoteException;
    Reservation getReservation() throws RemoteException;
}
