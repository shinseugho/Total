package �����Ϳ���ó��;
/*
 *       ����ȯ  ������ ��쿡�� �����ϴ�.
 *       ====
 *       Up    casting �ڵ�����ȭ
 *       Down  casting ��������ȭ     char,short,byte �� ����� ������� int�� ���Ǽ� ���´�.  ex) (int)10.5
 *       ��, boolean�� ����ȯ�� �����ʴ´�. String�� �޼ҵ� �̿��ؼ� ����ȯ�����ϴ�.(String�� �Ϲ� ���� �ƴ϶� Ŭ����.....)(���翡�� ���� �ȴ�.) 
 *       
 *       &&  || ! �� ������ ���ǹ��� �� ���ǹ����� true/false�� �Ǻ��ϴµ� ����Ѵ�.        
 */

public class ���׿�����_��������2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean b1 = (6<7) && (7==7) ; //true
		System.out.println("b1="+b1) ;
				
		        b1 = (6>7) && (7==7) ; //false
		System.out.println("b1="+b1) ;
		
		        b1 = (6>7) || (7==7) ; //true
		System.out.println("b1="+b1) ;
		
                b1 = (6<7) || (7==7) ; //true
        System.out.println("b1="+b1) ;
        
                b1 = (6>7) || (7!=7) ; //false
        System.out.println("b1="+b1) ;
        
	}

}
