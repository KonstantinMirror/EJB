package com.datalex.flight;




import com.datalex.flight.bean.Customer;
import com.datalex.flight.bean.FareFamily;
import com.datalex.flight.bean.Reservation;
import com.datalex.flight.dao.DAOFabric;
import com.datalex.flight.dao.IDAO;


import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;
import java.rmi.RemoteException;

public class FlightBean implements SessionBean {

    private static final long serialVersionUID = 1L;

    @Override
    public void setSessionContext(SessionContext sessionContext) throws EJBException, RemoteException {
    }

    @Override
    public void ejbRemove() throws EJBException, RemoteException {
    }

    @Override
    public void ejbActivate() throws EJBException, RemoteException {
    }

    @Override
    public void ejbPassivate() throws EJBException, RemoteException {
    }

    public void  ejbCreate() throws EJBException{

    }

    public Customer getCustomer() throws RemoteException{
        IDAO dao = DAOFabric.getInstance();
        return dao.getCustomer("g:\\Training\\Source\\data.xml");

    }

    public FareFamily getFareFamily() throws RemoteException{
        IDAO dao = DAOFabric.getInstance();
        return dao.getFareFamily("g:\\Training\\Source\\data.xml");

    }

    public Reservation getReservation() throws RemoteException{
        IDAO dao = DAOFabric.getInstance();
        return dao.getReservation("g:\\Training\\Source\\data.xml");

    }



}
