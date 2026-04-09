public class BogieSearchApp {

    public static boolean linearSearch(String[] bogieIds, String key) {

        for (int i = 0; i < bogieIds.length; i++) {

            if (bogieIds[i].equals(key)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        String searchKey = "BG309";

        boolean found = linearSearch(bogieIds, searchKey);

        if (found) {
            System.out.println("Bogie ID " + searchKey + " found.");
        } else {
            System.out.println("Bogie ID " + searchKey + " not found.");
        }


        System.out.println("\nTest Cases:");

        System.out.println("Search BG999: " +
                linearSearch(bogieIds, "BG999"));

        System.out.println("Search BG101: " +
                linearSearch(bogieIds, "BG101"));

        System.out.println("Search BG550: " +
                linearSearch(bogieIds, "BG550"));

        String[] single = {"BG101"};
        System.out.println("Single Element Search BG101: " +
                linearSearch(single, "BG101"));
    }
}