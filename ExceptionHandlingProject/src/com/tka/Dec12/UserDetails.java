package com.tka.Dec12;

public class UserDetails {
 private String uname;;
 private long mno;
 private int age;
 public UserDetails(String uname, long mno, int age) {
	super();
	this.uname = uname;
	this.mno = mno;
	this.age = age;
 }
 public String getUname() {
	return uname;
 }
 public void setUname(String uname) {
	this.uname = uname;
 }
 public long getMno() {
	return mno;
 }
 public void setMno(long mno) {
	this.mno = mno;
 }
 public int getAge() {
	return age;
 }
 public void setAge(int age) {
	this.age = age;
 }
 @Override
 public String toString() {
	return "UserDetails [uname=" + uname + ", mno=" + mno + ", age=" + age + "]";
 }
 
}
