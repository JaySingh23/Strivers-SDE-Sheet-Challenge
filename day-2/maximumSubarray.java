import java.util.*;

public class maximumSubarray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int nums[] = new int[n];
            for (int i = 0; i < n; i++) 
                nums[i] = sc.nextInt();
            int sum = 0, maxSum = 0;
            for(int i= 0;i<n;i++) {
                sum += nums[i];
                if(sum<0)
                    sum = 0;       //we exclude the subarray when the sum goes below 0
                
                maxSum = Math.max(sum, maxSum);
            }
            System.out.println(maxSum);
        }
    }
}
