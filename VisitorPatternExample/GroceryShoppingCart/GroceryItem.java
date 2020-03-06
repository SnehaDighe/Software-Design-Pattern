package GroceryShoppingCart;

/**
 * Element Interface : Interface for Grocery Item.
 */
public interface GroceryItem {
  public double accept(GroceryShoppingCartVisitor visitor);
}
