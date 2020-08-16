import java.util.*;
class DivThree
{

  public static void main(String args[])
  {
    int num;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter The Number:");
    num=sc.nextInt();

    if(num%3==0)
       System.out.println("The Number Is Divisible By 3.");

    else
    {
       System.out.println("The Number Is Not Divisible By 3.");
    }

  }

}




/*
Explanation:

Get input num from user using scanner class.

check whether the remainder of num divided by 3 is equal to 0 using if statement.

if it is 0, then print num is divisible by 3 using system.out.println. Else print num is not divisible by 3 using system.out.println.
*/
