package com.lambdas;


public class Orders {
	private  String Productcname;
	private  String Status;
	int Price;
	public Orders(String Productname, String Status, int Price) {
		super();
		this.Productcname = Productname;
		this.Status = Status;
		this.Price = Price;
	}
	public String getProductName() {
		return Productcname;
	}
	public void setProductName(String Productname) {
		this.Productcname= Productname;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String Status) {
		this.Status = Status;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int Price) {
		this.Price= Price;
	}
	@Override
	public String toString() {
		return "Orders [Productcname=" + Productcname + ", Status=" + Status + ", Price=" + Price + "]";
	}
	
	
	

}
