import flight.Flight;
import flight.FlightHome;
import org.junit.Test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;
import java.util.Properties;


public class TestFlight {
    @Test
    public void testService() {

        Properties properties = new Properties();
        properties.put(Context.INITIAL_CONTEXT_FACTORY, "org.jnp.interfaces.NamingContextFactory");
        properties.put(Context.PROVIDER_URL, "localhost:1099");
        try {
            InitialContext jndiContext = new InitialContext(properties);
            System.out.println("Got context!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println(jndiContext);
            Object ref = jndiContext.lookup("Flight");
            System.out.println(ref);
            System.out.println("Got reference");
            FlightHome home = (FlightHome) PortableRemoteObject.narrow(ref,
                    FlightHome.class);
            Flight flight  = home.create();
            System.out.println("Get service");
            System.out.println(flight.getFareFamily());
            System.out.println(flight.getCustomer());
            System.out.println(flight.getReservation());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
