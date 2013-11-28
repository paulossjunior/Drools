package br.edu.sr.ifes.mpn.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.joda.time.DateMidnight;
import org.joda.time.Years;

public class Customer {
	
	private String firstName;
	
	private String lastName;
	
	private Date dateBirth;
	
	private String email;
	
	private Address address;
	
	private String phoneNumber;
	
	private List<Account> accounts = new ArrayList<Account>();
	
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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

	public Date getDateBirth() {
		return dateBirth;
	}

	public void setDateBirth(Date dateBirth) {
		this.dateBirth = dateBirth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	
	@SuppressWarnings("deprecation")
	public int idade()
	{
		return 30;
	}

	
}
