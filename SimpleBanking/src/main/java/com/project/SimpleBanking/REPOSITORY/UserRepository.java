package com.project.SimpleBanking.REPOSITORY;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.SimpleBanking.ENTITY.USER;

public interface UserRepository extends JpaRepository< USER , Integer > {

}
