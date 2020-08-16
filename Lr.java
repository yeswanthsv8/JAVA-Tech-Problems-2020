//To Print All The English Alphabets In Upper Case...

//To Print Lower Case English Alphabets In Reverse...

import java.util.*;

class Lr
{
  public static void main(String args[])
   {
      int i;
      char ascii;
      Scanner sc=new Scanner(System.in);

     System.out.println("The Alphabets In Lower Case In Reverse:");
     for(i=122;i>=97;i--)
       {
           ascii=(char)i;
           System.out.println(" "+ascii);
      }

  }
}