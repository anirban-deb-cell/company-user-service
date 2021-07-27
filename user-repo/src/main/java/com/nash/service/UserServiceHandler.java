package com.nash.service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nash.entity.CompanyUser;
import com.nash.repository.AddressRepository;
import com.nash.repository.CompanyRepository;
import com.nash.repository.UserRepository;

@Service
public class UserServiceHandler {
	
	@Autowired
	CompanyRepository companyRepository;
	@Autowired
	AddressRepository addressRepository;
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	EntityManager em;
	

	@Transactional
	public void create(CompanyUser user) {
		userRepository.save(user);
	}
	
	public CompanyUser retrieveUser(CompanyUser user) {
		CompanyUser userDetails = userRepository.retrievePasswordForUser(user.getUserId(),user.getCompanyUniqueId());
		return userDetails;
	}

}
