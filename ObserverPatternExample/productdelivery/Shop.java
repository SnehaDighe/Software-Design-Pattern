package productdelivery;

import java.util.ArrayList;

/*
For implementation of Shop Consortium sending delivery request for the required products to drivers,
I will be using Observer pattern which will make it easier to broadcast the information to all the drivers.
This pattern makes it easier to communicate the request to all the drivers using one to many relationship
without having any dependency on the Subject which is Shop in this case.
 */

//This interface handles adding, deleting and notifying the drivers.
interface Subject {

  public void register(Observer o);

  public void unregister(Observer o);

  public void notifyAllObservers(String s);
}

//Observer to call the update method when the subject changes.
interface Observer {

  public void update(String p, String s);
}

//Shop class extends subject interface.
public class Shop implements Subject {

  private String productDetails;  //details of the product to be delivered.
  private String deliveryAddress; //address to which the product needs to be delivered.
  private ArrayList<Observer> drivers;  //list of drivers.

  public Shop(String productDetails,
      String deliveryAddress) { //parameterized constructor for details related to product.
    this.deliveryAddress = deliveryAddress;
    this.productDetails = productDetails;
    drivers = new ArrayList<Observer>();
  }

  @Override
  public void register(Observer o) {
    drivers.add(o); //add list of drivers to the shop registered driver list.
  }

  @Override
  public void unregister(Observer o) {
    drivers.remove(o); //remove driver from the registered list.
  }

  @Override
  public void notifyAllObservers(String deliveryAddress) {
    for (Observer driver : drivers) {
      driver.update(productDetails, deliveryAddress); //Notify all the registered drivers.
    }
  }

  /*
  This method gives the delivery address of the product to be delivered which is then notified to the drivers.
   */
  public void productDelivery(String deliveryAddress) {
    notifyAllObservers(deliveryAddress);
  }

}