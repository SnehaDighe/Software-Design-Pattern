package Customer;

public class CustomerHTTPData implements CustomerHTTPS{
 Customer cs = new Customer("idtest");
 	public CustomerHTTPData() {
 		
 	}
	@Override
	public Customer getCustomer_withUSBHTTPS(String customerID) {
		// TODO Auto-generated method stub
		return cs;
	}

}
