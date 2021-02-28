package study;

public class study_this {

	
	//this
	//인스턴스 자신의 메모리를 가리킨다
	//자신의 주소를 반환(참조 값)한다
	//생성자에서 다른 생성자를 생성가
	
	
	String name;
	int age;
	
	
	public study_this() {
		this("이름없음",1); //밑에있는 또다른 생성자 호출  
	}
	
	public study_this(String str,int age) {
		
		
		this.name=str;
		this.age=age;
		
	}
	public void show() {
		System.out.println(">>"+name+">>"+age);
	}
	
	public static void main(String[] args) {
		
		study_this sample = new study_this();
		sample.show();
	}
	
	
}
