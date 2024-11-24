package com.example.demo.controller;




import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Stud;
import com.example.demo.model.Teach;

import com.example.demo.service.HomeService;
import com.example.demo.service.StudService;
import com.example.demo.service.TeachService;

@Controller
public class HomeController {
	
	@Autowired
	HomeService hs;
	
	
	@Autowired
	StudService ss;
	
	@Autowired
	TeachService ts;
	
	
	
	  
    @GetMapping("/students")
    public String listStudents(Model model)
    {
        List<Stud> students = ss.getAllStudents();
        model.addAttribute("students", students);
        return "students"; 
    }

    // Activate student
    @PostMapping("/activate/{id}")
    public String activateStudent(@PathVariable Long id) 
    {
        ss.activateStudent(id); 
        return "redirect:/students";
    }

    // Deactivate student
    @PostMapping("/deactivate/{id}")
    public String deactivateStudent(@PathVariable Long id) {
        ss.deactivateStudent(id);  
        return "redirect:/students"; 
    }
    
    
    // Display the list of Teachers
    @GetMapping("/teachers")
    public String listTeachers(Model model) {
        List<Teach> teachers = ts.getAllTeachers();
        model.addAttribute("teachers", teachers);
        return "teachers"; 
    }

    // Activate teacher
    @PostMapping("/activateTeach/{id}")
    public String activateteacher(@PathVariable Long id) {
        ts.activateTeach(id);  
        return "redirect:/teachers"; 
    }

    // Deactivate teacher
    @PostMapping("/deactivateTeach/{id}")
    public String deactivateteacher(@PathVariable Long id) {
        ts.deactivateTeach(id);  
        return "redirect:/teachers"; 
    }
    
    
	
	
	
	@RequestMapping("/index")
	public String index()
	{
		return "index";
	}
	
	@RequestMapping("/studentlogin")
	public String studentlogin()
	{
		return "studentLogin";
	}
	

	@RequestMapping("/attendane")
	public String attendane()
	{
		
		return "attendane";
	}
	
	@RequestMapping("/attend")
	public String attend()
	{
		return "redirect:/index";
	}
	
	@RequestMapping("/TeacherLogin")
	public String TeacherLogin()
	{
		return "TeacherLogin";
	}
	
	

	
	@RequestMapping("/adminLogin")
	public String adminLogin()
	{
		return "adminLogin";
	}
	
	
	@RequestMapping("/adminDash")
	public String adminDash()
	{
		return "adminDash";
	}
	
	
	@RequestMapping("/checkAdminCred")
    public String checkAdminCred(@RequestParam String admin, @RequestParam String password)
	{
        if (admin.equals("admin") && password.equals("admin@123")) 
        {
        
            return "adminDash";
        }
        else
        {
            return "redirect:/adminLogin";
        }

	}
	
	    
	   
	    
	    @RequestMapping("/AddTeacher")
	    public String AddTeacher()
	    {
	    	return "AddTeacher";
	    }
	    

	    
	    
	    
	    @PostMapping("/activateUser")
	    public String activateUser(@RequestParam("id") int id) {
	        hs.activateUser(id);
	        return "redirect:/studentInfoButton";
	    }

	    @PostMapping("/deactivateUser")
	    public String deactivateUser(@RequestParam("id") int id) {
	        hs.deactivateUser(id);
	        return "redirect:/studentInfoButton";
	    }

	    
	    
	    
	    @RequestMapping("/studLogin")
	    public String studLogin()
	    {
	    	return "stud";
	    }
	    
	    @PostMapping("/SaveStudInfo")
	    public String SaveStudInfo(@ModelAttribute("s1") Stud s1)
	    {
	    	ss.saveInfo(s1);
	    	return "redirect:/studentlogin";
	    }
	    
	    @PostMapping("/AddTeacherInfo")
	    public String AddTeacherInfo(@ModelAttribute("t1") Teach t1)
	    {
	    	ts.saveTeachInfo(t1);
	    	return "redirect:/adminDash";
	    }
	    
	    
	    
	    @GetMapping("/showStudInfo")
	    public String showStudInfo(Model m)
	    {
	    	List<Stud>l1=ss.showStudInfo();
	    	
	    	m.addAttribute("temp", l1);
	    	return "showStudInfo";
	    }
	    
	    
	    @GetMapping("/showStudProfile/{id}")
	    public String showStudProfile(@PathVariable Long id,Model m)
	    {
	    	Stud s1=ss.singleStudInfo(id);
	    	m.addAttribute("kk", s1);
	    	return "showStudProfile";
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	   

}
