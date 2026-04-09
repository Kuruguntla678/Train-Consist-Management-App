<<<<<<< HEAD
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

class GoodsBogie {
    String shape;
    String cargo;

    public GoodsBogie(String shape) {
        this.shape = shape;
    }

    public void assignCargo(String cargoType) {
        try {
            // Validation
            if (shape.equalsIgnoreCase("Rectangular") &&
                    cargoType.equalsIgnoreCase("Petroleum")) {

                throw new CargoSafetyException(
                        "Unsafe! Cannot assign Petroleum to Rectangular Bogie."
                );
            }

            this.cargo = cargoType;
            System.out.println("Cargo '" + cargoType + "' assigned to " + shape + " bogie.");

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Assignment attempt completed.\n");
        }
    }

    public void display() {
        System.out.println("Bogie Shape: " + shape +
                ", Cargo: " + (cargo == null ? "None" : cargo));
    }
}

// Main Class
public class TrainConsistApp {
    public static void main(String[] args) {

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        b1.assignCargo("Petroleum");

        b2.assignCargo("Petroleum");

        b2.assignCargo("Coal");

        b1.display();
        b2.display();

        System.out.println("\nProgram continues successfully after handling exceptions.");
=======
import java.util.ArrayList;
import java.util.List;

public class TrainApp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Initialize empty list for bogies
        List<String> trainConsist = new ArrayList<>();

        // Display initial bogie count
        System.out.println("Train consist initialized.");
        System.out.println("Initial number of bogies: " + trainConsist.size());

        // Program continues...
>>>>>>> fadf2c3c623b9e895b97215b490086724d77bc51
    }
}