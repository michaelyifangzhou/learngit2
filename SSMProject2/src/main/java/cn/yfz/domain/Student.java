package cn.yfz.domain;

import java.io.Serializable;

public class Student implements Serializable{
	private int sid;
	private String sname;
	private Classes classes;
	private String sex;
	private String birthplace;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Classes getClasses() {
		return classes;
	}
	public void setClasses(Classes classes) {
		this.classes = classes;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBirthplace() {
		return birthplace;
	}
	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", classes=" + classes + ", sex=" + sex + ", birthplace="
				+ birthplace + "]";
	}
	
}
