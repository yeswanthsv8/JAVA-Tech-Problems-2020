import java.util.*;
class LastDTh
{
  public static void main(String args[])
  {
     int input1,digit;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter The Input:");
     input1=sc.nextInt();
     digit=input1%10;
     if((digit)%3==0)
       {
          System.out.println("The Last Digit Is Divisible By 3.");
       }
    else
       {
          System.out.println("The Last Digit Is Not Divisible By 3.");
       }

  }

}




/*
Explanation:

Get input from user using scanner class

extract last digit from input1 using the expression digit=input1%10.

check whether the remainder of digit divided by 3 is equal to 0 using if statement.

if it is 0, then print digit is divisible by 3 using printf statement. Else print digit is not divisible by 3 using system.out.println.
*/
