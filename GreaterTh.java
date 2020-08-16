import java.util.*;
class GreaterTh
{
       public static void main(String args[])
       {
           int num1,num2,num3;
           Scanner sc=new Scanner(System.in);
	      System.out.println("Enter three numbers:");
           num1=sc.nextInt();
           num2=sc.nextInt();
           num3=sc.nextInt();
              if((num1 > num2) && (num1 > num3))
	            {
		          System.out.println("The Greatest Is "+num1);
	            }
	         else if(num2 > num3)
	            {
		          System.out.println("The Greatest Is "+num2);
	            }
	         else
	            {
		          System.out.println("The Greatest Is "+num3);
	            }	
        }
	
}





/*
Explanation:

Get three inputs num1,num2 and num3 from user using scanner class

check whether num1 is greater than num2  and num1 is greater than num3 using if statement.

if num1 is greater print num1 using system.out.println, else check whether num2 is greater than num1 using elseif statement.

If num2 is greater print num2 using printf statement, else print num3 using system.out.println.

*/
