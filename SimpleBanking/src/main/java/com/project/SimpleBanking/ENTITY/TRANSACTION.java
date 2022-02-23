package com.project.SimpleBanking.ENTITY;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity 
public class TRANSACTION {

	@Id
	@GeneratedValue
	private int Transaction_id ;
	
	private String From_user_name ;
	private int From_acc ;
	
	private String To_user_name ;
	private int To_acc ;
	
	private Long Amount ;

	public TRANSACTION() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TRANSACTION(int transaction_id, String from_user_name, int from_acc, String to_user_name, int to_acc,
			Long amount) {
		super();
		Transaction_id = transaction_id;
		From_user_name = from_user_name;
		From_acc = from_acc;
		To_user_name = to_user_name;
		To_acc = to_acc;
		Amount = amount;
	}

	public int getTransaction_id() {
		return Transaction_id;
	}

	public void setTransaction_id(int transaction_id) {
		Transaction_id = transaction_id;
	}

	public String getFrom_user_name() {
		return From_user_name;
	}

	public void setFrom_user_name(String from_user_name) {
		From_user_name = from_user_name;
	}

	public int getFrom_acc() {
		return From_acc;
	}

	public void setFrom_acc(int from_acc) {
		From_acc = from_acc;
	}

	public String getTo_user_name() {
		return To_user_name;
	}

	public void setTo_user_name(String to_user_name) {
		To_user_name = to_user_name;
	}

	public int getTo_acc() {
		return To_acc;
	}

	public void setTo_acc(int to_acc) {
		To_acc = to_acc;
	}

	public Long getAmount() {
		return Amount;
	}

	public void setAmount(Long amount) {
		Amount = amount;
	}

	
	
	
	
	
}
