import java.util.*;

public class pascalTriangle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
            for(int i = 0;i<n;i++) {
                ArrayList<Integer> row = new ArrayList<Integer>();
                for(int j = 0;j<i+1;j++) {
                    if(j==0 || j == i)
                        row.add(1);
                    else {
                        int a = arr.get(i-1).get(j-1);
                        int b = arr.get(i-1).get(j);
                        row.add(a+b);
                    }
                }
                arr.add(row);
            }
            System.out.println(arr);
        }
    }
}