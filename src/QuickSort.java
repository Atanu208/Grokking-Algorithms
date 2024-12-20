public class QuickSort {
    public static void quicksort(int[] arr, int begin, int end) {
        if (begin < end) {
            // Find the partition index
            int partition = findPartition(arr, begin, end);
            // Recursively sort the left part
            quicksort(arr, begin, partition - 1);
            // Recursively sort the right part
            quicksort(arr, partition + 1, end);
        }
    }

    public static int findPartition(int[] arr, int begin, int end) {
        // Take the last element as pivot
        int pivot = arr[end];
        // Index of smaller element
        int i = begin - 1;
        for (int j = begin; j < end; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, end);
        return i + 1;
    }

    public static void swap(int[] arr, int ind1, int ind2) {
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {4, 9, 2, 5, 7, 1, 6, 8, 3};
        quicksort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
