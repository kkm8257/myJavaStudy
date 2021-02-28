package linkedList;



public class MyLinkedList {
	
	//head가 맨 처음 노드라고 하는 연결리스트 

	private MyListNode head;
	int count;
	
	public MyLinkedList()
	{
		head = null;
		count = 0;
	}
	
	public MyListNode addElement( String data )
	{
		
		MyListNode newNode;  //새 노드 선언 
		
		
		if(head == null){  //맨 처음일때 , 헤드가 첫번쨰 노드가 되겠지  
			newNode = new MyListNode(data);
			head = newNode;
		}
		else{ //이미 노드가 존재할 떄 (그 뒤에 추가)
			newNode = new MyListNode(data);
			
			MyListNode temp = head;
			
			while(temp.next != null)  //맨 뒤로 가서  
				temp = temp.next;  //next는 다음노드의 주소값이 담겨있다.
			
			
			//while문을 탈출해서 , 마지막 노드에 도달하면 while문을 탈출하고 , 그 node가 맨 마지막 노드
			
			temp.next = newNode;  //맨 마지막 노드의 next값을  새로 만든 노드의 주소값으로 연결 
		}
		count++;  //총 node개수 +1
		
		
		return newNode;   //꼭 노드반환을 하지않아도 , true false라던가로 반환해도무관 
	}
	
	public MyListNode insertElement(int position, String data )  //중간에 삽입  
	{
		int i;
		MyListNode tempNode = head;
		MyListNode newNode = new MyListNode(data);
		
		if(position < 0 || position > count ){  //넣을 위치가 가능한 위치인가 체크  // 현재 노드수보다 작은 인덱스 , 0이상의 노드 인덱스 인지 체크 
			System.out.println("추가 할 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
			return null;
		}
		
		if(position == 0){  //맨 앞으로 들어가는 경우
			newNode.next = head;
			head = newNode;
		}
		else{
			MyListNode preNode = null;	
			for(i=0; i<position; i++){
				preNode = tempNode;
				tempNode = tempNode.next;
				
			}
			newNode.next = preNode.next;
			preNode.next = newNode;
		}
		count++;
		return newNode;
	}
	
	public MyListNode removeElement(int position)
	{
		int i;
		MyListNode tempNode = head;
		
		if(position >= count ){
			System.out.println("삭제 할 위치 오류입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
			return null;
		}
		
		if(position == 0){  //맨 앞을 삭제하는
			head = tempNode.next;
		}
		else{
			MyListNode preNode = null;	
			for(i=0; i<position; i++){
				preNode = tempNode;
				tempNode = tempNode.next;
			}
			preNode.next = tempNode.next;
		}
		count--;
		System.out.println(position + "번째 항목 삭제되었습니다.");
		
		return tempNode;
	}
	
	public String getElement(int position)
	{
		int i;
		MyListNode tempNode = head;
		
		if(position >= count ){
			System.out.println("검색 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
			return new String("error");
		}
		
		if(position == 0){  //맨 인 경우

			return head.getData();
		}
		
		for(i=0; i<position; i++){
			tempNode = tempNode.next;
			
		}
		return tempNode.getData();
	}

	public MyListNode getNode(int position)
	{
		int i;
		MyListNode tempNode = head;
		
		if(position >= count ){
			System.out.println("검색 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
			return null;
		}
		
		if(position == 0){  //맨 인 경우

			return head;
		}
		
		for(i=0; i<position; i++){
			tempNode = tempNode.next;
			
		}
		return tempNode;
	}

	public void removeAll()
	{
		head = null;
		count = 0;
		
	}
	
	public int getSize()
	{
		return count;
	}
	
	public void printAll()
	{
		if(count == 0){
			System.out.println("출력할 내용이 없습니다.");
			return;
		}
		
		MyListNode temp = head;
		while(temp != null){
			System.out.print(temp.getData());
			temp = temp.next;
			if(temp!=null){
				System.out.print("->");
			}
		}
		System.out.println("");
	}
	
	public boolean isEmpty()
	{
		if(head == null) return true;
		else return false;
	}
	
}
