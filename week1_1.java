//to find the perimeter and area of a circle given a value of radius.You should use Math.PI constant in your program.If radius is zero or less than zero then print " please enter non zero positive number ".


import java.util.Scanner;  
public class Exercise1_1 {
       public static void main(String[] args) {
Scanner s = new Scanner(System.in); 
       double radius= s.nextDouble();
       double perimeter;
       double area;
//Calculate the perimeter 
  //Calculate the area
	   area = (radius * radius) * Math.PI;
       System.out.println(area);
        
       perimeter = radius * Math.PI * 2;
       System.out.print(perimeter);
  }
}
