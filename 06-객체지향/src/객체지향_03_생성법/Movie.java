package ��ü����_03_������;
import java.awt.*;
import javax.swing.*;

public class Movie {
	/* JPanel�� �ܵ����� ������ �Ұ����ϴ�.
	 *         Layout�� �������ִ�. => FlowLayout() = ���ڹ迭                              
	 * JFrame    BorderLayout()
	 * JDialog   BorderLayout() 
	 */
	
	JPanel p;
	JLabel la;
	JTextField f;
	private String poster;
	private String name;
	
	public Movie() {
		poster="C:\\image\\poster.jpeg";
		name="�õ� (2019)";
		
		la=new JLabel(new ImageIcon(poster));
		f=new JTextField();
		f.setText(name);
		p=new JPanel();
		p.setLayout(new BorderLayout());
		p.add("Center",la);
		p.add("South",f);
	}
	
}
