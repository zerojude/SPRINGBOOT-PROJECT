package com.project.SimpleBanking.ENTITY;

public class TRANSFER {
	
	public int from ;
	public int to ;
	public Long amount ;
	
	
	public TRANSFER() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TRANSFER(int from, int to, Long amount) {
		super();
		this.from = from;
		this.to = to;
		this.amount = amount;
	}
	public int getFrom() {
		return from;
	}
	public void setFrom(int from) {
		this.from = from;
	}
	public int getTo() {
		return to;
	}
	public void setTo(int to) {
		this.to = to;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	
	
	

}
