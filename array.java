import java.util.Arrays;
import java.util.Scanner;
public class array {
  public static void main (String args[]) {
        Scanner in =new Scanner(System.in);
        System.out.println("arr:");
      int[]a =new int[9];
       String  ce=in.next();
    for (int i=0;i< ce.length();i++){
a[i]=Character.getNumericValue((ce.charAt(i)));
      
      // Assign Value to A
      
System.out.print(Arrays.toString(a));
// Print a Array

  }

  }
}