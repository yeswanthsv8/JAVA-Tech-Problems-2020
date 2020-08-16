import java.util.*;
class Array
{
  public static void main(String args[])
  {
     int size,i;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Size Of Array:");
     size=sc.nextInt();
     int a[]=new int[100];
     System.out.println("Enter The Array Elements:\n");
     for(i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
	}
     System.out.println("The Array Elements are:\n");
     for(i=0;i<size;i++)
	{

	   System.out.println(""+a[i]);

	}
	


  }
}

/*
Explanation:

i is initialized to 0 and incremented by 1 at each iteration of both the for loops.

First for loop reads n input numbers from user and stores them in array a[] from location 0 to n-1

Second for loop prints the n elements of array located from 0 to n-1.
*/
