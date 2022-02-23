package com.project.SimpleBanking.CONTROLLER;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.SimpleBanking.ENTITY.TRANSACTION;
import com.project.SimpleBanking.ENTITY.TRANSFER;
import com.project.SimpleBanking.ENTITY.USER;
import com.project.SimpleBanking.REPOSITORY.TransactionRepository;
import com.project.SimpleBanking.REPOSITORY.UserRepository;

@RestController
public class TransactionController {

	@Autowired
    TransactionRepository transactionRepository ; 
	
	@Autowired
	UserRepository userRepository ; 
	
	
	
	@GetMapping("/transaction")
	List<TRANSACTION> all()
	{
		return transactionRepository.findAll();
	}
	
	@GetMapping("/transaction/{id}")
	public Optional<TRANSACTION> one( @PathVariable int id )
	{
		return transactionRepository.findById(id);
	}
	
	@GetMapping("/{id}/transaction")
	public List<TRANSACTION> userTransaction( @PathVariable int id )
	{
		List<TRANSACTION> all_T = new ArrayList<>();
		List<TRANSACTION> res = new ArrayList<>();
		
		all_T = all();

		for( TRANSACTION T : all_T )
		{
			if( T.getFrom_acc() == id || T.getTo_acc() == id )
				res.add(T);
		}
		
		return res ;
		
	}
	
	
	private void consistancy( int id , long c )
	{
		USER a = userRepository.getById(id);
		Long before = a.getBalance();
		a.setBalance(before+c);
		userRepository.save(a);
	}
	
	@PostMapping("/transaction")
	public String process(@RequestBody TRANSFER T )
	{
		
		int a = T.getFrom();
		int b = T.getTo() ;
		Long c = T.getAmount() ;
		
		if( a == b )
		{
			return "self Transfer not allowed" ; 
		}
		
		consistancy( a , -c );
		consistancy( b , c );
		
		
		
		// add transaction in table
		
		USER fromUser = userRepository.getById(a) ;
		USER toUser = userRepository.getById(b) ; 
		
		
		TRANSACTION res = new TRANSACTION( 11354 , fromUser.getName() , a , toUser.getName() , b , c ) ; 
	
		transactionRepository.save(res);
		return "the payment is done";
	}
	
	
	@DeleteMapping("/transaction")
	public String deleteAll()
	{
		transactionRepository.deleteAll();
	    return "every transaction history is deleted" ; 
	}
}
