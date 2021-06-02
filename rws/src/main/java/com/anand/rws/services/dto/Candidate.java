package com.anand.rws.services.dto;


public class Candidate {

 private String name;
 private int age;
 private int passoutYear;

 public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getPassoutYear() {
	return passoutYear;
}
public void setPassoutYear(int passoutYear) {
	this.passoutYear = passoutYear;
}
@Override
public String toString() {
	return "Candidate [name=" + name + ", age=" + age + ", passoutYear=" + passoutYear + "]";
}
public Candidate(String name, int age, int passoutYear) {
	super();
	this.name = name;
	this.age = age;
	this.passoutYear = passoutYear;
}
public Candidate() {
	super();
	// TODO Auto-generated constructor stub
}

 
}
