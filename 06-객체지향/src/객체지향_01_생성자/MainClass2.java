package 객체지향_01_생성자;

/* public        (protected default)         private (자신의 클래스)
 *         같은 폴더( = 패키지 )
 *         => 상속 
 *         => 다른 패키지도 접근가능(protected)
 * ===============================================================
 * 모든 클래스        
 * 
 * 생성자에는 private가 없다. 
 */
public class MainClass2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Board b= new Board(1,"게시판","2020-01-02");
		b.boardList();
		
	}
}
