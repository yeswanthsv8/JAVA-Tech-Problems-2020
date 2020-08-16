import java.util.*;
class KiloToByt
{
   public static void main(String args[])
   {
       int kilobytes,bytes;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter The KiloBytes:");
       kilobytes=sc.nextInt();
       bytes=kilobytes*1024;
       System.out.println("The Bytes Is:"+bytes);
   }
}





/*
Explanation:

Get kilobytes Kilo as input (using scanner class) 

Calculate bytes Byt by multipllying kilobytes  with 1024. (Byt=Kilobyte*1024, 1024 byts is equal to 1 kilobyte)

Print bytes Byt (using system.out.println)
*/
