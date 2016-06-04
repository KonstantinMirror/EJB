import com.db.DbDao;
import com.db.IUserDao;
import org.junit.Test;
import static org.junit.Assert.*;


public class TestDB {
    @Test
    public void testDB(){
        IUserDao userDao = new DbDao();
        assertTrue(userDao.getUser("Alex","123456"));
    }


}
