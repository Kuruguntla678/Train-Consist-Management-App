class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

class PassengerBogie {
    String type;
    int capacity;

    public PassengerBogie(String type, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return type + " Bogie with capacity " + capacity;
    }
}

public class TrainBogieValidationDemo {
    public static void main(String[] args) {
        try {
            PassengerBogie sleeper = new PassengerBogie("Sleeper", 72);
            System.out.println("Created: " + sleeper);

            PassengerBogie zeroBogie = new PassengerBogie("AC Chair", 0);
            System.out.println("Created: " + zeroBogie);

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            PassengerBogie negativeBogie = new PassengerBogie("First Class", -10);
            System.out.println("Created: " + negativeBogie);
        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            PassengerBogie bogie1 = new PassengerBogie("Sleeper", 60);
            PassengerBogie bogie2 = new PassengerBogie("AC Chair", 50);
            System.out.println("Created multiple valid bogies: " + bogie1 + ", " + bogie2);
        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}