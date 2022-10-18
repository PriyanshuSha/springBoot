package com.student.JPA.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class student {
	
	@Id
	private int StuId;
	private int StuRoll;
	private String StuName;
	private String StuCourse;
	
	

}
