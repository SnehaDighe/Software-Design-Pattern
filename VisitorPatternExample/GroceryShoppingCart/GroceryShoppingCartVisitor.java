package GroceryShoppingCart;

/**
 * Visitor Interface for Grocery Shopping Cart.
 */
public interface GroceryShoppingCartVisitor {
  int visit(DiaryProducts dp);
  int visit(Vegetable vegetable);
  double visit(Snacks snack);
}
