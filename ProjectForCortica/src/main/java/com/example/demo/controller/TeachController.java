package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.TeachService;

@Controller
public class TeachController {
	
	@Autowired
	TeachService ts;
	
	 @PostMapping("/checkTeacherCred")
	    public String checkTeacherCred(@RequestParam("email") String email, @RequestParam("pass") String password, Model model) {
	        boolean loginSuccess = ts.authenticateTeach(email, password);
	        
	        if (loginSuccess) {
	            return "redirect:/showStudInfo";  
	        } else {
	            model.addAttribute("error", "Invalid login or your account is inactive.");
	            return "TeacherLogin";  
	        }
	    }

}
