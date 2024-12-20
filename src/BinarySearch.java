import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={12,18,25,30,34,45,51,59,64,70};
        System.out.println(binarySearch(arr,100));
    }
    public static int binarySearch(int[] arr,int item)
    {
        int low=0;
        int high=arr.length-1;
        while (low <= high)
        {
            int mid=(low+high)/2;
            int guess=arr[mid];
            if(guess==item)
                return mid;
            else if (guess>item)
                high=mid-1;
            else low=mid+1;
        }
        return 404;
    }
}
