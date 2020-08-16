import java.util.*;
class Fractional
{
      public static void main(String args[])
      {
          float Input1,Input2; 
          Scanner sc= new Scanner(System.in);
          System.out.println("Enter The  Input1 :");
          Input1= sc.nextFloat();
          System.out.println("The Output1 Is:\n"+Input1);
      }
}
   



/*
Explanation :

Scanner is a function available(predefined) in java library to get input from user via keyboard and stores the same in a variable. Here it reads input number and stores it in a variable num.

Format Specifier "%f" reads input as floating number. (fractional number)

System.out.println is a function available(pre defined) in java library which is used to print the specified content in Monitor. Here it prints the value of the variable num.

Format Specifier "%f" prints value as Floating Point Number.


*/
