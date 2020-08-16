import java.util.*;
class LarArr
{
  public static void main(String args[])
  {
     int size,i,num;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Size Of Array:");
     size=sc.nextInt();
     int a[]=new int[100];
     System.out.println("Enter The Array Elements:\n");
     for(i=0;i<size;i++)
        {
            a[i]=sc.nextInt();

	}
     int max=a[0];
     for(i=0;i<size;i++)
        {
            if(a[i]>max)
              {
                max=a[i];
              }

       }
       System.out.println("The Largest Element In The Array Is:"+max);
  }
}





/*
Explanation:

i is initialized to 0 and incremented by 1 at each iteration of both the for loops.

First for loop reads n input numbers from user and stores them in array a[] from location 0 to n-1

assign the element located at 0 to max using max = a[0].

using second for loop  visit each  location serially from 1 to n-1. if the element located in any position is greater than max,  then assign the element as max by using max = a[i] 

finally max holds the maximum value in the list.
*/
