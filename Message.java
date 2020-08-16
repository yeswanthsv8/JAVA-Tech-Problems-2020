import java.util.*;
class Message
{
 
     public static void main(String args[])
     {
 
	    String Input1,Input2;
	    Scanner sc=new Scanner(System.in);
	
	    System.out.println("Get a Message from user and display the same.");
	
	    System.out.println("Enter The Input 1:");
	    Input1=sc.next();
	    System.out.println("The Output 1 Is:\n"+Input1);
	
	    System.out.println("Enter The  Input 2:");
	    Input2=sc.next();
	    System.out.println("The Output 2 Is:\n"+Input2);

      }

}



/*
Explanation;

Scanner is a function available(predefined) in java library to get input from user via keyboard and stores the same in a variable. Here it reads input string and stores it in a variable str1.

Scanner class is used get the input.

System.out.println is a function available(pre defined) in java library which is used to print the specified content in Monitor. Here it prints the value of the variable str1.

*/
