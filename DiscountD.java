import java.util.*;
class DiscountD
{
    public static void main(String args[])
    {
        double quantity,price,amount,discount;
 	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Price Of The Product:");
	price=sc.nextDouble();
        System.out.println("Enter The No Of Quantity:"); 
	quantity=sc.nextDouble();  
	amount=quantity*price;

	if(amount>5000)

	{

		discount=amount*0.05;

	}
     else if(amount > 1000)
	{
		discount=amount*0.05;

	}
	else
	{
		discount=0;
	}
	amount=amount-discount;
	System.out.println("The Total Amount is:"+amount);
	

   }
}




/*
Explanation;

chained conditional check is used here to check whether amount is greater than 1000 or greater than 5000. any one of the expression to calculate discount will be executed.

*/



