package flight;




import flight.bean.Customer;
import flight.bean.FareFamily;
import flight.bean.Reservation;

import javax.ejb.EJBObject;
import java.rmi.RemoteException;

public interface Flight extends EJBObject {
    Customer getCustomer() throws RemoteException;
    FareFamily getFareFamily() throws RemoteException;
    Reservation getReservation() throws RemoteException;
}
