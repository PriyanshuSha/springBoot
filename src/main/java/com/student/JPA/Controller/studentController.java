package com.student.JPA.Controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.student.JPA.Model.student;
import com.student.JPA.Service.studentService;

@RestController
public class studentController {
	
	@Autowired
	private studentService service;

	
	@RequestMapping(method=RequestMethod.POST, value="/addstudent")
	public String addStudent(@RequestBody student s1){
		return service.addStudent(s1);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/getstudent")
	public List<student> getAllstudents(){
		return service.getAllstudents();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/student/{id}")
	public Optional<student> getstudent(@PathVariable int id) {
		return service.getstudent(id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/student/{id}")
	public String deleteProduct(@PathVariable int id) {
		return service.deletestudent(id);
		
	}
	@RequestMapping(method=RequestMethod.POST, value="/addall")
	public String addAll(@RequestBody List<student> studentList){
		return service.addallstudents(studentList);
		}
	
	@RequestMapping(method=RequestMethod.GET,value="/productname/{name}")
	public student getStudentByName(@PathVariable String name)
	{
		return service.getStudentByName(name);
	}
	
}
