package study;

public class study_singleton {

	
	
	//싱글톤 패턴이란 프로그램에서 인스터스가 단 한개만 생성되어야 하는 경우 사용
	
	//static 변수와 메서드를 통해 구현가능
	
	
	//유일한 인스턴스 생성 , 유일한 객체가 되었
	private static study_singleton instance = new study_singleton();
	
	private study_singleton() {
		
	}
	
	
	//그다음에는 이 객체를 외부에서 쓸 수 있도록 해야함(접근가능하게끔 public요소필요)
	
	public static study_singleton getInstance() {
		
		//외부에서 클래스이름으로 메서드 호출을 가능하게 하기위해서 static으로 선언
		
		if(instance==null) {
			instance=new study_singleton();
		}
		
		return instance;
	}
	
	//여기가지가 싱글톤 패턴 
	
}
