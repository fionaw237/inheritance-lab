import staff.management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void setUp(){
        manager = new Manager("A. Boss", "JG-64-75-91-A", 60000, "Development");
    }

    @Test
    public void hasName() {
        assertEquals("A. Boss", manager.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("JG-64-75-91-A", manager.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(60000, manager.getSalary(), 0.1);
    }

    @Test
    public void hasDept() {
        assertEquals("Development", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(500.00);
        assertEquals(60500, manager.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus() {
        manager.payBonus();
        assertEquals(600.0, manager.payBonus(), 0.1);
    }

    @Test
    public void negativeAmountDoesNotAffectSalary() {
        manager.raiseSalary(-100);
        assertEquals(60000, manager.getSalary(), 0.1);
    }

    @Test
    public void canChangeName() {
        manager.changeName("A. Manager");
        assertEquals("A. Manager", manager.getName());
    }

    @Test
    public void cantChangeNameToNull() {
        manager.changeName(null);
        assertEquals("A. Boss", manager.getName());
    }
}
