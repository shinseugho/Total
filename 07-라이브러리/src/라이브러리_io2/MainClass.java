package 라이브러리_io2;
/*    Thread 사용법(: 한가지일만 하도록 한다)
 *    1. Runaable(interface) 이용법
 *       => 클라이언트 (윈도우)
 *       => run()메소드 구현 => 쓰레드 동작
 *       class A implements Runnable
 *    2. Thread를 상속받아서 처리
 *       => Thread의 역활을 확장
 *       class A extends Thread
 *    
 *    ===> 동작하는 방법
 *    1. INIT(생성: CREATED)
 *       Thread t1=new Thread();                
 *       Thread t2-new Thread();               
 *       => JVM 이름을 부여 Thread-0
 *          순위부여 (1~10) 
 *          1: MIN_PRIORITY
 *          5: NORM_PRIORITY     
 *          10: MAX_PRIORITY   
 *              
 *    2. Runnable(대기)
 *       t1.start()
 *       t2.start()
 *       
 *    3. Running
 *       run()
 *       run()
 *       
 *    4-1. 일시정지
 *         sleep(), wait()
 *         sleep(), wait()
 *    4-2. 쓰레드 종료
 *         interrupt(), join()      
 * 
 */

class MyThread extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(getName()+":"+i);
			try
			{
				Thread.sleep(50);
			}catch(Exception ex) {}
		}
	}
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		//생성
		MyThread t1= new MyThread();
		MyThread t2= new MyThread();
		MyThread t3= new MyThread();
		
		t1.setName("홍길동");
		t2.setName("심청이");
		t3.setName("박문성");
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		
		//가져오기
		t1.start();
		t2.start();
		t3.start();
		
		//1~10 동작
		//t1.run()/t2.run()/t3.rin()

	}

}
