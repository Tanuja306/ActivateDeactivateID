package com.example.demo.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.model.Teach;

public interface TeachRepo extends JpaRepository<Teach,Long>
{

	
	Optional<Teach> findByEmail(String email);
}
