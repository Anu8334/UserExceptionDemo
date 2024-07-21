package com.ar.model;

public class Student {
	private long  id;
	private String sname;
	private double mp; //mp=>mass percentage
	public Student() {
		super();
	}
	public Student(long id, String sname, double mp) {
		super();
		this.id = id;
		this.sname = sname;
		this.mp = mp;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getMp() {
		return mp;
	}
	public void setMp(double mp) {
		this.mp = mp;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", sname=" + sname + ", mp=" + mp + "]";
	}
}
