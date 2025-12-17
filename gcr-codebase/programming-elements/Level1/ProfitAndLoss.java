import java.util.*;
public class ProfitAndLoss{
	public static void main(String[] args){
	int costPrice = 129, sellingPrice = 191;
	
	//Variable for Calculation of Profit or Loss
	int profit = sellingPrice - costPrice;
	
	//Variable for Calculation of profit percentage
	double profitPercentage = ((double)profit / costPrice)* 100;
	
	//Display result
	System.out.println(" The Cost Price is INR " + costPrice + " and sellingPrice is INR " + sellingPrice);
	System.out.println(" The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);
	}
}
	