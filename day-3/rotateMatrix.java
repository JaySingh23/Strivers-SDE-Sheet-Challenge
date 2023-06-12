import java.util.*;

public class rotateMatrix {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            ArrayList<ArrayList<Integer>> mat = new ArrayList<ArrayList<Integer>>();
            for(int i = 0; i < n; i++) {
                List<Integer> in = new ArrayList<Integer>(n);
                for(int j = 0; j < n; j++) {
                    in.add(sc.nextInt());
                }
                mat.add(new ArrayList<>(in));
            }
            rotateMatrixHelper(mat, 0, n, 0, n);
            //print the array
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    System.out.print(mat.get(i).get(j));
                }
                System.out.println();
            }
        }
    }
   
    
    public static void rotateMatrixHelper(ArrayList<ArrayList<Integer>> mat, int rowStart, int rowEnd, int colStart, int colEnd) {
        if(rowStart>=rowEnd || colStart>=colEnd)
            return;
        if(rowStart>=rowEnd - 1 || colStart >= colEnd - 1) 
            return;
        
        int previous = mat.get(rowStart+1).get(colStart);
        int current = 0;
        int i;

        //move elements from first row to the remaining rows
        for(i = colStart; i<colEnd; i++) {
            current = mat.get(rowStart).get(i);
            mat.get(rowStart).set(i, previous);
            previous = current;
        }

        rowStart++;

        //move element from last column to the remaining columns
        for(i = rowStart; i<rowEnd; i++) {
            current = mat.get(i).get(colEnd-1);
            mat.get(i).set(colEnd-1, previous);
            previous = current;
        }

        colEnd--;

        //move element from last row to the remaining rows
        
            for(i = colEnd - 1; i>=colStart; i--) {
                current = mat.get(rowEnd-1).get(i);
                mat.get(rowEnd-1).set(i, previous);
                previous = current;
            }
        

        rowEnd--;

        //move element from first column to the remaining columns
       
            for(i = rowEnd-1; i>=rowStart; i--) {
                current = mat.get(i).get(colStart);
                mat.get(i).set(colStart, previous);
                previous = current;
            }
        

        colStart++;

        rotateMatrixHelper(mat, rowStart, rowEnd, colStart, colEnd);
    }
}
