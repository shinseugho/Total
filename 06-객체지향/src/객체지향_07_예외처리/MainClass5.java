package ��ü����_07_����ó��;

/*    ����)
 *        try 
 *        {
 *          ���� �ҽ����� (��������� ������ �ҽ�)
 *          try���� ���� ������ �߻��ϸ� �ش� catch�� ã�� ���� �� catch�Ҽ��� ��ɼ���
 *          1
 *          2
 *          3
 *          4 => ���� => 4,5���������ʰ� 4�� catch�� �����Ѵ�.
 *          5
 *          
 *        } catch (����ó��Ŭ����)
 *        {
 *          ���ܸ� ó�� (����) => ������ ����� �κ��� �����ϰ� ������ ����
 *        }
 *        finally
 *        {
 *          try�� catch�� ������� ������ �����ϴ� ����
 *          = ���� �ݱ�
 *          = ���� �ݱ�
 *        }
 *        
 *        ����) ������ ã�Ƽ� ������ ���� (���α׷���) => �����޼��� Ȯ��
 *                                             getMessage()         �����߻��޼����� ����
 *                                             printStackTrace()    ������ ������ �о ������ ���μ��� ����
 *             ���α׷��� ������¸� ������ ���� (����)
 *        ����) ��ü�� ó�� ( �κ������� ó����� )
 */
//���ھ߱����� = ������ ���
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MainClass5 extends JFrame implements ActionListener{
	
	JTextArea ta;
	JTextField tf;
	JButton b1,b2;
	
	//���ӿ� �ʿ��� ������
	int[] com = new int[3];
	int[] user = new int[3];
	int s,b;
	
	public MainClass5() {
		ta = new JTextArea();
		ta.setEditable(false);
		JScrollPane js = new JScrollPane(ta);
		tf=new JTextField(20);
		tf.setEnabled(false);
		b1=new JButton("����");
		b2=new JButton("����");
		
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
	
	//�����߻� �޼ҵ�
	public void getRand() {
		int su = 0; //���� ����
		boolean bCheck = false; //�ߺ�üũ
		for(int i = 0;i < 3;i++)
		{
			//���� �ߺ��� �ȵ� ��츸 com[]�� ����
			bCheck = true;
			while (bCheck)
			{
				//�����߻�
				su = (int)(Math.random()*9) + 1;
				bCheck = false;
				//�����com[]���� �����߻���(su) �ߺ����� Ȯ��
				
				//�ߺ��� ��쿡�� bCheck => true => while���� �ٽ� ����
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
		// ��ưŬ���� ó��
		if(e.getSource( )== b1)
		{
			//�����߻�
			getRand();
			JOptionPane.showMessageDialog(this, "������ �����մϴ�"); //this �� ��� �������� ���ϴ� ���� = ���� Ŭ������ ���� ���
			tf.setEnabled(true);
			b1.setEnabled(false);
			tf.requestFocus();
		}
		else if(e.getSource() == b2)
		{
			dispose();         // �޸� ȸ��
			System.exit(0);    // ���α׷� ����
		}
		else if(e.getSource() == tf)
		{
			String input = tf.getText();
			input = input.trim();
			if(input.length() < 1)
			{
				JOptionPane.showMessageDialog(this,"���ڸ� ������ �Է��ؾ��մϴ�");
				tf.requestFocus();
				return;
			}
			
			int no = 0;
			try
			{
				no = Integer.parseInt(input);
			}catch(Exception ex)
			{
				JOptionPane.showMessageDialog(this,"������ �Է��ؾ��մϴ�");
				tf.setText("");
				tf.requestFocus();
				return;
			}
			
			//�߸����Է�
			if(no < 100 || no > 999)
			{
				JOptionPane.showMessageDialog(this,"���ڸ� ������ �Է��ؾ��մϴ�");
				tf.setText("");
				tf.requestFocus();
				return;
			}
			
			//user[]�� ����
			user[0] = no / 100;
			user[1] = (no % 100)/10;
			user[2] = no % 10;
			
			if(user[0] == user[1] || user[1] == user[2] || user[0] == user[2] )
			{
				JOptionPane.showMessageDialog(this,"�ߺ��� ���� ����� �Ұ��մϴ�");
				tf.setText("");
				tf.requestFocus();
				return;
			}
			
			if(user[0] == 0 || user[1] == 0 || user[2] == 0 )
			{
				JOptionPane.showMessageDialog(this,"0�� ����� �� �����ϴ�");
				tf.setText("");
				tf.requestFocus();
				return;
			}
			
			//��
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
			
			//��Ʈ
			String hint = "Input Number: " + no + ", Result: " + s + "S - "+ b + "B\n";
			ta.append(hint);
			
			//����
			if(s==3)
			{
				int res = JOptionPane.showConfirmDialog(this,"�����Ͻðڽ��ϱ�?","����",
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
