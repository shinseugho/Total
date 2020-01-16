package ��ü����_06_������;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.*;

public class MyTable extends JFrame implements ActionListener,MouseListener{
	//���̺� ������
	JTable table;
	//������ ����
	DefaultTableModel model;
	JLabel la1, la2, la3;
	JTextField tf1, tf2, tf3;
	JButton b;
	TableColumn column;
	public MyTable() {
		la1=new JLabel("�̸�");
		la2=new JLabel("�ּ�");
		la3=new JLabel("��ȭ");
		
		tf1=new JTextField(7);
		tf2=new JTextField(7);
		tf3=new JTextField(7);
		
		b = new JButton("���");
		
		JPanel p = new JPanel();
		p.add(la1);p.add(tf1);
		p.add(la2);p.add(tf2);
		p.add(la3);p.add(tf3);
		p.add(b);
		
		//���̺�
		String[] col = {"�̸�", "�ּ�", "��ȭ"};
		String[][] row = new String[0][3];
		model = new DefaultTableModel(row,col) {

			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
			
		};
		table = new JTable(model);
		table.setRowHeight(30);
		JScrollPane js = new JScrollPane(table);
		table.getTableHeader().setReorderingAllowed(false);
		
		//���μ� �����
		//table.setShowGrid(false); 
		
		//�������
		table.getTableHeader().setBackground(Color.white);
		//���̺����
		js.getViewport().setBackground(Color.white);
		
		add("Center",js);
		
		add("North",p);
		setSize(640,480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//�̺�Ʈ ���
		b.addActionListener(this);
		table.addMouseListener(this);
		
		for(int i=0;i<3;i++)
		{
			column=table.getColumnModel().getColumn(i);
			TableCellRenderer rend = column.getCellRenderer();
			
			if(i==0)
			{
				column.setPreferredWidth(200);
			}
			else if(i==1)
			{
				column.setPreferredWidth(200);
			}
			else if(i==2)
			{
				column.setPreferredWidth(200);
			}
			
			column.setCellRenderer(rend);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new MyTable();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b)
		{
			String name=tf1.getText();
			if(name.length()<1) 
			{
				JOptionPane.showMessageDialog(this, "�̸��� �Է��ϼ���.");
				return;
			}
			String addr=tf2.getText();
			if(addr.length()<1) 
			{
				JOptionPane.showMessageDialog(this, "�ּҸ� �Է��ϼ���.");
				return;
			}
			String tel=tf3.getText();
			if(tel.length()<1) 
			{
				JOptionPane.showMessageDialog(this, "��ȣ�� �Է��ϼ���.");
				return;
			}
			
			String[] data = {name, addr, tel};
			model.addRow(data);
			
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==table)
		{
			if(e.getClickCount()==2)
			{
				int row = table.getSelectedRow();
				String name = model.getValueAt(row, 0).toString();
				//String name = (String)model.getValueAt(row, 0);
				String addr = model.getValueAt(row, 1).toString();
				String tel = model.getValueAt(row, 2).toString();
				
				String data = "�̸�: "+name+"\n"
						     +"�ּ�: "+addr+"\n"
						     +"��ȭ: "+tel;
				
				JOptionPane.showMessageDialog(this, data);
			}
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
