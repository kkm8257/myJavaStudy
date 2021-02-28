package study;

public class study_heap {
	
	//프로그램을 실행을시켜서 메모리에 올라가면
	
	//크게 두가지 영역으로 나누어져서 들어가는데
	//하나는 코드영역(메소드영역이라고도함) 하나는 데이터 영역(상수영역 혹은 static 영역이라고도함)
	
	//코드영역에는 우리가만든 메서드 들이 들어간다  
	
	//근데 잘 생각해보면 , 인스턴스와 인스턴스( 같은 종류라면) 기능이 동일하다.
	//그러나 각 인스턴스의 변수는 다르겠지
	
	//그래서 각 인스턴스의 기능은 코드영역에  잡히고 그 메소드의 이름은 주소로 바뀐다. 
	//(함수의 이름은 일종의 주소로 볼 수 있다) -> 그다음에 파라미터에 따라 살짝살짝 구분할수있게끔 내부적으로 되어있음 
	
	//결론적으로 클래스의   변수가 갖는 영역과  메소드가 갖는 영역은 다르다는 얘기이다.

	//프로그램이 로드가 되면 메서드영역에 명령어 set이 위치한다
	//해당 메서드가 호출이 되면 명령어 set이 있는 주소를 찾아가 명령어가 실행이 된다
	//이때 메서드에서 사용하는 변수들은 스택메모리에 위치하게 된다.
	
	//따라서  인스턴스가 생성이 되면 변수는 힙메모리에 따로 생성이 되지만 메서드의 명령어 seㅅ은 처음 한번만 로드된다는 사
	
	
	
	//인스턴스인 경우는 heap에 잡힌다.
	//지역변수는 stack에 잡힌다
	
	
	
	//가상메서드란 무엇인가?   자바는 모든 메서드가 가상 메소드이다.
	//프로그램에는 가상메서드 테이블이 존재하고 , 그 테이블에  해당 메서드에 대한 address를 가지고 있다.
	//재정의 된 경우에는 재정의 된 메서드의 주소를 가르킨다.
	
	
	



	
	
}
