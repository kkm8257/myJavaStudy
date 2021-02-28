package overriding_sample;

public class VIP_Customer extends Customer{
	
	
	
	public VIP_Customer(String name) {
		
		
		super(name);
		
		super.customerGrade="VIP";
		super.bonusRatio=0.04;
		
		
	}
	
	
	//재정의 하여 사용  -> 오버라이드 
	
	@Override
	public void calcprice(int price) {
		System.out.println("오버라이드한 기능 수행 ");
		this.bonusPoint+=price * bonusRatio+100;
		
	}	
	
	public void vip_func() {
		System.out.println("vip 입니다 ");
	}

}
