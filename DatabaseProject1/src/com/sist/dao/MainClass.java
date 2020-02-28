package com.sist.dao;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 전체데이터 
		EmpDAO dao=new EmpDAO();
		ArrayList<EmpVO> list=dao.empAllData();
		
		for(EmpVO vo:list)
		{
			System.out.println(vo.getEmpno()+" "
				              +vo.getEname()+" "
				              +vo.getJob()+" "
				              +vo.getMgr()+" "
				              +vo.getHiredate().toString()+" "
				              +vo.getSal()+" "
				              +vo.getComm()+" "
				              +vo.getDeptno());
		}
		
		//원하는 컬럼(스캐너 기능이용)만 불러오기
		Scanner scan=new Scanner(System.in);
		System.out.println("사번 입력: ");
		int empno=scan.nextInt();	
		EmpVO vo=dao.empDetailData(empno);
		System.out.println("====================검색 결과====================");
		System.out.println(vo.getEmpno()+" "
	                      +vo.getEname()+" "
	                      +vo.getJob()+" "
	                      +vo.getMgr()+" "
	                      +vo.getHiredate().toString()+" "
	                      +vo.getSal()+" "
	                      +vo.getComm()+" "
	                      +vo.getDeptno());
		
		//원하는 컬럼(스캐너 기능이용)만 불러오기 
		System.out.println("이름 입력: ");
		String ename=scan.next();
		list=dao.empFindData(ename.toUpperCase());
		System.out.println("====================검색 결과====================");
		for(EmpVO vo1:list)
		{
			System.out.println(vo1.getEmpno()+" "
				              +vo1.getEname()+" "
				              +vo1.getJob()+" "
				              +vo1.getMgr()+" "
				              +vo1.getHiredate().toString()+" "
				              +vo1.getSal()+" "
				              +vo1.getComm()+" "
				              +vo1.getDeptno());
		}
		
		//원하는 컬럼(스캐너 기능이용)만 불러오기 2
		System.out.println("년도 입력: ");
		int year=scan.nextInt();
		list=dao.empRangeData(year);
		System.out.println("====================검색 결과====================");
		for(EmpVO vo2:list)
		{
			System.out.println(vo2.getEmpno()+" "
				              +vo2.getEname()+" "
				              +vo2.getJob()+" "
				              +vo2.getMgr()+" "
				              +vo2.getHiredate().toString()+" "
				              +vo2.getSal()+" "
				              +vo2.getComm()+" "
				              +vo2.getDeptno());
		}
		
		
	}

}
