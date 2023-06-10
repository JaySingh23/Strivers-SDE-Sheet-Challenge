import java.util.*;

public class nextPermutation {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int nums[] = new int[n];
            for(int i = 0;i<n;i++) 
                nums[i] = sc.nextInt();
            
            int index1 = -1, index2 = -1;

            //get the breakpoint 
            for(int i = n-2;i>=0;i--) {
                if(nums[i]<nums[i+1]) {
                    index1 = i;
                    break;
                }
            }

            //if breakpoint not present
            if(index1 == -1)
                reverse(nums, 0);
            
            //find the number greater than that of breakpoint
            else {
                for(int i = nums.length-1;i>=0;i--) {
                    if(nums[i]>nums[index1]) {
                        index2 = i;
                        break;
                    }
                }

                swap(nums, index1, index2);
                reverse(nums, index1+1);
            }

            System.out.println(Arrays.toString(nums));
        }
    }

    static void swap(int nums[], int i1, int i2) {
        int temp = nums[i1];
        nums[i1] = nums[i2];
        nums[i2] = temp;
    }

    static void reverse(int nums[], int start) {
        int end = nums.length-1;
        while(start<=end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
