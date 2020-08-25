import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    private Bus bus;
    private Person person;

    @Before
    public void before() {
        bus = new Bus("Edinburgh", 40);
        person = new Person();
    }

    @Test
    public void hasNoPassengers() {
        assertEquals(0, bus.getPassengers());
    }

    @Test
    public void canAddPassenger() {
        bus.addPassenger(person);
        assertEquals(1, bus.getPassengers());
    }

    @Test
    public void canRemovePassenger() {
        bus.addPassenger(person);
        bus.removePassenger();
        assertEquals(0, bus.getPassengers());
    }
}
