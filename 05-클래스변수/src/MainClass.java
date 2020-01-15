/*
 *   자바 (클래스가 여러개) => 한파일, 별도 파일작성해서 사용
 *   한 개의 파일에서 사용
 *   
 *   ===============
 *   class A
 *   class C
 *   class D
 *   public class B
 *   =============== B.java (public 클래스는 한개만 존재)
 *   class A
 *   class B
 *   =============== 
 */

//News 데이터형
class News{
	String title;
	String content;
	String author;
	String regdate;
	
	/* static String site;
	 * class 영역은 선언만 가능하다.
	 */  
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// new를 사용할 경우에 따로따로 생성되는 변수를 instance변수라고 한다.
		
		  News n1=new News(); 
		  n1.title="'해치지않아' 안재홍·강소라, 'TV 동물농장' 내레이션 동반 출격"; 
		  n1.content="[엑스포츠뉴스 황수연 기자] 영화 '해치지않아'(감독 손재곤)의 안재홍, 강소라가 SBS 'TV 동물농장'에서 스페셜 내레이션으로 시청자들을 만난다."; 
		  n1.author="엑스포츠뉴스"; 
		  n1.regdate="19.12.27";
		  
		  News n2=new News(); 
		  n2.title="이병헌 '남산의 부장들', 입이 쩍 벌어지는 한·미·프 대규모 로케"; 
		  n2.content="영화 '남산의 부장들'(감독 우민호)이 한국, 미국, 프랑스 3개국을 오가며 1979년의 풍경을 고스란히 담아내 시선을 사로잡는다."; 
		  n2.author="스타뉴스"; 
		  n2.regdate="19.12.27";
		  
		  System.out.println(n1.title); 
		  System.out.println(n2.title);
		 
	}

}
