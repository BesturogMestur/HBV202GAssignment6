package is.hi.hbv202g.ass6;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    public static final String NAME_OF_CAR = "Beetle";
    private Car car;

    @Before
    public void setUp() throws Exception {
        car = new Car(NAME_OF_CAR);
    }

    @Test
    public void getNameOfCar() {
        assertEquals(NAME_OF_CAR, car.getName());

    }

}
