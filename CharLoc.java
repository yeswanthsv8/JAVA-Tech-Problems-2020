import java.util.*;

class CharLoc
{
  public static void main(String args[])
  {
	String str1;int len,i;char ch;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The String:");
	str1=sc.next();
        System.out.println("Enter The Character:");
        ch=sc.next().charAt(0);
        len=str1.length();
        for(i=0;i<len;i++)
	{   
		if(str1.charAt(i)==ch)
		  {
			System.out.println("The Position Is:"+i);
		  }
		
	}
  }
}


/*
Explanation:

First Intialise the str1 as the string,then intialise i & ch(Character) and len where it represents length of the string.

Get the Input String 1 and also get the input of the Character.

Next compare the String's Characters with their given character.

If Their exists,print that position.
*/
