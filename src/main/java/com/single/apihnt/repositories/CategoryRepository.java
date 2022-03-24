package com.single.apihnt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.single.apihnt.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{

}
