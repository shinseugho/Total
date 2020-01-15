package 데이터연산처리;

public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    int pay = 1500000;
	    int all = 55000;
	    double tax = 0.1;
	    
	    int netpay = pay+all-(int)(pay*tax);
	    
	    System.out.println("실수령액 : "+netpay+"\t 원");
	    

	}

}
