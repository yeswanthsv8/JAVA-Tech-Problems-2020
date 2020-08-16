import java.util.*;
class Compare
{
 public static void main(String args[])
 {
   String str1,str2;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter The First String:");
   str1=sc.next();
   System.out.println("Enter The Second String:");
   str2=sc.next();
   if(str1.equals(str2))
   {
      System.out.println("Both are Equal.");
   }

   else
   {
      System.out.println("Not Equal.");
   }

 }
}

/*
Explanation:

First declare the str1 and str2 with string .

Get the two inputs string 1 and string 2.

Compare them,if they are Equal display them with their message.

Otherwise,display them which is not equal.
*/
