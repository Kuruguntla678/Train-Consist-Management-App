import java.util.ArrayList;
import java.util.List;

class GoodsBogie {
    String type;
    String cargo;

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return type + " Bogie carrying " + cargo;
    }
}

public class GoodsBogieSafetyCheck {

    public static void main(String[] args) {
        List<GoodsBogie> goodsBogies = new ArrayList<>();
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Box", "Coal"));
        goodsBogies.add(new GoodsBogie("Open", "Grain"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));

        boolean isSafe = goodsBogies.stream()
                .allMatch(b -> {
                    if (b.type.equalsIgnoreCase("Cylindrical")) {
                        return b.cargo.equalsIgnoreCase("Petroleum");
                    }
                    return true; // Other types are flexible
                });

        System.out.println("Goods bogie safety compliance: " + (isSafe ? "SAFE" : "UNSAFE"));

        goodsBogies.forEach(System.out::println);
    }
}