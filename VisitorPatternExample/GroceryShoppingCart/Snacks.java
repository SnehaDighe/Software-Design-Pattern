package GroceryShoppingCart;

/**
 * Class Snacks : To define the details of snack item.
 */
public class Snacks implements GroceryItem {
  private int price; //price variable.
  private int totalItems; //no. of items variable.
  private String name; //name of snack variable.

  //parameterized constructor initialization.
  public Snacks(int price, int totalItems, String nm)
  {
    this.price=price;
    this.totalItems=totalItems;
    this.name = nm;
  }

  //Method to get the price of snack.
  public int getPrice()
  {
    return price;
  }

  //Method to get total no. of items related to snack in cart.
  public int getNoOfItems()
  {
    return totalItems;
  }

  //Method to get the name of snack.
  public String getName()
  {
    return this.name;
  }

  //Overriding accept method to make it specific to Snack class.
  @Override
  public double accept(GroceryShoppingCartVisitor visitor)
  {
    return visitor.visit(this);
  }
}
