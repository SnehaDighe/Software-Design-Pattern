package GroceryShoppingCart;

/**
 * Class to define product type : diary product.
 */
public class DiaryProducts implements GroceryItem {
  private int price; //price variable.
  private int weight; //weight variable.
  //initialize parameterized constructor.
  public DiaryProducts(int cost, int weight)
  {
    this.price=cost;
    this.weight=weight;
  }
  //Method to get price of the product.
  public int getPrice()
  {
    return price;
  }
  //Method to get weight of the product.
  public int getWeight()
  {
    return weight;
  }

  //Overriding accept method to use it for diary product.
  @Override
  public double accept(GroceryShoppingCartVisitor visitor)
  {
    return visitor.visit(this);
  }
}
