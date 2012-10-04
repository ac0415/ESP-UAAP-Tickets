package com.ateneo.uaaptickets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ateneo.uaaptickets.entity.Student;
import com.ateneo.uaaptickets.entity.Account;

@Repository
public class StudentRepository extends JpaRepository<Student, Integer>{
	Student findByAccount(Account account);
	Student findByConfirmationString(String confirmationString);
}
