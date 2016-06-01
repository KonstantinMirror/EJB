package com.datalex;




import com.datalex.bean.Customer;
import com.datalex.bean.FareFamily;
import com.datalex.bean.Reservation;
import com.datalex.dao.DAOFabric;
import com.datalex.dao.IDAO;

import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;
import java.rmi.RemoteException;

public class FlightBean implements SessionBean {
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

    public Customer getCustomer() throws RemoteException{
        IDAO dao = DAOFabric.getInstance();
        return dao.getCustomer("g:\\Training\\Source\\data.xml");
    }

    FareFamily getFareFamily() throws RemoteException{
        IDAO dao = DAOFabric.getInstance();
        return dao.getFareFamily("g:\\Training\\Source\\data.xml");
    }

    Reservation getReservation() throws RemoteException{
        IDAO dao = DAOFabric.getInstance();
        return dao.getReservation("g:\\Training\\Source\\data.xml");
    }



}
