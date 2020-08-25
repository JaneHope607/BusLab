import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus() {
        this.passengers = new ArrayList<Person>();
    }


    public int getPassengers() {
        return this.passengers.size();
    }
}
