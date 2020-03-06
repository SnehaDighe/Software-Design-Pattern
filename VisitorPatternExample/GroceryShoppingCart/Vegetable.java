package GroceryShoppingCart;

/**
 * Vegetable class : to define details related to Vegetable itetm.
 */
public class Vegetable implements GroceryItem{
  private int pricePerKg; //variable for price per kg.
  private int weight;//variable for weight in kg.
  private String name;//variable for vegetable name.

  //Initialize constructor for Vegetable with parameters.
  public Vegetable(int priceKg, int wt, String nm)
  {
    this.pricePerKg=priceKg;
    this.weight=wt;
    this.name = nm;
  }

  //Method to get price per kg of vegetables.
  public int getPricePerKg()
  {
    return pricePerKg;
  }

  //Method to get weight in kg for the vegetables.
  public int getWeight()
  {
    return weight;
  }

  //Method to get name of the vegetable.
  public String getName()
  {
    return this.name;
  }

  //Method to override accept method to make it specific to vegetable class.
  @Override
  public double accept(GroceryShoppingCartVisitor visitor)
  {
    return visitor.visit(this);
  }
}
