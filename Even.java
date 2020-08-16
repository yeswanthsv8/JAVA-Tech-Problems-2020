import java.util.*;
class Even
{
    public static void main(String args[])
    {
      int lim,i;
	 System.out.println("Enter The Limit:");
	 Scanner sc=new Scanner(System.in);
      lim=sc.nextInt();
	 System.out.println("The Even Number Is:\n");
	  for(i=0;i<=lim;i=i+2)
	    {
		System.out.println(""+i);
	    }
     }
}




/*
Explanation:

Instruction(s) inside the for block{} are executed repeatedly till  the second expression (i<=lim) is true.

Here i is initialized to 1 and incremented by 2 for each iteration, instructions inside the for block are executed unless i becomes greater than lim.  so value of i will be printed like 2 4 6  .... (n-1) or n using system.out.println.
*/
