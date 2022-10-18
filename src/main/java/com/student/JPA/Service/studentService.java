package com.student.JPA.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.student.JPA.Model.student;
import com.student.JPA.Repositry.studentRepositry;
@Service
public class studentService {
	
	@Autowired
	private studentRepositry repo;
	
    // This is a method for add one student
	public String addStudent(student s1) {
		repo.save(s1);
		return "student added successfully";
	}
	
	// This is a method for get all student's
	public List<student> getAllstudents(){		
		List<student> studentList=new ArrayList<>();
		repo.findAll().forEach(studentList::add);
		return studentList;
	}
	
	// This is a method for one student
	public Optional<student> getstudent(int id) {
		return repo.findById(id);
	}
	
	// This is a method for delete student
      public String deletestudent(int id) {
		repo.deleteById(id);
		return "student deleted successfully";
	}
      
   // This is a method for add list of student's
      public String addallstudents(List<student> sl){
  		repo.saveAll(sl);
  		return "student's added successfully";
  	}
      
   // This is a method for find list of student's by name
      public student getStudentByName(String productName) {
  		return repo.findBystudentName(productName);
  	}
  	
}
