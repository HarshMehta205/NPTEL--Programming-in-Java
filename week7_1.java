//Complete the following code fragment to read three integer values from the keyboard and find the sum of the values. Declare a variable "sum" of type int and store the result in it.

// Write the appropriate statement(s) to import the package(s) you need in your program
import java.util.*;
public class Question1{ 
        public static void main (String[] args){

//Write the appropriate code to read the 3 integer values and find their sum.
 
          Scanner sc = new Scanner(System.in);
          int n1=sc.nextInt();
          int n2=sc.nextInt();
          int n3=sc.nextInt();
          int sum=n1+n2+n3;
 System.out.println(sum);
  }
}
