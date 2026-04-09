import java.util.Arrays;

public class BogieNameSorter {

    public static void main(String[] args) {

        String[] bogieNames = {
                "Sleeper", "AC Chair", "First Class", "General", "Luxury"
        };

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bogieNames));
        Arrays.sort(bogieNames);

        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        String[] test1 = {"Luxury", "General", "Sleeper", "AC Chair"};
        Arrays.sort(test1);
        System.out.println("Unsorted Input Sorted: " + Arrays.toString(test1));

        String[] test2 = {"AC Chair", "First Class", "General"};
        Arrays.sort(test2);
        System.out.println("Already Sorted: " + Arrays.toString(test2));

        String[] test3 = {"Sleeper", "AC Chair", "Sleeper", "General"};
        Arrays.sort(test3);
        System.out.println("Duplicates Sorted: " + Arrays.toString(test3));

        String[] test4 = {"Sleeper"};
        Arrays.sort(test4);
        System.out.println("Single Element: " + Arrays.toString(test4));
    }
}