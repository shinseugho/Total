package com.sist.dao;

//이름      널?       유형           
//------- -------- ------------ 
//NO      NOT NULL NUMBER       
//MNO              NUMBER       
//ID               VARCHAR2(20) 
//NAME    NOT NULL VARCHAR2(51) 
//MSG     NOT NULL CLOB         
//REGDATE          DATE         TO_CHAR(regdate,'YYYY-MM-DD HH24:MI:SS')
import java.util.*;

public class MusicReplyVO {
	
	private int no;
	private int mno;
	private String id;
	private String name;
	private String msg;
	private Date regdate;
	private String dbDay;
	private String sex;
	
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public String getDbDay() {
		return dbDay;
	}
	public void setDbDay(String dbDay) {
		this.dbDay = dbDay;
	}
	
	
}
