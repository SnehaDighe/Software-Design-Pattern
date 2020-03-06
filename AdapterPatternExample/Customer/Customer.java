package Customer;

public class Customer implements CustomerInterface{
private static String customerID;
//parameterized constructor
public Customer(String cid){
	this.customerID = cid;
}

public void setCid(String cid) {
	this.customerID = cid;
}

public String getCid() {
	return this.customerID;
}

@Override
public String printCustomer(Customer cs) {
	// TODO Auto-generated method stub
	return cs.getCid();
}

@Override
public Customer getCustomer_withUSBConnect(String customerID) {
	// TODO Auto-generated method stub
	return this;
}

}
