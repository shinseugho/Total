package 객체지향_05_상속01;
class Board{
	
	public void write() 
	{
		System.out.println("Board:write(): 글쓰기");
	}
	
    public void content() 
    {
    	System.out.println("Board:content(): 내용보기");
	}
    
    public void update() 
    {
    	System.out.println("Board:update(): 수정하기");
	}
    
    public void list() 
    {
    	System.out.println("Board:list(): 목록출력");
	}
    
    public void find() 
    {
    	System.out.println("Board:find(): 찾기");
	}
    
    public void delete() 
    {
    	System.out.println("Board:delete(): 삭제하기");
	}
}

class GalleryBoard extends Board{
	/* 내용수정 : 오버라이딩
	 *   1) 상속을 받는다.
	 *   2) 메소드명이 동일
	 *   3) 매개변수가 동일
	 *   4) 리턴형이 동일 
	 *   5) 확장은 가능, 축소는 불가능         private < default < protected < public
	 *      ex) class A 
	 *          {
	 *               void display(){}              
	 *          }
	 *          
	 *          class B
	 *          {
	 *               void display(){}
	 *               protected void display(){}
	 *               public void display(){}
	 *               
	 *               private void display(){} 만 불가능.
	 *          }     
	 *      
	 */
	public void write() 
	{
		System.out.println("GalleryBoard:write(): 글쓰기+이미지 업로드");
	}
	    
    public void list() 
    {
    	System.out.println("GalleryBoard:list(): 목록출력+이미지 출력");
	}
    
}

class DataBoard extends Board{

	@Override
	public void write() {
	   System.out.println("DataBoard:write(): 글쓰기+파일업로드");
	}

	@Override
	public void content() {
	   System.out.println("DataBoard:write(): 내용보기+파일다운로드");
	}

}

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * GalleryBoard gb = new GalleryBoard(); gb.list(); gb.write(); gb.content();
		 * gb.update(); gb.delete(); gb.find();
		 * 
		 * DataBoard db = new DataBoard(); db.list(); db.write(); db.content();
		 * db.update(); db.delete(); db.find();
		 */
		
		Board gb = new GalleryBoard();
		gb.list();
		gb.write();
		gb.content();
		gb.update();
		gb.delete();
		gb.find();
		
		gb = new DataBoard();
		gb.list();
		gb.write();
		gb.content();
		gb.update();
		gb.delete();
		gb.find();
		
		/* 상위 클래스로 하위클래스의 생성
		 * 
		 * Board gb = new DataBoard()  => 변경된 메소드만 호출이 가능
		 *   int a        int b, a
		 *   ===================== 상속을 받는 경우
		 *   => 상위 클래스는 하위 클래스에 추가된 메소드나 변수에 접근이 불가능
		 *   => 변수 : 클래스 타입
		 *   => 메소드 : 생성자
		 */
		

	}

}
