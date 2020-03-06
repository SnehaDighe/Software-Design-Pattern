
import static org.junit.Assert.assertEquals;

import DiaryProducts;
import GroceryItem;
import GroceryShoppingClient;
import GroceryShoppingVisitor;
import Snacks;
import Vegetable;
import org.junit.Test;
public class TestShoppingCart {
  private GroceryShoppingClient client = new GroceryShoppingClient();
  private static GroceryShoppingVisitor visitor = new GroceryShoppingVisitor();
  private DiaryProducts dp = new DiaryProducts(10, 1);
  private Snacks snack = new Snacks(12, 36, "chips");
  private Vegetable vegetable = new Vegetable(20, 3, "Avocados");

  @Test
  public void diaryProductTest() {
    dp.accept(visitor);
    assertEquals(dp.getPrice(), 10);
    assertEquals(dp.getWeight(), 1);
  }

  @Test
  public void vegetableTest() {
    vegetable.accept(visitor);
    assertEquals(vegetable.getPricePerKg(), 20);
    assertEquals(vegetable.getName(), "Avocados");
    assertEquals(vegetable.getWeight(), 3);
  }

  @Test
  public void snacksTest() {
    snack.accept(visitor);
    assertEquals(snack.getNoOfItems(), 36);
    assertEquals(snack.getName(), "chips");
    assertEquals(snack.getPrice(), 12);
  }

  @Test
  public void collectionTest()
  {
    GroceryItem[] items = new GroceryItem[]{new DiaryProducts(20, 1),
        new DiaryProducts(100, 5), new Vegetable(10, 2, "Potato"),
        new Vegetable(5, 5, "Cabbage"), new Snacks(3, 15, "chips"),
        new Snacks(5, 5, "cookies")};
    double sum = 0;
    for(GroceryItem item : items)
      sum = sum + item.accept(visitor);
    double total = client.calculatePrice(items);
    System.out.println("Total Cost of items in cart = "+total);
  }
}
