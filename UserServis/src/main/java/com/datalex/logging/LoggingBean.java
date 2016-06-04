package com.datalex.logging;

import com.db.DbDao;
import com.db.IUserDao;

import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;
import java.rmi.RemoteException;


public class LoggingBean implements SessionBean {

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

    public  boolean isExecistUser(String login,String pswd){
        IUserDao userDao = new DbDao();
        boolean isExecist = userDao.getUser(login,pswd);
        return isExecist;
    }
}
