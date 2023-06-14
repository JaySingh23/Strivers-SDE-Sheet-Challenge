import java.util.*;

public class mergeIntervals {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int[][] arr = {{1, 3}, {8, 10}, {2, 6}, {15, 18}};
            int[][] ans = mergeOverlappingIntervals(arr);
            System.out.print("The merged intervals are: \n");
            for (int[] it : ans) {
                System.out.print("[" + it[0] + ", " + it[1] + "] ");
            }
            System.out.println();
        }
    }

    static int[][] mergeOverlappingIntervals(int[][] arr) {
       
        List<int[]> res = new ArrayList<>();
        if(arr.length == 0)
            return null;
        
        //sort the array in ascending order
        Arrays.sort(arr , (a, b) -> a[0] - b[0]);

        int mergedInterval[] = arr[0];

        for(int[] interval : arr) {
            if(interval[0] <= mergedInterval[1])
                mergedInterval[1] = Math.max(interval[1], mergedInterval[1]);
            else {
                res.add(mergedInterval);
                mergedInterval = interval;
            }
        }

        res.add(mergedInterval);
        return res.toArray(new int[res.size()][]);
        
    }
}
