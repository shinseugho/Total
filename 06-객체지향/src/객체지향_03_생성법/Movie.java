package 객체지향_03_생성법;
import java.awt.*;
import javax.swing.*;

public class Movie {
	/* JPanel은 단독으로 실행이 불가능하다.
	 *         Layout을 가지고있다. => FlowLayout() = 일자배열                              
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
		name="시동 (2019)";
		
		la=new JLabel(new ImageIcon(poster));
		f=new JTextField();
		f.setText(name);
		p=new JPanel();
		p.setLayout(new BorderLayout());
		p.add("Center",la);
		p.add("South",f);
	}
	
}
