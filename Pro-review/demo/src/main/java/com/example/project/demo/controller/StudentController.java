package com.example.project.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.project.demo.model.Student;
import com.example.project.demo.service.StudentService;

@RestController
@CrossOrigin
public class StudentController {
	@Autowired
	StudentService service;
	
	@PostMapping("/add")
	public Student adddata(@RequestBody Student studententity) {
		return service.saveinfo(studententity);
	}
	@GetMapping("/print")
	public List<Student> show(){
		return service.show();
	}
	@GetMapping("getlogin/{emailid}/{password}")
    public boolean login(@PathVariable String emailid,@PathVariable String password){
    	return service.getsignups(emailid, password);	
    }
	 @GetMapping("/studentSort/{field}")
	public List<Student> sort(@PathVariable String field)
	{
		return service.sort(field);
	}
	
	@GetMapping("/studentPage/{pno}/{psize}")
	public List<Student> sort(@PathVariable int pno, @PathVariable int psize)
	{
		return service.page(pno, psize);
	}
	
	@GetMapping("/studentPageAndSort/{pno}/{psize}/{field}")
	public List<Student> pageAndSort(@PathVariable int pno, @PathVariable int psize , @PathVariable String field)
	{
		return service.pageAndSort(pno, psize, field);
	}
	@PostMapping("add1")
	public Student save(@RequestBody Student student) {
	return service.saveinfo(student);
	}
	@GetMapping("print1")
	 public List<Student> getCoursebyStudent() {
	     return service.show();
	   }

}

