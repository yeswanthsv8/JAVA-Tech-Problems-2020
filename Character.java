import java.util.*;
class Character
{
 
 public static void main(String args[])
 {
 char ch;
 int ascii;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter The Ascii Value(0 to 255):");
 ascii=sc.nextInt();
 ch=(char)ascii; 
 System.out.println("Equivalent Character:"+ch);
 
 }

}



/*
Explanation:

scanner class is a function available(predefined) in java library to get input from user via keyboard and stores the same in a variable. Here it reads input number and stores it in a variable .

scanner class is used to get the output.

printf is a function available(pre defined) in C library which is used to print the specified content in Monitor. Here it prints the value of the variable num.

system.out.println is a function available(pre defined) in java library which is used to print the specified content in Monitor. Here it prints the value of the variable.

*/
