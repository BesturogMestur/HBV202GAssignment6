package is.hi.hbv202g.ass6;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarOwnerTest {

    public static final String OWNER_NAME = "John Doe";
    private Car car;
    private CarOwner carOwner;

    @Before
    public void setUp() throws Exception {
        car = new Car("Beetle");
        carOwner=new CarOwner(OWNER_NAME, car);
    }

    @Test
    public void getName() {
        assertEquals(OWNER_NAME, carOwner.getName());
    }

}