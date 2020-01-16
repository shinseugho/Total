package 객체지향_05_상속02;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MainClass9 extends JFrame implements ActionListener,MouseListener {
    
	JButton b = new JButton("Click");
    
    public MainClass9() {
    	
    	add("North",b);
    	setSize(480,300);
    	setVisible(true);
    	//b.addActionListener(this);
    	b.addMouseListener(this);
    }
	
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	new MainClass9();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b)
		{
			System.out.println("B버튼 클릭!!");
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b)
		{
			System.out.println("마우스 클릭!!");
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}
