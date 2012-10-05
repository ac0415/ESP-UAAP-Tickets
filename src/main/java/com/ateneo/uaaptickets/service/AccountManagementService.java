package com.ateneo.uaaptickets.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.PasswordEncoder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ateneo.uaaptickets.entity.Account;
import com.ateneo.uaaptickets.repository.AccountRepository;

@Service("accountManagementService")
public class AccountManagementService  implements UserDetailsService
{
	@Autowired
	private AccountRepository accountRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException 
	{
		return accountRepository.findByUsername(username);
	}
	
	public Account saveNewUser(Account account)
	{
		account.setPassword(passwordEncoder.encodePassword(account.getPassword(), null));
		
		return accountRepository.save(account);
	}
}
