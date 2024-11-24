package com.example.demo.Dao;


import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.HomeRepo;
import com.example.demo.Repo.TeachRepo;
import com.example.demo.model.Teach;
import com.example.demo.model.student;
import com.example.demo.service.HomeService;

@Service
public class HomeDao implements HomeService{
	
	@Autowired
	HomeRepo hr;
	
	@Autowired
	TeachRepo tr;



//	@Override
//	public List<student> displayStudentInfo() {
//		
//		return hr.findAll();
//	}
//
//	@Override
//	public student ShowProfile(int id) {
//		
//		return hr.getById(id);
//	}



	@Override
    public void activateUser(int id) {
        student user = hr.findById(id)
                     .orElseThrow(() -> new RuntimeException("User not found with ID: " + id));
        user.setActive(true); // Assuming there's an `active` field in the User entity
        hr.save(user);
    }

    @Override
    public void deactivateUser(int id) {
    	student user = hr.findById(id)
                      .orElseThrow(() -> new RuntimeException("User not found with ID: " + id));
        user.setActive(false);
        hr.save(user);
    }
    
    

	@Override
	public void saveTeacherInfo(Teach t1) {
		 
		tr.save(t1);
		
	}

	
	

}
