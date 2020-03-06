package GroceryShoppingCart;

public class GroceryShoppingClient {

  /**
   * Method to calculate the total cost of items in the shopping cart.
   * @param items
   * @return
   */
  public static double calculatePrice(GroceryItem[] items)
  {
    GroceryShoppingCartVisitor visitor = new GroceryShoppingVisitor();
    double sum=0;
    for(GroceryItem item : items)
    {
      sum = sum + item.accept(visitor); //calculating total cost of items.
    }
    return sum;
  }
}
