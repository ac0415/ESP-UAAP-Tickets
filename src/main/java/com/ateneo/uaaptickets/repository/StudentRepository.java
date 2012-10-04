package com.ateneo.uaaptickets.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.enterprise.retail.entity.Student;

@Repository
public class StudentRepository extends JpaRepository<Student, Integer>{
	List<Student> findByFirstName(String firstName);
	List<Student> findByMiddleName(String middleName);
	List<Student> findByLastName(String lastName);
	List<Student> findByEmail(String email);
	List<Student> findByStudentId(Integer studentId);
}
