package extends_sample;

public class Customer {
	
	
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;

	public Customer() {
		
	}
	
	public Customer(String name) {
		this.customerName=name;
		this.customerGrade="SILVER";
		this.bonusRatio=0.01;
		System.out.println("aa");
	}
	public void calcprice(int price) {
		this.bonusPoint+=price * bonusRatio;
		
	}
	public String showCustomerInfo() {
		return customerName+"님의 등급은 "+customerGrade+" , 보너스 포인트는 "+bonusPoint+"입니다.";
		
	}
	

}
