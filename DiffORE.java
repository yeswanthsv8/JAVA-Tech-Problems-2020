import java.util.*;
class DiffORE
{
  public static void main(String args[])
  { 
     int input1,input2,diff;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter The Input 1:");
     input1=sc.nextInt();
     System.out.println("Enter The Input 2:");
     input2=sc.nextInt();
     diff=input1-input2;
     if((diff)%2==0)
       {
	 System.out.println("The Difference is Even.");
       }

    else
      {
        System.out.println("The Difference is Odd.");
      }


  }
}



/*
Explanation:

Get two inputs input1 and input2 from user using scanner class.

Calculate difference between input1 and input2 using the expression
 difference = input1 - input2.

check whether the remainder of difference divided by 2 is equal to 0 using if statement.

if it is 0, then print difference is even using system.out.println. Else print difference is odd using system.out.println.
*/

