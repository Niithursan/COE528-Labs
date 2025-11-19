package lab4;

/**
 * @author nithy
 */
public class FoodItem extends FoodComponent
{
	private double itemPrice;

	public FoodItem(String itemName, double itemPrice)
	{
		this.name = itemName;
		this.itemPrice = itemPrice;
	}

	@Override
	public double getPrice()
	{
		return this.itemPrice;
	}

	@Override
	public void print(int level)
	{
		for (int i = 0; i < level; i++)
			System.out.print("\t");

		System.out.print("FoodItem: " + this.name + ", " + this.getPrice() + "\n");
	}

}
