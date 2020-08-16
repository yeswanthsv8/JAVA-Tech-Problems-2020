import java.util.*;
class FraTd
{
public static void main(String args[])
{
 
	float num;
        Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Fractional Number:");
	num=sc.nextFloat();
       
	System.out.format("The Entered number in 2digit Precision Is: %.2f",num);
	
}
}




/*
Explanation:

scanner class is a function available(predefined) in java library to get input from user via keyboard and stores the same in a variable. Here it reads input number and stores it in a variable num.

Format Specifier "%.2f" reads input as floating number. (fractional number)

system.out.println is a function available(pre defined) in java library which is used to print the specified content in Monitor. Here it prints the value of the variable num.

Format Specifier "%.2f" prints value as Floating Point Number with 2digit Precision(.00).
*/
