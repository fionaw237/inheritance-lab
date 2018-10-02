import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void setUp(){
        databaseAdmin = new DatabaseAdmin("Ann Administrator", "JG-64-75-91-A", 25000);
    }

    @Test
    public void hasName() {
        assertEquals("Ann Administrator", databaseAdmin.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("JG-64-75-91-A", databaseAdmin.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(25000, databaseAdmin.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(500.00);
        assertEquals(25500, databaseAdmin.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus() {
        databaseAdmin.payBonus();
        assertEquals(250.0, databaseAdmin.payBonus(), 0.1);
    }

    @Test
    public void negativeAmountDoesNotAffectSalary() {
        databaseAdmin.raiseSalary(-100);
        assertEquals(25000, databaseAdmin.getSalary(), 0.1);
    }

    @Test
    public void canChangeName() {
        databaseAdmin.changeName("Anne Administrator");
        assertEquals("Anne Administrator", databaseAdmin.getName());
    }

    @Test
    public void cantChangeNameToNull() {
        databaseAdmin.changeName(null);
        assertEquals("Ann Administrator", databaseAdmin.getName());
    }

    @Test
    public void cantChangeNameToEmptyString() {
        databaseAdmin.changeName("");
        assertEquals("Ann Administrator", databaseAdmin.getName());
    }
}
