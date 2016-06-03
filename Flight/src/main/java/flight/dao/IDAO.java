package flight.dao;


import flight.bean.Customer;
import flight.bean.FareFamily;
import flight.bean.Reservation;

public interface IDAO {
    Reservation getReservation(String nameFile);
    Customer getCustomer(String nameFile);
    FareFamily getFareFamily(String nameFile);
}
