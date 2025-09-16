import java.util.Random;

public class SortingGraph {
    public static void main(String[] args) {
        int[] sizes = {100, 500, 1000, 5000, 10000}; // input sizes to test

        for (int n : sizes) {
            int[] arr = generateArray(n);

            // Bubble Sort
            int[] copy1 = arr.clone();
            long start = System.nanoTime();
            bubbleSort(copy1);
            long end = System.nanoTime();
            System.out.println("Bubble," + n + "," + (end - start));

            // Quick Sort
            int[] copy2 = arr.clone();
            start = System.nanoTime();
            quickSort(copy2, 0, copy2.length - 1);
            end = System.nanoTime();
            System.out.println("Quick," + n + "," + (end - start));

            // TODO: Add Merge Sort, Selection Sort, etc. in same way
        }
    }

    static int[] generateArray(int n) {
        Random rand = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = rand.nextInt(10000);
        return arr;
    }

    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high], i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}
