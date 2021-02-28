package study;

public class study_oop {
	
	
	
	public static int addNum(int num1,int num2) {
		int result;
		result=num1+num2;
		return result;
		
	}
	
	public static int calsum() {
		
		int sum=0;
		
		for(int i =1 ; i<=100;i++) {
			
			sum=sum+i;
			
		}
		return sum;
		
	}
	
	
	public static void main(String[] args) {

		int temp1=10;
		int temp2=20;
		
		
		int a = addNum(temp1,temp2);
		int b=calsum();
		System.out.println(a);
		System.out.println(b);
		
		//기본적으로 자바는 스택메모리 구조
		//main 함수가 사용할 메모리 공간이 스택에 할당되고/
		
		//addNum함수가 사용할 메모리가 그위에 스택에 할당된다
		//값을 반환한 후에는 (블럭이 끝나면)스택에서 사라진다
		
		
		//메서드란 클래스 내부에 구현되는 함수
		
		
		//생성된 인스턴스는 동적메모리인 heap 메모리에 할당된다
		//하나의 클래스로 부터 여러개의 인스터스가 생성되고 각각 다른 메모리 주소를 가지게된다
		//자바에서 가비지 컬렉터가 주기적으로 사용하지 않는 메모리를 수거한다.
		
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		
		//오버로딩 이란 이름은 똑같은데 (혹은 생성자 혹은 메서드에 해당)
		//매개변수가 다를때
		
		
		//참조 자료형 : String , Date 등
		//기본 자료형 : int , long ,float , double
		
		
		//접근 제어 지시자(access modifier)와 정보은닉
		
		//클래스 외부에서 클래스의 멤버 변수 , 메서드 ,생성자를 사용할 수 있는지 여부를 지정하는 키워드
		//private , public , default , protected
		
		//private : 같은 클래스 내부에서만 접근 가능
		//default : 같은 패키지 내부에서만 접근가능 ( 상속관계라도 패키지가 다르면 접근 불가)
		//protected : 같은 패키지나 상속관계의 클래스에서 접근이 가능하고 그 외 외부에서는 접근 불가
		//public : 뭐든 가능
		
		
		//정보의 은닉
		//외부에서 접근 가능한 최소한의 정보만을 오픈해서 객체의 오류를 방지한다.
		
		//캡슐화
		//대부분의 멤버 변수와 메서드를 감추고 외부에 통합된 인터페이스만은 제공하여 일관된 기능을 구현하게 한다

	
		
		
		
		
	}
}
