import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    private Bus bus;
    private Person person;
    private BusStop busStop;

    @Before
    public void before() {
        bus = new Bus("Edinburgh", 40);
        person = new Person();
        busStop = new BusStop("Lothain Road");
        busStop.addPassenger(person);
    }

    @Test
    public void hasNoPassengers() {
        assertEquals(0, bus.getPassengers());
    }

    @Test
    public void canAddPassenger() {
        bus.addPassenger(busStop);
        assertEquals(1, bus.getPassengers());
    }

    @Test
    public void canRemovePassenger() {
        bus.addPassenger(busStop);
        bus.removePassenger();
        assertEquals(0, bus.getPassengers());
    }
}
