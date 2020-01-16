package 객체지향_02_캡슐화;
class Data{
	String title;
	static String poster;
	
	//생성자 초기화 
	/*
	 * public Data() { title="홍길동전"; poster="hong.png"; }
	 */
	
	{
		title="aaa";
	}
	
	static
	{
		poster="1.png";
	}
	
	/* public Data() 
	 * { 
	 *      title ="bbb"; 
	 *      poster="2.png"; 
	 * }
	 * 생성자가 있다면 생성자가 가장 마지막에 저장되어 불러와진다.
	 */
	
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Data d1 = new Data();
        System.out.println(d1.title);
        System.out.println(d1.poster);
        
        Data d2 = new Data();
        System.out.println(d2.title);
        System.out.println(d2.poster);
        
        //생성자의 경우 누적 데이터가 많을 경우 로딩시간이나 코딩시간이 길다는 단점이 생긴다. 그렇기에 대용량의 경우 블록(DB)이 편하고 조금식이라도 변한다면 생성자(자동인식)가 편하다.
	}

}
