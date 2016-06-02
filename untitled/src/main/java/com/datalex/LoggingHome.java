package com.datalex;

import javax.ejb.EJBHome;
import java.rmi.RemoteException;


public interface LoggingHome extends EJBHome {
    Logging create()throws RemoteException;

}
