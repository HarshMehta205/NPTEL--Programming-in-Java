//The following program reads a string from the keyboard and is stored in the String variable "s1". You have to complete the program so that it should should print the number of vowels in s1 . If your input data doesn't have any vowel it will print "0".

import java.io.*;
import java.util.*;

public class Question4{  
    public static void main(String[] args) { 
	  int c=0;
         try{
            InputStreamReader r=new InputStreamReader(System.in);  
            BufferedReader br=new BufferedReader(r);  
            String s1 = br.readLine();
  //Write your code here to count the number of vowels in the string "s1"  
for(int i=0;i<s1.length() ;i++)
{
 if(s1.charAt(i)=='a' || s1.charAt(i) =='A'|| s1.charAt(i)=='e' || s1.charAt(i) =='E' ||s1.charAt(i)=='i' || s1.charAt(i) =='I'||s1.charAt(i)=='o' || s1.charAt(i) =='O'|| s1.charAt(i)=='u' || s1.charAt(i) =='U')
   c++;
}
     
      System.out.println(c); 
	   }
       catch (Exception e){
		 System.out.println(e);
	    }	   
    }  
}  
