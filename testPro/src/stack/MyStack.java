package stack;

public class MyStack {

	
	//입구와 출구하 한곳
	//LIFO 
	//top을 이용하여 자료 입출력
	//top에 있는 자료를 읽는것을 peek라고 한다  
	
	
	 private int top;
     private int stackSize;
     private int stackArr[];

     public MyStack(int stackSize) {
         top = -1;  //초기에는 top이 -1, index가 0부터 시작하기 위
         stackArr = new int[stackSize];
         this.stackSize = stackSize;
     }

     public void push(int data) {
         stackArr[++top] = data;
     }

     public int pop(){
         if (top == -1) {
        	 System.out.println("pop 할 자료가 없습니다.");
             throw new ArrayIndexOutOfBoundsException();
         }
         return stackArr[top--];
     }

     public int peek() {
         if (top == -1) {
        	System.out.println("peek 할 자료가 없습니다.");
             throw new ArrayIndexOutOfBoundsException();
         }
         return stackArr[top];
     }

     public void printStack() {
         System.out.println("stack list");
         for (int i = top; i >= 0; --i) {
             System.out.println(stackArr[i]);
         }
     }

     
	
}
