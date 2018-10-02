import staff.management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void setUp() {
        director = new Director("A. Director", "JG-64-75-91-A", 100000, "Development", 500000);
    }

    @Test
    public void hasName(){
        assertEquals("A. Director", director.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("JG-64-75-91-A", director.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(100000, director.getSalary(), 0.1);
    }

    @Test
    public void hasDeptName() {
        assertEquals("Development", director.getDeptName());
    }

    @Test
    public void hasBudget() {
        assertEquals(500000, director.getBudget(), 0.1);
    }

    @Test
    public void negativeAmountDoesNotAffectSalary() {
        director.raiseSalary(-100);
        assertEquals(100000, director.getSalary(), 0.1);
    }

    @Test
    public void canChangeName() {
        director.changeName("B. Director");
        assertEquals("B. Director", director.getName());
    }

    @Test
    public void cantChangeNameToNull() {
        director.changeName(null);
        assertEquals("A. Director", director.getName());
    }

    @Test
    public void canPayBonus() {
        director.payBonus();
        assertEquals(2000.0, director.payBonus(), 0.1);
    }
}
