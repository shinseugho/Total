package 객체지향_06_다형성;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MyTextFiled extends JFrame implements ActionListener{

	JTextField tf = new JTextField();
	JTextArea ta = new JTextArea();
	public MyTextFiled() {
		
		ta.setEditable(false);
		JScrollPane js = new JScrollPane(ta);
		add("Center",js);
		add("South",tf);
		setSize(350,450);
		setVisible(true);
		
		//이벤트 등록
		tf.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);//종료
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new MyTextFiled();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==tf)
		{
			ta.append(tf.getText()+"\n");
			// append (문자결합) setText(새이벤트)
		}
	}

}
