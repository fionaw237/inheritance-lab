import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void setUp() {
        developer = new Developer("A. Developer", "JG-64-75-91-A", 40000);
    }

    @Test
    public void hasName() {
        assertEquals("A. Developer", developer.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("JG-64-75-91-A", developer.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(40000, developer.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(500.00);
        assertEquals(40500, developer.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus() {
        developer.payBonus();
        assertEquals(400.0, developer.payBonus(), 0.1);
    }

    @Test
    public void negativeAmountDoesNotAffectSalary() {
        developer.raiseSalary(-100);
        assertEquals(40000, developer.getSalary(), 0.1);
    }

    @Test
    public void canChangeName() {
        developer.changeName("B. Developer");
        assertEquals("B. Developer", developer.getName());
    }

    @Test
    public void cantChangeNameToNull() {
        developer.changeName(null);
        assertEquals("A. Developer", developer.getName());
    }
}
