package br.edu.sr.ifes.mpn.model;

import java.util.Date;

public class Transaction {

	private Account from;
	
	private Account to;
	
	private String status;
	
	private String description;
	
	private String currency;
	
	private Date date;
	
	private String UUID;

	public Account getFrom() {
		return from;
	}

	public void setFrom(Account from) {
		this.from = from;
	}

	public Account getTo() {
		return to;
	}

	public void setTo(Account to) {
		this.to = to;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getUUID() {
		return UUID;
	}

	public void setUUID(String uUID) {
		UUID = uUID;
	}
	
	
}
