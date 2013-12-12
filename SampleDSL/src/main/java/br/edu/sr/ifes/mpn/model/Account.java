package br.edu.sr.ifes.mpn.model;

import java.util.Date;

public class Account {

	private long number;
	
	private String name;
	
	private long balance;
	
	private String currency;
	
	private Date startDate;
	
	private Date endDate;
	
	private AccountType type;
	
	private String interstRate;
	
	private String UUID;
	
	private String status;
	
	private Customer owner;

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	

	public AccountType getType() {
		return type;
	}

	public void setType(AccountType type) {
		this.type = type;
	}

	public String getInterstRate() {
		return interstRate;
	}

	public void setInterstRate(String interstRate) {
		this.interstRate = interstRate;
	}

	public String getUUID() {
		return UUID;
	}

	public void setUUID(String uUID) {
		UUID = uUID;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Customer getOwner() {
		return owner;
	}

	public void setOwner(Customer owner) {
		this.owner = owner;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	public String toString() {
	
		return (new Long(number)).toString();
	}
}
