package com.single.apihnt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.single.apihnt.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{

}
