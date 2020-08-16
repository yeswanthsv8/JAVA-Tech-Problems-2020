import java.util.*;
class Modulus
{
     public static void main(String args[])
     {
 
         int Input1,Input2,mod;
         Scanner sc=new Scanner(System.in);

         System.out.println("Enter The Input 1:");
         Input1=sc.nextInt();
         System.out.println("Enter The Input 2:");
         Input2=sc.nextInt();
         mod=Input1%Input2;
         System.out.println("The Output Is:\n"+mod);
      }

}



/*
Explanation:

Get two integers Input1 and Input2 (using scanner class)

divide Input1 by Input2 , then store quotient in mod (mod=Input1%Input2 , Note "%" operator gives remainder)

print the value of mod (using system.out.println)

*/
