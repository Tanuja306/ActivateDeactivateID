package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.model.student;

public interface HomeRepo extends JpaRepository<student,Integer>{
	
	public student findByEmailAndPass(String email, String pass);
	

}
