import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class PassengerBogie {
    String type;
    int capacity;

    public PassengerBogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return type + " Bogie with capacity " + capacity;
    }
}

public class BogiePerformanceComparison {

    public static void main(String[] args) {
        List<PassengerBogie> bogies = new ArrayList<>();
        for (int i = 0; i < 100000; i++) { // large dataset for benchmarking
            bogies.add(new PassengerBogie("Sleeper", 50 + (i % 100))); // capacities between 50-149
        }

        long loopStart = System.nanoTime();
        List<PassengerBogie> filteredLoop = new ArrayList<>();
        for (PassengerBogie b : bogies) {
            if (b.capacity > 60) {
                filteredLoop.add(b);
            }
        }
        long loopEnd = System.nanoTime();
        long loopTime = loopEnd - loopStart;

        long streamStart = System.nanoTime();
        List<PassengerBogie> filteredStream = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());
        long streamEnd = System.nanoTime();
        long streamTime = streamEnd - streamStart;

        System.out.println("Loop-based filtering count: " + filteredLoop.size());
        System.out.println("Stream-based filtering count: " + filteredStream.size());
        System.out.println("Loop execution time (ns): " + loopTime);
        System.out.println("Stream execution time (ns): " + streamTime);
    }
}