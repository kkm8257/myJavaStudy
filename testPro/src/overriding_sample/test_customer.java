package overriding_sample;

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
		
		
		
		
		
	}
}
