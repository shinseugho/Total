package 객체지향_07_예외처리;

/*    형식)
 *        try 
 *        {
 *          평상시 소스내용 (정상실행이 가능한 소스)
 *          try수행 도중 에러가 발생하면 해당 catch를 찾아 복구 후 catch소속의 기능수행
 *          1
 *          2
 *          3
 *          4 => 에러 => 4,5수행하지않고 4의 catch를 수행한다.
 *          5
 *          
 *        } catch (예외처리클래스)
 *        {
 *          예외를 처리 (복구) => 에러가 출력한 부분을 제외하고 나머지 수행
 *        }
 *        finally
 *        {
 *          try나 catch나 상관업이 무조건 수행하는 문장
 *          = 파일 닫기
 *          = 서버 닫기
 *        }
 *        
 *        목적) 에러를 찾아서 수정할 목적 (프로그래머) => 에러메세지 확인
 *                                             getMessage()         에러발생메세지만 전송
 *                                             printStackTrace()    실행한 파일을 읽어서 에러난 라인수를 제공
 *             프로그램이 정산상태를 유지할 목적 (유저)
 *        사용법) 전체를 처리 ( 부분적으로 처리기능 )
 */
//숫자야구게임 = 윈도우 출력
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MainClass5 extends JFrame implements ActionListener{
	
	JTextArea ta;
	JTextField tf;
	JButton b1,b2;
	
	//게임에 필요한 데이터
	int[] com = new int[3];
	int[] user = new int[3];
	int s,b;
	
	public MainClass5() {
		ta = new JTextArea();
		ta.setEditable(false);
		JScrollPane js = new JScrollPane(ta);
		tf=new JTextField(20);
		tf.setEnabled(false);
		b1=new JButton("시작");
		b2=new JButton("종료");
		
		JPanel p = new JPanel();
		p.setBackground(Color.white);
		p.add(tf);p.add(b1);p.add(b2);
		
		add("Center",js);
		add("South",p);
		
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		tf.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new MainClass5();
		
	}
	
	//난수발생 메소드
	public void getRand() {
		int su = 0; //난수 저장
		boolean bCheck = false; //중복체크
		for(int i = 0;i < 3;i++)
		{
			//난수 중복이 안된 경우만 com[]에 저장
			bCheck = true;
			while (bCheck)
			{
				//난수발생
				su = (int)(Math.random()*9) + 1;
				bCheck = false;
				//저장된com[]값과 난수발생값(su) 중복여부 확인
				
				//중복된 경우에는 bCheck => true => while문을 다시 수행
				for(int j = 0;j < i;j++)
				{
					if(com[j] == su)
					{
						bCheck = true;
						break;
					}
				}
			}
			com[i] = su;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// 버튼클릭시 처리
		if(e.getSource( )== b1)
		{
			//난수발생
			getRand();
			JOptionPane.showMessageDialog(this, "게임을 시작합니다"); //this 는 어디에 띄울것인지 정하는 변수 = 상위 클래스에 대한 대답
			tf.setEnabled(true);
			b1.setEnabled(false);
			tf.requestFocus();
		}
		else if(e.getSource() == b2)
		{
			dispose();         // 메모리 회수
			System.exit(0);    // 프로그램 종료
		}
		else if(e.getSource() == tf)
		{
			String input = tf.getText();
			input = input.trim();
			if(input.length() < 1)
			{
				JOptionPane.showMessageDialog(this,"세자리 정수를 입력해야합니다");
				tf.requestFocus();
				return;
			}
			
			int no = 0;
			try
			{
				no = Integer.parseInt(input);
			}catch(Exception ex)
			{
				JOptionPane.showMessageDialog(this,"정수만 입력해야합니다");
				tf.setText("");
				tf.requestFocus();
				return;
			}
			
			//잘못된입력
			if(no < 100 || no > 999)
			{
				JOptionPane.showMessageDialog(this,"세자리 정수만 입력해야합니다");
				tf.setText("");
				tf.requestFocus();
				return;
			}
			
			//user[]에 저장
			user[0] = no / 100;
			user[1] = (no % 100)/10;
			user[2] = no % 10;
			
			if(user[0] == user[1] || user[1] == user[2] || user[0] == user[2] )
			{
				JOptionPane.showMessageDialog(this,"중복된 수는 사용이 불가합니다");
				tf.setText("");
				tf.requestFocus();
				return;
			}
			
			if(user[0] == 0 || user[1] == 0 || user[2] == 0 )
			{
				JOptionPane.showMessageDialog(this,"0은 사용할 수 없습니다");
				tf.setText("");
				tf.requestFocus();
				return;
			}
			
			//비교
			s = 0 ;
			b = 0 ;
			for (int i = 0; i < 3; i++)
			{
				for (int j = 0; j < 3;j++)
				{
					if (com[i] == user[i])
					{
						if (i == j) s++;
						else        b++;
					}
					
				}
			}
			
			//힌트
			String hint = "Input Number: " + no + ", Result: " + s + "S - "+ b + "B\n";
			ta.append(hint);
			
			//종료
			if(s==3)
			{
				int res = JOptionPane.showConfirmDialog(this,"종료하시겠습니까?","종료",
						  JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE );
				
				if(res == JOptionPane.YES_OPTION)
				{
					dispose();
					System.exit(0);
				}
				else
				{
					ta.setText("");
					tf.setText("");
					tf.setEnabled(false);
					b1.setEnabled(true);
				}
			}
			
			tf.setText("");
			tf.requestFocus();
		}
	}
		
}
