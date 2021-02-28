package extends_sample;

public class test_customer {

	
	public static void main(String[] args) {
		
		Customer cs= new Customer("고객 1");
		VIP_Customer vip_cs = new VIP_Customer("고객 2");
		
		System.out.println();
				
		cs.calcprice(20000);
		vip_cs.calcprice(20000);
		
		
		System.out.println(cs.showCustomerInfo());
		System.out.println(vip_cs.showCustomerInfo());
		
		
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		//형변환 업캐스팅 -> 상위 클래스로 형변환이 되는 것  
		//상위 클래스로 변수를 선언하고 하위 클래스의 생성자로 인스턴스를 생성
		
		Customer cscs = new VIP_Customer("고객3");
		
		//cscs.vip_func();
		
		//인스턴스는 VIP_Customer로 생성되었지
		// Customer 형으로 업캐스팅 되어 
		// VIP_Customer 인스턴스 상태라고해도 
		//VIP_Customer의 기능을 사용하지못하고 Customer 의 기능만을 사용
		
		
		//상속에서 상위 클래스와 하위 클래스에 같은 이름의 메서드가 존재할 때 호출되는 메서드는 인스턴스에 따라 결정된다.
		//선언한 클래스형이 아닌 생성된 인스턴스의 메서드를 호출하는 것.
		
		
		
	}
}
