package 객체지향_03_생성법;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sawon s1 = new Sawon();
		s1.setSabun(1);
		s1.setName("홍길동");
		s1.setDept("개발부");
		s1.setLoc("서울");
		s1.setPay(3500);
		
		System.out.println("사번: "+s1.getSabun());
		System.out.println("이름: "+s1.getName());
		System.out.println("부서: "+s1.getDept());
		System.out.println("지역: "+s1.getLoc());
		System.out.println("연봉: "+s1.getPay());
		
		/*
		 * s1=null; System.gc();
		 */
		
		System.out.println("\n");
		
		Sawon s2 = new Sawon();
		s2.setSabun(2);
		s2.setName("심봉사");
		s2.setDept("재무부");
		s2.setLoc("단양");
		s2.setPay(8000);
		
		System.out.println("사번: "+s2.getSabun());
		System.out.println("이름: "+s2.getName());
		System.out.println("부서: "+s2.getDept());
		System.out.println("지역: "+s2.getLoc());
		System.out.println("연봉: "+s2.getPay());
		
	}

}
