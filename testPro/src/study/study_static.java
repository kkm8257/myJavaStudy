package study;

public class study_static {

	
	//static 은 인스터스가 생성될 때 만들어지는 것이 아니라
	//프로그램이 처음 메모리에 로딩 될때 메모리가 할당된다.
	//정적 변수 라고 한다.
	// 인스턴스 생성과 상관없이 사용 가
	
	

	
	
	public static void main(String[] args) {
		
		study_static_file sam = new study_static_file();
		//sam.myTool();  //private라서 사용 안된다
		sam.myTool2();  //이렇게 쓰는것 보다 
		study_static_file.myTool2(); //이렇게 쓰는것이 더좋
	}
	
}
