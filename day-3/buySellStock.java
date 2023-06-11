import java.util.*;

public class buySellStock {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int prices[] = new int[n];
            for(int i = 0; i<n; i++) {
                prices[i] = sc.nextInt();
            }
            int min = Integer.MAX_VALUE, current = 0, overall = 0;
            for(int i = 0; i<n; i++) {
                if(prices[i] < min) 
                    min = prices[i];
                current = prices[i] - min;
                if(current > overall)
                    overall = current;
            }
            System.out.println(overall);
        }
    }
}
