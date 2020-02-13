package com.springboot.registration.app.repo;

import java.util.List;

import com.springboot.registration.app.model.Account;

public interface AccountRepository {
	
	List<Account> getAllAccounts();
	
	Account getAccount(String number);
}
