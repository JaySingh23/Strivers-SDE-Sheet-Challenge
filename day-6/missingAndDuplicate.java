public class missingAndDuplicate {
    public static void main(String[] args) {
      int array[] = {3,1,2,5,4,6,7,5};
      int n = array.length;
      int newArr[] = new int[n+1];

      for(int i = 0;i<n;i++)
        newArr[array[i]]++;

        int repeating = -1, missing  = -1;
      
      for(int i = 1; i<=n; i++) {
        if(newArr[i] == 2)
            repeating = i;
        else if(newArr[i] == 0)
            missing = i;

        if(repeating != -1 && missing != -1)
            break;
      }
      System.out.println(repeating + " " + missing);
    } 
}
