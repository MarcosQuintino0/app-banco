package Entities;

import java.text.SimpleDateFormat;

public class Cliente {

	private String name;
	private String address;
	private String email;
	private Integer accountNumber;
	private Double balance;
	
	private static SimpleDateFormat sdf =new SimpleDateFormat("HH:mm:ss");

	public Cliente() {
	}

	public Cliente(String name, String address, String email, Integer accountNumber, Double balance) {
		this.name = name;
		this.address = address;
		this.email = email;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double withdraw(Double amount) {
		return balance -= amount;
	}
	

	public Double deposit(Double amount) {
		return balance += amount;
	}

	public Double transfer(Double amount) {
		return balance -= amount;
	}

	public Double seeBalance() {
		return this.getBalance();
	}
	
	/*public Double savingsAccount() {
		 
	}*/
	public Double investmentAccount(Double amount) {
		 return balance -= amount;
		
	}
	
	@Override
	public String toString() {
		return "Hello " + name + ", address:" + address + ", email:" + email + ", balance:" + balance;
	}

}
