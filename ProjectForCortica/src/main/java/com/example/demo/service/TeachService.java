package com.example.demo.service;

import java.util.List;


import com.example.demo.model.Teach;

public interface TeachService {

	public Teach saveTeachInfo(Teach t1);
	
	public void activateTeach(Long id);
	
    public void deactivateTeach(Long id);
    
    public List<Teach> getAllTeachers();
    
	boolean authenticateTeach(String email, String password);

	

}
