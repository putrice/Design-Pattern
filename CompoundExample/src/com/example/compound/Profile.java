package com.example.compound;

public class Profile {
	String name;
	String position;
	String birthDate;
	
	public Profile(String name, String position, String birthDate) {
		super();
		this.name = name;
		this.position = position;
		this.birthDate = birthDate;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	public String getPosition() {
		return position;
	}
	
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	
	public String getBirthDate() {
		return birthDate;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
