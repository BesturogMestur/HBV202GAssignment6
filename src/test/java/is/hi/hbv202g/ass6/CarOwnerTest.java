package is.hi.hbv202g.ass6;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarOwnerTest {

    private Car car;
    private CarOwner carOwner;

    @Before
    public void setUp() throws Exception {
        car = new Car("Beetle");
        carOwner=new CarOwner("John Doe", car);
    }

    @Test
    public void getName() {
        assertEquals("John Doe", carOwner.getName());
    }

}