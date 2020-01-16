package 객체지향_04_메소드;
// 3. 조립

public class Student_MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student();
		s1.setName("홍길동");
		s1.setKor(39);
		s1.setEng(43);
		s1.setMath(62);
		Student s2=new Student();
		s2.setName("황진이");
		s2.setKor(89);
		s2.setEng(64);
		s2.setMath(73);
		Student s3=new Student();
		s3.setName("이순신");
		s3.setKor(73);
		s3.setEng(54);
		s3.setMath(83);
		
		StudentSystem ss = new StudentSystem();
		/* //개별로 넘기는 방식
		 * s1.setTotal(ss.totalData(s1.getKor(), s1.getEng(), s1.getMath()));
		 * s1.setAvg(ss.avgData(s1.getTotal())); s1.setTotal(ss.scoreData(s1.getAvg()));
		 */
		// 한 번에 넘기는 방식
		ss.hakjumData(s1);
		ss.hakjumData(s2);
		ss.hakjumData(s3);
		
		System.out.println("===============결과===============");
		System.out.println("이름: "+s1.getName());
		System.out.println("국어: "+s1.getKor());
		System.out.println("영어: "+s1.getEng());
		System.out.println("수학: "+s1.getMath());
		System.out.println("총점: "+s1.getTotal());
		System.out.println("평균: "+s1.getAvg());
		System.out.println("학점: "+s1.getScore());
		
		/* //개별로 넘기는 방식
		 * s2.setTotal(ss.totalData(s2.getKor(), s2.getEng(), s2.getMath()));
		 * s2.setAvg(ss.avgData(s2.getTotal())); s2.setTotal(ss.scoreData(s2.getAvg()));
		 */
		
		System.out.println("===============결과===============");
		System.out.println("이름: "+s2.getName());
		System.out.println("국어: "+s2.getKor());
		System.out.println("영어: "+s2.getEng());
		System.out.println("수학: "+s2.getMath());
		System.out.println("총점: "+s2.getTotal());
		System.out.println("평균: "+s2.getAvg());
		System.out.println("학점: "+s2.getScore());
		
		/* //개별로 넘기는 방식
		 * s3.setTotal(ss.totalData(s3.getKor(), s3.getEng(), s3.getMath()));
		 * s3.setAvg(ss.avgData(s3.getTotal())); s3.setTotal(ss.scoreData(s3.getAvg()));
		 */
		
		System.out.println("===============결과===============");
		System.out.println("이름: "+s3.getName());
		System.out.println("국어: "+s3.getKor());
		System.out.println("영어: "+s3.getEng());
		System.out.println("수학: "+s3.getMath());
		System.out.println("총점: "+s3.getTotal());
		System.out.println("평균: "+s3.getAvg());
		System.out.println("학점: "+s3.getScore());
	}

}
