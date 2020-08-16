import java.util.*;
class CeToFa
{
   public static void main(String args[])
   {
       double fahreheit,celsius;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter The Celsius:");
       celsius=sc.nextDouble();
       fahreheit=celsius*1.8+32;
       System.out.println("The Fahreheit Is:"+fahreheit);
   }
}











/*
Explanation:

Get celsius as input (using scanner class)

Calculate fahreheit  using Formula fahreheit=celsius*1.8+32;

print fahreheit  (using system.out.println).
*/
