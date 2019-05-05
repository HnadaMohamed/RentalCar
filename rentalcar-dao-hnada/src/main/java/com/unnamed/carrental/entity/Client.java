package com.unnamed.carrental.entity;

public class Client {

	long idClient;
	String firstName;
	String lastName;
	String birthday;
	String adress;
	int phone;
	String signUpDay;

	public long getIdClient() {
		return idClient;
	}

	public void setIdClient(long idClient) {
		this.idClient = idClient;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getSignUpDay() {
		return signUpDay;
	}

	public void setSignUpDay(String signUpDay) {
		this.signUpDay = signUpDay;
	}

	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", firstName=" + firstName + ", lastName=" + lastName + ", birthday="
				+ birthday + ", adress=" + adress + ", phone=" + phone + ", signUpDay=" + signUpDay + "]";
	}

}
