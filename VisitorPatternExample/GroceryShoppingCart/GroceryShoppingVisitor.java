package GroceryShoppingCart;

public class GroceryShoppingVisitor implements GroceryShoppingCartVisitor {

  /**
   * Visit method to calculate price for Diary Product.
   * Condition : Apply 5$ discount if the diary price is greater than 20.
   * @param dp
   * @return
   */
  @Override
  public int visit(DiaryProducts dp)
  {
    int cost=0;
    //apply 5$ discount if diary price is greater than 20
    if(dp.getPrice() > 20)
    {
      cost = dp.getPrice()-5;
    }
    else
      cost = dp.getPrice();

    System.out.println("Diary price for wt ::"+dp.getWeight() + " is cost ="+cost);
    return cost;
  }

  /**
   * Visit method to calculate price for vegetable type.
   * Total price = price per kg * vegetable weight.
   * @param vegetable
   * @return
   */
  @Override
  public int visit(Vegetable vegetable)
  {
    int cost = vegetable.getPricePerKg()*vegetable.getWeight();
    System.out.println(vegetable.getName() + " cost = "+cost+" for weight = "+vegetable.getWeight()+" kg");
    return cost;
  }

  /**
   * Visit method to calculate price for snacks
   * Condition : Give 15 % discount on the total price of snack if number
   * of snack items is greater than 10.
   * @param snack
   * @return
   */
  @Override
  public double visit(Snacks snack)
  {
    double cost = 0;
    int itemsCount = snack.getNoOfItems();
    double totalPrice = snack.getPrice() * itemsCount;
    if(itemsCount > 10)
    {
      cost = totalPrice - (totalPrice * 0.15); //15 percent discount on total price of snacks.
    }
    else
      cost = totalPrice;

    System.out.println("Total snack price for::"+itemsCount + " items is cost ="+cost);
    return cost;
  }

}
