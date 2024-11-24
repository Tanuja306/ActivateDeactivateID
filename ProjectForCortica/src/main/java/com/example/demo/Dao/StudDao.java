package com.example.demo.Dao;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.StudRepo;
import com.example.demo.model.Stud;
import com.example.demo.model.Teach;
import com.example.demo.service.StudService;

@Service
public class StudDao implements StudService {

    @Autowired
    private StudRepo studentRepository;
    
    

    @Override
    public void activateStudent(Long id) 
    {
        Stud student = studentRepository.findById(id)
                        .orElseThrow(() -> new RuntimeException("Student not found with ID: " + id));
        student.setActive(true);
        studentRepository.save(student);
    }

    @Override
    public void deactivateStudent(Long id)
    {
    	Stud student = studentRepository.findById(id)
                        .orElseThrow(() -> new RuntimeException("Student not found with ID: " + id));
        student.setActive(false);
        studentRepository.save(student);
    }

    @Override
    public List<Stud> getAllStudents() 
    {
        return studentRepository.findAll();
    }

	@Override
	public boolean authenticateStudent(String email, String password) 
	{
		 Optional<Stud> student = studentRepository.findByEmail(email);
	        if (student.isPresent()) {
	            if (student.get().isActive() && student.get().getEmail().equals(email)) {
	                return true; 
	            }
	        }
	        return false; 
	}
	

	@Override
	public Stud saveInfo(Stud s1) {
		
		return studentRepository.save(s1);
	}

	@Override
	public List<Stud> showStudInfo() {
		
		return studentRepository.findAll();
	}

	@Override
	public Stud singleStudInfo(Long id) {
		
		return studentRepository.getById(id);
	}

	
}
