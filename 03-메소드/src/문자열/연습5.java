package 문자열;
import java.awt.FlowLayout;

import javax.swing.*;
//JFrame (윈도우) ==> 
public class 연습5 extends JFrame{
    JLabel la = new JLabel("나이");
    JTextField tf=new JTextField(10);
    연습5(){
    	setLayout(new FlowLayout());
    	add(la);
    	add(tf);
    	tf.setText(String.valueOf(100));
    	setSize(350, 80);
    	setVisible(true);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 연습5();
	}

}
