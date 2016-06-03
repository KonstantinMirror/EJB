package com.datalex.logging;

import javax.ejb.EJBObject;


public interface Logging extends EJBObject {
    boolean isExecistUser(String name,String pswd);
}
