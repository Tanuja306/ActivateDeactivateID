package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.StudService;

@Controller
public class LoginController {

    @Autowired
    private StudService studentService;
    
    
    
    

    @PostMapping("/checkStudentCred")
    public String checkStudentCred(@RequestParam("email") String email, @RequestParam("pass") String password, Model model) {
        boolean loginSuccess = studentService.authenticateStudent(email, password);
        
        if (loginSuccess) {
            return "redirect:/attendane";  
        } else {
            model.addAttribute("error", "Invalid login or your account is inactive.");
            return "studentLogin";  
        }
    }
}
