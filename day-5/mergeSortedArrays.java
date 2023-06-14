import java.util.*;

public class mergeSortedArrays {
    public static void main(String[] args) {
        int arr1[] = new int[]{2, 4, 6, 0, 0};
        int arr2[] = new int[]{1, 3};
        int m = 3, n = 2;
        //logic starts

        int i = m-1;
        int j = n-1;
        int lastIndex = m + n - 1;
        while (j>=0) {
            if(i>=0 && arr1[i]>arr2[j]) {
                arr1[lastIndex] = arr1[i];
                i--;
            }
            else {
                arr1[lastIndex] = arr2[j];
                j--;
            }
            lastIndex--;
        }
        System.out.println(Arrays.toString(arr1));
    }
}
