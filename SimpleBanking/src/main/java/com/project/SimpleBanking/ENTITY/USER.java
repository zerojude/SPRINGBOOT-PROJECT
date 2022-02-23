package com.project.SimpleBanking.ENTITY;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class USER {

   @Id
   @GeneratedValue
   private int AccNo ;
   
   private String Name ;
   private String Email ; 
   private Long Balance ;
	
   
    	public USER() {
			super();
			// TODO Auto-generated constructor stub
		}
		public USER(int accNo, String name, String email, Long balance) {
			super();
			AccNo = accNo;
			Name = name;
			Email = email;
			Balance = balance;
		}
		public int getAccNo() {
			return AccNo;
		}
		public void setAccNo(int accNo) {
			AccNo = accNo;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public String getEmail() {
			return Email;
		}
		public void setEmail(String email) {
			Email = email;
		}
		public Long getBalance() {
			return Balance;
		}
		public void setBalance(Long balance) {
			Balance = balance;
		} 
		   
   
   
	
}
