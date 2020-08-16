import java.util.*;
class LowCase
  {
      public static void main(String args[])
      {
          char i;
          for(i='a';i<='z';i++)
            {
                  System.out.println(""+i);
            }
       }
}






/*
Explanation;

Instruction(s) inside the for block{} are executed repeatedly till  the second expression is true.

Here i is initialized to a (97) and incremented by 1 for each iteration, instructions inside the for block are executed unless i becomes greater than z(122). so value of i will be printed as character like a,b,c...z using printf statement and format specifier %c.
*/
