public class BogieSearchWithValidation {

    public static boolean searchBogie(String[] bogieIds, String key) {

        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available. Cannot perform search.");
        }

        for (String id : bogieIds) {
            if (id.equals(key)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        try {
            String[] empty = {};
            searchBogie(empty, "BG101");
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        String[] bogies = {"BG101", "BG205", "BG309"};

        System.out.println("\nSearch BG205: " +
                searchBogie(bogies, "BG205")); // true

        System.out.println("Search BG999: " +
                searchBogie(bogies, "BG999")); // false

        String[] single = {"BG101"};
        System.out.println("Single Element Search: " +
                searchBogie(single, "BG101")); // true
    }
}