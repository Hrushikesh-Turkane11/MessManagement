package com.app.core;

import java.time.LocalDate;

public class Customer {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String address;
	private LocalDate regDate;
	private LocalDate planEndDate;
	private String phoneNo;
	private Plan plan;
	private static int custCount;
	private  double final_amount;
	static {
		custCount=100;
	}
	@SuppressWarnings("static-access")
	public Customer( String firstName, String lastName, String email, String password, String address,
			LocalDate regDate, LocalDate planEndDate, String phoneNo, Plan plan, double final_amount) {
		super();
		this.custCount++;
		this.id=custCount;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.address = address;
		this.regDate = regDate;
		this.planEndDate = planEndDate;
		this.phoneNo = phoneNo;
		this.plan = plan;
		this.final_amount=final_amount;
	}
	public int getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	public String getAddress() {
		return address;
	}
	public LocalDate getRegDate() {
		return regDate;
	}
	public LocalDate getPlanEndDate() {
		return planEndDate;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public Plan getPlan() {
		return plan;
	}
	public static int getCustCount() {
		return custCount;
	}
	public double getFinal_amount() {
		return final_amount;
	}
	public void setFinal_amount(double final_amount) {
		this.final_amount = final_amount;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", address=" + address + ", regDate=" + regDate + ", planEndDate="
				+ planEndDate + ", phoneNo=" + phoneNo + ", plan=" + plan + ", final_amount=" + final_amount + "]";
	}
	
	
	
	
	
	
	
}
