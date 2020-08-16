import java.util.*;
class GreaterTw
{
  public static void main(String args[])
  {
     int num1,num2;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter The Two Numbers:");
     num1=sc.nextInt();
     num2=sc.nextInt();
        if(num1>num2)
           {
              System.out.println("The First Number Is Greater Than The Second Number.");              
           }

        else if(num2>num1)
          {
             System.out.println("The Second Number Is Greater Than The First Number.");
          }

        else
         {
            System.out.println("Both are Equal.");
         }

 }

}



/*
Explanation:

Get two inputs num1 and num2 from user using scanner class

check whether num1 is greater than num2 using if statement.

if num1 is greater print num1 using system.out.println, else check whether num2 is greater than num1 using elseif statement.

If num2 is greater print num2 using printf statement, else print num1 and num2 are equal using system.out.println.

*/
