import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {
    private BusStop busStop;
    private Person person;

    @Before
    public void before() {
        busStop = new BusStop("Lothain Road");
        person = new Person();
    }

    @Test
    public void checkQueueEmpty() {
        assertEquals(0, busStop.getQueue());
    }

    @Test
    public void canAddPassenger() {
        busStop.addPassenger(person);
        assertEquals(1, busStop.getQueue());
    }

    @Test
    public void canRemovePassenger() {
        busStop.addPassenger(person);
        busStop.removePassenger();
        assertEquals(0, busStop.getQueue());
    }
}
