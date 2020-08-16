import java.util.*;
class KmToMts
{
 
     public static void main(String args[])
     {
 
          int km,metres;
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter The Input 1:");
          km=sc.nextInt();
          metres=km*1000;
          System.out.println("The Output 1 Is:\n"+metres);

      }

}


/*
Explanation :

Get kilometer km as input (using scanner class)  (since kilometer may be in fractional values like 1 and 5, it is declared & read as integer.) 

Calculate meter m by multipllying kilometer km with 1000. (m=km*1000, 1000 meter is equal to 1 kilometer)

print meter m. (using system.out.println)

*/



