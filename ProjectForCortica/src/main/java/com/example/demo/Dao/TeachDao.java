package com.example.demo.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.TeachRepo;

import com.example.demo.model.Teach;
import com.example.demo.service.TeachService;

@Service
public class TeachDao implements TeachService{
	
	@Autowired
	TeachRepo tr;

	@Override
	public Teach saveTeachInfo(Teach t1)
	{
		
		return tr.save(t1);
		
	}

	@Override
	public void activateTeach(Long id)
	{
		
		      Teach Teacher = tr.findById(id)
                .orElseThrow(() -> new RuntimeException("Teacher not found with ID: " + id));
		      Teacher.setActive(true);
               tr.save(Teacher);
		
	}

	@Override
	public void deactivateTeach(Long id) 
	{
		
		        Teach Teacher = tr.findById(id)
                .orElseThrow(() -> new RuntimeException("Teacher not found with ID: " + id));
		        Teacher.setActive(false);
               tr.save(Teacher);
		
	}

	@Override
	public List<Teach> getAllTeachers()
	{
		return tr.findAll();
		
	}

	@Override
	public boolean authenticateTeach(String email, String password) 
	{
		
		Optional<Teach> Teacher = tr.findByEmail(email);
        if (Teacher.isPresent()) {
            if (Teacher.get().isActive() && Teacher.get().getEmail().equals(email)) {
                return true; 
            }
        }
        return false; 
	}

	

}
