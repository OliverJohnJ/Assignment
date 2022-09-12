package org.te.Logger;

public class User {
	
	  private String name;
	  private long phoneNumber;
	  private double balance;
	  private String upiId;
	public User(String name, long phoneNumber, int balance, String upiId) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.balance = balance;
		this.upiId = upiId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double lastBalance) {
		this.balance = lastBalance;
	}
	public String getUpiId() {
		return upiId;
	}
	public void setUpiId(String upiId) {
		this.upiId = upiId;
	}
	  
	
	
	

}
