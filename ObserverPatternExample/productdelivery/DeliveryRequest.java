package productdelivery;
/*
This class has been used to write j-units to test the delivery request made by the shops
 and broad-casted to the drivers.
 */

public class DeliveryRequest {

  public static void main(String[] args) {

    //creating 2 shop object electronics and flowers.
    Shop electronics = new Shop("air ipods", "brighton");
    Shop flowers = new Shop("daisy", "allston");

    //creating 6 driver objects.
    Driver john = new Driver("john");
    Driver jay = new Driver("jay");
    Driver dave = new Driver("dave");
    Driver smith = new Driver("smith");
    Driver chloe = new Driver("chloe");
    Driver alice = new Driver("alice");

    //registering 5 drivers to get notified for a delivery related to electronics.
    electronics.register(john);
    electronics.register(jay);
    electronics.register(dave);
    electronics.register(chloe);
    electronics.register(alice);

    //registering 3 drivers to get notified for a delivery related to flowers.
    flowers.register(smith);
    flowers.register(chloe);
    flowers.register(alice);

    //entering the address details for the product to be delivered.
    electronics.productDelivery("Boston");
    flowers.productDelivery("Malden");

    //removed dave from the list of drivers to deliver electronics.
    electronics.unregister(dave);

    //changed the delivery address to which product needs to be delivered.
    electronics.productDelivery("Dorchester");
  }
}
