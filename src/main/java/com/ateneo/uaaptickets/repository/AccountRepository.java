package com.ateneo.uaaptickets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ateneo.uaaptickets.entity.Account;

@Repository
public class AccountRepository extends JpaRepository<Account, Integer>{
	Account findByUsername(String username);
	Account findByEmail(String email);
}
