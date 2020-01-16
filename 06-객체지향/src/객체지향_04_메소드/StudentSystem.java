package 객체지향_04_메소드;
// 2. 액션(동작) => 기능설정
public class StudentSystem {
	
	//개별로 넘기는 방식
	public int totalData(int kor, int eng, int math)
	{
		return kor+eng+math;
	}
	
	public double avgData(int total)
	{
		return total/3.0;
	}
	
	public char scoreData(double avg)
	{
		char c='A';
		switch ((int)(avg/10))
		{
		case 10: case 9: c='A'; break;
		case 8: c='B'; break;
		case 7: c='C'; break;
		case 6: c='D'; break;
		default: c='F'; 
		}
		return c;
	}
	
	// 모아서 한 번에 넘기는 방식
	public void hakjumData(Student s)
	{
		s.setTotal(s.getKor()+s.getEng()+s.getMath());
		
		s.setAvg(s.getTotal()/3.0);
		
		char c='A';
		switch ((int)(s.getAvg()/10))
		{
		case 10: case 9: c='A'; break;
	  	case 8: c='B'; break;
		case 7: c='C'; break;
		case 6: c='D'; break;
		default: c='F'; 
		}
		s.setScore(c);
	}
}
