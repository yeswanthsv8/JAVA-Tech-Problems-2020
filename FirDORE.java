import java.util.*;
class FirDORE
{
  public static void main(String args[])
  {
        int num;
	Scanner sc=new Scanner(System.in);	
	System.out.println("Enter The Number:");
	num=sc.nextInt();
	while(num>=10)
	{
		num=num/10;
	}
	

	if(num%2==0)
	{
		System.out.println("The First Digit Is Even.");
	}
	else
	{
		System.out.println("The First Digit Is Odd.");
	}

  }

}



/*
Explanation:

Instruction(s) inside the while block{} are executed repeatedly till  expression  (num>=10)  is true.

Divide the number num by 10 untill it becomes lesser than 10. once it is less than 10 check whether the num is odd or even.

statement num = num/10 divides the num by 10 repeatedly untill it num is less than 10.
*/

