import java.util.*;
class Alies
{
    public static void main(String args[])
    {
        char i;
	char start,stop;
        Scanner sc=new Scanner(System.in);	
        System.out.println("Enter Two Alphabets:");
	start=sc.next().charAt(0);
        stop=sc.next().charAt(0);
	System.out.println("The Output Is:");
	for(i=start;i<=stop;i++)
	  {
		System.out.println(""+i);
	  }
    }
}


/*
Explanaton:

Instruction(s) inside the for block{} are executed repeatedly till  the second expression is true.

Here i is initialized to start and incremented by 1 for each iteration, instructions inside the for block are executed unless i becomes greater than stop. so value of i will be printed as character like d e f g h using system.out.println statement



*/
