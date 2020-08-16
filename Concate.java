import java.util.*;
class Concate
{
 public static void main(String args[])
 {
   String str1,str2,str3;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter The First String:");
   str1=sc.next();
   System.out.println("Enter The Second String:");
   str2=sc.next();
   str3=str1.concat(str2);
      
   System.out.println("Now The String Is:"+str3);

 }
}

/*
Explanation:

First declare the str1 and str2 with string .

Get the two inputs string 1 and string 2.

Concate the both string 1 and string 2.

Then the Concatenation of two strings should be stored in string 3.

Print the String 3.
*/
