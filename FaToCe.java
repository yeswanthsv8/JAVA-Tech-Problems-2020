import java.util.*;
class FaToCe
{
   public static void main(String args[])
   {
       double fahreheit,celsius;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter The Fahrenheit:");
       fahreheit=sc.nextDouble();
       celsius=(fahreheit-32)*0.5556;
       System.out.println("The Celsius Is:"+celsius);
   }
}











/*
Explanation:

Get Fahrenheit  as input (using scanner class)

Calculate Celsius  using Formula celsius=(fahreheit-32)*0.5556

print Celcius  (using system.out.println).
*/
