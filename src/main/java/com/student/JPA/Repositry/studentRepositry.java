package com.student.JPA.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.JPA.Model.student;

@Repository
public interface studentRepositry extends JpaRepository<student,Integer>{

	student findBystudentName(String productName);

}
