package study;

public class study_singleton_use {

	
	public static void main(String[] args) {
		
		
		//이런식으로 사용 클래스 이름으로 가져다쓴다  
		study_singleton sampleSingleton = study_singleton.getInstance();
		study_singleton sampleSingleton_2 = study_singleton.getInstance();
		
		System.out.println(sampleSingleton);
		System.out.println(sampleSingleton_2);
		
		//생성한 인스턴스의 주소가 동일함 
	}
}
  