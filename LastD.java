import java.util.*;
class LastD
{
  public static void main(String args[])
  {
     int input1,digit;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter The Input:");
     input1=sc.nextInt();
     digit=input1%10;
     System.out.println("The Last Digit is:"+digit);
  }

}



/*
Explanation:

Get a input input1 (using scanner class)

Seprate the last digit of number num by "digit = input%10". (% by 10 always gives last digit of a number)

print the digit (using system.out.println)
*/
