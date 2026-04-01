import java.util.ArrayList;
import java.util.List;

class Bogie {
    String name;
    int capacity;
    String type;

    Bogie(String name, int capacity, String type) {
        this.name = name;
        this.capacity = capacity;
        this.type = type;
    }

    @Override
    public String toString() {
        return name + " (" + capacity + " seats)";
    }
}

public class TrainConsistApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App (UC10) ===");

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72, "Passenger"));
        bogies.add(new Bogie("AC Chair", 54, "Passenger"));
        bogies.add(new Bogie("First Class", 24, "Passenger"));
        bogies.add(new Bogie("Cargo", 0, "Goods")); // Goods bogie has no seats

        System.out.println("Bogies in Train:");
        bogies.forEach(System.out::println);

        int totalSeats = bogies.stream()
                .filter(b -> b.type.equals("Passenger")) // only passenger bogies
                .map(b -> b.capacity)                    // extract capacity
                .reduce(0, Integer::sum);               // sum capacities

        System.out.println("\nTotal Seating Capacity of Train: " + totalSeats);
    }
}