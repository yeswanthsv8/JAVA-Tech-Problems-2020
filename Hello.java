import java.util.*;
class Hello
{
   public static void main(String args[])
   {
	int lim,i;
        Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Limit:");
	lim=sc.nextInt();
	for(i=1;i<=lim;i++)
	{ 
		System.out.println("Hello World ");
	}
  }
}


/*
Explanations:

Instruction(s) inside the for block{} are executed repeatedly till  the second expression (i<=lim) is true.

Here i is initialized to 1 and incremented by 1 for each iteration, instructions inside the for block are executed unless i becomes greater than lim. so the string literal "Hello World" will be printed n times.


*/
