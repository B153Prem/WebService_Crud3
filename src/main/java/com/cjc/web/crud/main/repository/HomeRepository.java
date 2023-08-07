package com.cjc.web.crud.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.web.crud.main.model.Audit;

@RestController
public interface HomeRepository extends JpaRepository<Audit, Integer> {
	
	   public Audit findAllByAid(int aid);
	   
	   
}
