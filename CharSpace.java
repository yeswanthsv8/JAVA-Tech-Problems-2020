import java.util.*;

class CharSpace
{
  public static void main(String args[])
  {
	String str1;int len,i;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The String:");
	str1=sc.next();
	System.out.println("The Entered String Is:"+str1);
        len=str1.length();
        for(i=0;i<len;i++)
	{
		System.out.println("\t"+str1.charAt(i));
	}
  }
}


/*
Explanation:

First Intialise the str1 as the string,then intialise i and len where it represents length of the string.

Get the Input String 1.

Then Print the same String 1 with the tab(\t) space in the form of character.
*/
