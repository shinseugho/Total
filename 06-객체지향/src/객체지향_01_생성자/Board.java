package ��ü����_01_������;

public class Board {
	
	int no;
	String name;
	String regdate;
	//default ������ ���� ����(package com.sist.board;)�������� ����� �����ϴ�. 
	
	public Board(int no, String name, String regdate)
	{
		this.no=no;
		this.name=name;
		this.regdate=regdate;
	}
	
	public void boardList()
	{
		System.out.println("��ȣ: "+no);
		System.out.println("�̸�: "+name);
		System.out.println("�����: "+regdate);
		
	}

}
