import java.util.*;

public class sortColors {
    public static void main(String[] args) {
        //        int[] nums = {2,0,2,1,1,0};
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int[] nums = new int[n];
            for(int i = 0; i < n; i++){
                nums[i] = sc.nextInt();
            }
            //Three pointer approach
            int l = 0, m = 0, h = n-1;
            while(m<=h) {
                if(nums[m] == 0)
                    swap(nums, l++, m++); //since it is 0, we push the element towards the front
                else if(nums[m] == 1)
                    ++m; //it will stay in the middle only so we just increase the counter
                else 
                    swap(nums, m, h--); //we push the element at the end of the array
            }
            System.out.println(Arrays.toString(nums));
        }
    }

    static void swap(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
