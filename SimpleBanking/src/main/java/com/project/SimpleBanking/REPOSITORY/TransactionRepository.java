package com.project.SimpleBanking.REPOSITORY;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.SimpleBanking.ENTITY.TRANSACTION;

public interface TransactionRepository extends JpaRepository< TRANSACTION , Integer > {

}
