class PassengerBogieSorter {

    public static void bubbleSort(int[] capacities) {
        int n = capacities.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (capacities[j] > capacities[j + 1]) {

                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }
    }

    public static void display(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("Before Sorting:");
        display(capacities);

        bubbleSort(capacities);

        System.out.println("After Sorting:");
        display(capacities);

        int[] duplicate = {72, 56, 56, 24};
        bubbleSort(duplicate);
        System.out.print("Duplicate Sorted: ");
        display(duplicate);

        int[] single = {50};
        bubbleSort(single);
        System.out.print("Single Element: ");
        display(single);

        int[] equal = {40, 40, 40};
        bubbleSort(equal);
        System.out.print("All Equal: ");
        display(equal);
    }
}