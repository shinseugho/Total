class StudentVO{
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	char hakjum;
}
public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 메모리저장
		StudentVO vo=new StudentVO();
		vo.name="홍길동";
		vo.kor=90;
		vo.eng=90;
		vo.math=90;
		vo.total=vo.kor+vo.eng+vo.math;
		vo.avg=vo.total/3.0;
		
		vo.hakjum='A';
		switch((int)(vo.avg/10))
		{
		case 10: case 9:
			vo.hakjum='A';
			break;
		case 8:
			vo.hakjum='B';
			break;
		case 7:
			vo.hakjum='C';
			break;
		case 6:
			vo.hakjum='D';
			break;
	    default:
	    	vo.hakjum='F';
		}
		
		StudentVO vo1=new StudentVO();
		vo1.name="홍길동";
		vo1.kor=90;
		vo1.eng=90;
		vo1.math=90;
		vo1.total=vo1.kor+vo1.eng+vo1.math;
		vo1.avg=vo1.total/3.0;
		
		vo1.hakjum='A';
		switch((int)(vo1.avg/10))
		{
		case 10: case 9:
			vo1.hakjum='A';
			break;
		case 8:
			vo1.hakjum='B';
			break;
		case 7:
			vo1.hakjum='C';
			break;
		case 6:
			vo1.hakjum='D';
			break;
	    default:
	    	vo1.hakjum='F';
		}
		
		StudentVO vo2=new StudentVO();
		vo2.name="서유기";
		vo2.kor=60;
		vo2.eng=80;
		vo2.math=30;
		vo2.total=vo2.kor+vo2.eng+vo2.math;
		vo2.avg=vo2.total/3.0;
		
		vo2.hakjum='A';
		switch((int)(vo2.avg/10))
		{
		case 10: case 9:
			vo2.hakjum='A';
			break;
		case 8:
			vo2.hakjum='B';
			break;
		case 7:
			vo2.hakjum='C';
			break;
		case 6:
			vo2.hakjum='D';
			break;
	    default:
	    	vo2.hakjum='F';
		}
		
		System.out.println("==========결과출력==========");
		System.out.println(vo1.name+" "
				+vo1.kor+" "
				+vo1.eng+" "
				+vo1.math+" "
				+vo1.total+" "
				+vo1.avg+" "
				+vo1.hakjum+" ");
		System.out.println(vo2.name+" "
				+vo2.kor+" "
				+vo2.eng+" "
				+vo2.math+" "
				+vo2.total+" "
				+vo2.avg+" "
				+vo2.hakjum+" ");
	}

}
