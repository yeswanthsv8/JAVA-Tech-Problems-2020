import java.util.*;
class MtsToKm
{
 
      public static void main(String args[])
      {
 
           int km,metres;
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter The Input 1:");
           metres=sc.nextInt();
           km=metres*1000;
           System.out.println("The Output 1 Is:\n"+km);

      }

}




/*
Explanation:

Get meter mts as input  (using scanner class)

Calculate kilometer km by dividing meter  mts by 1000. (km=mts/1000, 1000 meter is equal to 1 kilometer)

*/
