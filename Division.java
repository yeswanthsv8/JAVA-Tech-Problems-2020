import java.util.*;
class Division
{
      public static void main(String args[])
      {
 
          int Input1,Input2,div;
          Scanner sc=new Scanner(System.in);

          System.out.println("Enter The  Input 1:");
          Input1=sc.nextInt();
          System.out.println("Enter The Input 2:");
          Input2=sc.nextInt();
          div=Input1/Input2;
          System.out.println("The Output Is:\n"+div);
       }

}


/*
Explanation:

Get two integers Input1 and Input2 (using scanner class)

divide Input1 by Input2, then store quotient in div (div=Input1/Input2, Note "/" operator gives quotient)

print the value of div (using system.out.println)

*/

