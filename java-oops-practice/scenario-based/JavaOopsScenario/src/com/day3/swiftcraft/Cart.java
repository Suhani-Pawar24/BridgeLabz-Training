package com.day3.swiftcraft;
import java.util.List;
import java.util.ArrayList;
class Cart implements ICheckout 
{
	private List<Product> products;
	private double totalPrice;
	
	Cart()
	{
		this.products = new ArrayList<>();
	}
	
	Cart(List<Product> items)
	{
		this.products = items;
		calculateTotal();
	}
	
	public void addProduct(Product p)
	{
		products.add(p);
		calculateTotal();
	}
	
	public void calculateTotal()
	{
		totalPrice = 0;
		for(Product p : products)
		{
			totalPrice += p.getFinalPrice();
		}
	}
	@Override
    public double applyDiscount(double coupon)
	{
        totalPrice = totalPrice - coupon; 
        return totalPrice;
    }

    @Override
    public void generateBill() 
    {
        System.out.println("Total: " + totalPrice);
    }
	
}
