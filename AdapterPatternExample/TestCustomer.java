

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import Customer.Customer;
import Customer.CustomerHTTPData;

// Write some Unit tests for your program like the following.

public class TestCustomer {

  public TestCustomer() {}

  @Test
  public void testGetId() {

    Customer c = new Customer("id1");
    assertEquals("id1", c.getCid());

  }
  
  @Test
  public void testGetCustomerForHTTPS() {
	CustomerHTTPData cs = new CustomerHTTPData();  
    cs.getCustomer_withUSBHTTPS("cs2_https");
    assertEquals("cs2_https", cs.getCustomer_withUSBHTTPS("cs2_https"));

  }


  @Test
  public void testMain() {

    String[] args = {"one", "two", "three"};
    Main.main(args);
  }


}
