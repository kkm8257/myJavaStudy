package extends_sample;

public class VIP_Customer extends Customer{
	
	
	
	public VIP_Customer(String name) {
		//protected 된 customerGrade 덕분에 상속된 클래스에서 참조가능 (접근가능)
		
		
		super(name);
		
		super.customerGrade="VIP";
		super.bonusRatio=0.04;
		
		
		//상속 됬을 때 super(name)은 부모의 생성자를 호출 한다는 얘
		//원래는 묵시적으로 컴파일러가 해결해주었으
		//부모에게 기본생성자가 없는겨우 super 존재하는 생성자 명시해주어야한다.
	
		//부모 클래스의 기본생성자를 주석처리하는경우 오류가 발생 
		// 이떄 super(name)가 필요하다   -> 부모의 String name을 인자로 받는 생성자를 호
		//
	}
	
	
	public void vip_func() {
		System.out.println("vip 입니다 ");
	}

}
