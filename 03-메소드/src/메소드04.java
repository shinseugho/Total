
/* ==========================
 *  1. 메소드 호출
 *  2. 메소드 블록으로 접근
 *  3. 블록 안에 있는 모든 문장 수행
 *  4. 메소드 호출 위치로 복귀
 * ==========================
 *  
 *   게시판 기능
 *    1. 목록출력
 *    2. 내용보기
 *    3. 글쓰기
 *    4. 수정하기
 *    5. 답변하기
 *    6. 삭제하기
 *    7. 검색
 *   
 *   메소드에 is boolean
 *         set void    를 많이 가진다. 
 */
import java.util.Scanner;

public class 메소드04 {
	
	static void gugudan(int dan)
	{
		for(int i=1;i<=9;i++)
		{
			System.out.printf("%d*%d=%d\n",dan,i,dan*i);
		}
	}
	static String gugudan2(int dan) //매개변수가 다르면 오류가 나지않는다. 
	{
		String result="";
		for(int i=1;i<=9;i++)
		{
			result+=dan+"*"+i+"="+(dan*i)+"\n";
		}
		return result;
	}
	static void process()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("단 입력 : ");
		int dan=scan.nextInt();
		//구구단
		String res=gugudan2(dan);
		System.out.println(res);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
