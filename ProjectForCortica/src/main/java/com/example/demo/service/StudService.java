package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Stud;
import com.example.demo.model.Teach;

public interface StudService {
    void activateStudent(Long id);
    void deactivateStudent(Long id);
    List<Stud> getAllStudents();
	boolean authenticateStudent(String email, String password);
	
	public Stud saveInfo(Stud s1);
	List<Stud> showStudInfo();
	Stud singleStudInfo(Long id);
	
	
	
	
}
