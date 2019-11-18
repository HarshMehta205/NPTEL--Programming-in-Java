// check whether the number is an Armstrong number or not


import java.util.Scanner;
public class Exercise1_4 {
    public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
           int result=0;
//Use while loop check the number is Armstrong or not.
//store the output(1 or 0) in result variable.
	   int remainder=0;
       int sum=0;
	   int num=n;
	   int nn = n;
        int cnt = 0;
	  while(nn!=0)
	   {
		nn=nn/10;
		cnt++;
	   }
	   while(num!=0)
		{
			remainder=num%10;
			remainder=(int)Math.pow(remainder,cnt);
			sum+=remainder;
			num=num/10;
		}
	   if(sum==n)
		{
			result++;
			System.out.print(result);
		}
	   else
		{
			System.out.print(result);
		}
 }
}
