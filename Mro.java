// To Find The Multiplication Of N Till The M rows...

import java.util.*;

class Mro
{
  public static void main(String args[])
  {
      int table,times,i,result;
      Scanner sc=new Scanner(System.in);

     System.out.println("Enter The Table:");
     table=sc.nextInt();

      System.out.println("Enter The Times:");
      times=sc.nextInt();

      System.out.println("The Output Is:");
      for(i=1;i<=times;i++)
      {
            result=table*i;
            System.out.println(" "+result);
     }

  }
}