//to calculate sum of  all the numbers divisible by 3 from 0 to n.Print the sum.
//Example:
//Input: n = 5
//-------
//0 2 4 6 8
//Even number divisible by 3:0 6
//sum:6


import java.util.Scanner;
public class Exercise1_3 {
       public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
	  int sum=0;
      int count=0;
	  	for (int i = 1; i <= n; i++)	
        {
			if(count%3==0)
			{
				sum += count;  
        			count += 2; 
			}
			else
				count+=2;
		}
	   System.out.print(sum);

 }
}
