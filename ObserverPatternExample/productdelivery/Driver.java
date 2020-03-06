package productdelivery;

/*
This class will maintain the driver name and will have update if the subject/observable
 in our context Shop updates any new delivery requests.
 */

public class Driver implements Observer {

  private String driverName; //driver name declaration.

  public Driver(String driverName) { //parameterized constructor for driver.
    this.driverName = driverName;
  }

  /*
  //This method will be called to update all drivers regarding the delivery request.
   */
  @Override
  public void update(String productDetails, String deliveryAddress) {
    System.out.println(driverName + " has received " + productDetails + " to be delivered at :: "
        + deliveryAddress);
  }

}
