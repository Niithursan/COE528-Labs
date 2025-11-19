package lab4;

import java.util.ArrayList;

/**
 * @author nithy
 */
public class FoodCategory extends FoodComponent
{
	protected ArrayList<FoodComponent> components = new ArrayList();
	private double totalPrice;

	// Constructor
	public FoodCategory(String NameCategory)
	{
		this.name = NameCategory;
	}

	@Override
	public double getPrice()
	{
		this.totalPrice = 0;
		
		for(FoodComponent c: this.components)
			this.totalPrice += c.getPrice();

		return this.totalPrice;
	}

	@Override
	public void print(int level)
	{
		for(int i = 0; i < level; i++)
			System.out.print("\t");

		System.out.print("FoodCategory: (" + this.name + ", " + this.getPrice() + ") contains: \n");

		for(int i = 0; i < this.components.size(); i++)
			this.components.get(i).print(level + 1);
	}

	public void add(FoodComponent c)
	{
		this.components.add(c);
	}

	public void remove(FoodComponent c)
	{
		this.components.remove(c);
	}
}
