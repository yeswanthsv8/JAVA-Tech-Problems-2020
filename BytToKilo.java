import java.util.*;
class BytToKilo
{
   public static void main(String args[])
   {
       int kilobytes,bytes;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter The Bytes:");
       bytes=sc.nextInt();
       kilobytes=bytes/1024;
       System.out.println("The KiloBytes Is:"+kilobytes);
   }
}





/*
Exolanation;

Get bytes Byt as input (using scanner class) 

Calculate kilobytes Kilo by dividing bytes Byt by 1024. (kb=b/1024, 1024 byts is equal to 1 kilobyte)

Print kilobytes kb (using System.out.println)
*/

