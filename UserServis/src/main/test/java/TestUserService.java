import com.datalex.logging.Logging;
import com.datalex.logging.LoggingHome;
import org.junit.Test;

import javax.naming.*;
import javax.rmi.PortableRemoteObject;



import java.util.Properties;

public class TestUserService {
    @Test
    public void testService() {

        Properties properties = new Properties();
        properties.put(Context.INITIAL_CONTEXT_FACTORY, "org.jnp.interfaces.NamingContextFactory");
        properties.put(Context.PROVIDER_URL, "localhost:1099");
        try {
            InitialContext jndiContext = new InitialContext(properties);
            System.out.println("Got context!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println(jndiContext);
            Object ref = jndiContext.lookup("User");
            System.out.println(ref);
            System.out.println("Got reference");
            LoggingHome home = (LoggingHome) PortableRemoteObject.narrow(ref,
                    LoggingHome.class);
            Logging logging = home.create();
            System.out.println("Get service");
            System.out.println(logging.isExecistUser("", ""));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
