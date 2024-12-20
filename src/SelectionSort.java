import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Original Array");
        printArray(arr);
        selectionSort(arr);
        System.out.println("Sorted array:");
        printArray(arr);
    }
    public static void selectionSort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            int minIndex=i;

            for (int j = i+1; j <arr.length ; j++) {
                if(arr[j] < arr[minIndex]) minIndex=j;
            }
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
    }
    public static void printArray(int[] arr)
    {
        for (int i:arr) {
            System.out.println(i);
        }
        System.out.println();
    }
}
