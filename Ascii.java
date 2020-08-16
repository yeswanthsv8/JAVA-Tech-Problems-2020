import java.util.*;
class Ascii
{
 
    public static void main(String args[])
    {
       char ch;
       int ascii;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter The Character:");
       ch=sc.next().charAt(0);
       ascii=(int) ch;
       System.out.println("Equivalent Ascii Value:"+ascii);
    }

}




/*
Explanation:

scanner class is a function available(predefined) in java library to get input from user via keyboard and stores the same in a variable. Here it reads input character and stores it in a variable 

system.out.println is a function available(pre defined) in java library which is used to print the specified content in Monitor. Here it prints the value of the variable .

*/
