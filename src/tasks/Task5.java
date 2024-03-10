package tasks;

public class Task5 {
    // сортировка массива целых чисел с помощью сортировки пузырьком.
    // sorting an array of integers using bubble sort
    public static void main(String[] args) {
        int[] array = {5, 1, 4, 2, 8};

        printArray(array);

        // variant 1
        boolean isSorted = false;
        int steps = 0;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    steps++;
                    isSorted = false;
                }
            }
        }
        printArray(array);
        System.out.println(steps);
        System.out.println("----------------------");


        // variant 2
        int[] array2 = {5, 1, 4, 2, 8};
        printArray(array2);
        int steps2;
        boolean isSorted2 = false;
        do {
            steps2 = 0;
            for (int i = 0; i < array2.length - 1; i++) {
                if (array2[i] > array2[i + 1]) {
                    int temp = array2[i];
                    array2[i] = array2[i + 1];
                    array2[i + 1] = temp;
                    steps2++;
                }
            }
        } while (steps2 > 0);
        printArray(array2);
        System.out.println(steps);
    }


    public static void printArray(int[] array) {
        System.out.print("{ ");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println(" }");
    }
}
