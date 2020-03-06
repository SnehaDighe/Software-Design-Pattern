
import DiaryProducts;
import GroceryItem;
import GroceryShoppingClient;
import Snacks;
import Vegetable;
import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;

public class Main {

  private static Logger logger = Logger.getLogger(Main.class);


  /**
   * A main method to run examples.
   *
   * @param args not used
   */
  public static void main(String[] args) {

    // This configuration is for setting up the log4j properties file.
    // It is better to set this using java program arguments.
    // PropertyConfigurator.configure("log4j.properties");

    // Let us create an object of the Main class.
    Main m = new Main();

    logger.info(m.doIt());

    logger.trace("Trace Message!");
    logger.debug("Debug Message!");
    logger.info("Info Message!");
    logger.warn("Warn Message!");
    logger.error("Error Message!");
    logger.fatal("Fatal Message!");

  }


  /**
   *
   * Getting the total amount for all the items in the shopping cart.
   * @return
   */
  private double doIt() {
    GroceryItem[] items = new GroceryItem[]{new DiaryProducts(20, 1),
        new DiaryProducts(100, 5), new Vegetable(10, 2, "Potato"),
        new Vegetable(5, 5, "Cabbage"), new Snacks(3, 15, "chips"),
        new Snacks(5, 5, "cookies")};
    double total = GroceryShoppingClient.calculatePrice(items);
    System.out.println("Total Cost = "+total);
    return total;
  }

}
