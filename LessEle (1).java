import java.util.*;
class LessEle
{
  public static void main(String args[])
  {
     int size,i,num,j=0;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Size Of Array:");
     size=sc.nextInt();
     int a[]=new int[100];
     System.out.println("Enter The Array Elements:");
     for(i=0;i<size;i++)
        {
            a[i]=sc.nextInt();

	}
     System.out.println("Enter The Number:");
     num=sc.nextInt();
     System.out.println("The Array Elements Less Than That Of Number Is:");     
     for(i=0;i<size;i++)
        {
            if(a[i]<num)
              {
		j++;
                System.out.println(""+a[i]);
              }
         

        }
     if(j==0)
        {
           System.out.println("Zero.");
        }
                
  }
}






/*
Explanation;

i is initialized to 0 and incremented by 1 at each iteration of both the for loops.

First for loop reads n input numbers from user and stores them in array a[] from location 0 to n-1

using second for loop visit each  location serially from 1 to n-1. if the value located in a postion is lesser than the element given by user, then print the value using system.out.println statement.

*/
