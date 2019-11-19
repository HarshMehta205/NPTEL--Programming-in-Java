/* Write a program to create a record by taking inputs using Scanner class as first name as string ,last name as string ,roll number as integer ,subject1 mark as float,subject2 mark as float. Your program should print in the format 
  "name  rollnumber avgmark".

For example:
input:
ram
das
123
25.5
24.5
output:
ramdas 123 25.0   */


import java.util.*;
public class Question3{
  public static void main(String[] args){
      Scanner s1 = new Scanner(System.in);
    //Read your first name in string
    
    //Read  your last name in string
   
     //Read  rollnumber in integer
    
    //Read  1st subject mark in float
    
    //Read  2nd subject mark in float
	
    // find the avg mark in the subject

    //Print the record in the format: name+" "+rollnumber+" "+avg_mark        
      String sumitnce=s1.nextLine();
String nce=s1.nextLine();

int roll=s1.nextInt();

double s1nce=s1.nextDouble();
double s2nce=s1.nextDouble();

double avg=(s1nce+s2nce)/2;

System.out.print(sumitnce+nce+" "+roll+" "+avg);


  }
}
