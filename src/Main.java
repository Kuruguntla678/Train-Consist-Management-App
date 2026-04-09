import java.util.Arrays;

public class BogieBinarySearchApp {

    public static boolean binarySearch(String[] bogieIds, String key) {

        if (bogieIds.length == 0) {
            return false;
        }

        Arrays.sort(bogieIds);

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = key.compareTo(bogieIds[mid]);

            if (result == 0) {
                return true;
            } else if (result > 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        String searchKey = "BG309";

        boolean found = binarySearch(bogieIds, searchKey);

        if (found) {
            System.out.println("Bogie ID " + searchKey + " found.");
        } else {
            System.out.println("Bogie ID " + searchKey + " not found.");
        }

        System.out.println("\nTest Cases:");

        System.out.println("Search BG999: " +
                binarySearch(bogieIds, "BG999"));

        System.out.println("Search BG101: " +
                binarySearch(bogieIds, "BG101"));

        System.out.println("Search BG550: " +
                binarySearch(bogieIds, "BG550"));

        String[] single = {"BG101"};
        System.out.println("Single Element Search: " +
                binarySearch(single, "BG101"));

        String[] empty = {};
        System.out.println("Empty Array Search: " +
                binarySearch(empty, "BG101"));

        String[] unsorted = {"BG309", "BG101", "BG550", "BG205", "BG412"};
        System.out.println("Unsorted Input Search BG205: " +
                binarySearch(unsorted, "BG205"));
    }
}