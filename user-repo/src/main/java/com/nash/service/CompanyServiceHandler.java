package com.nash.service;

import java.util.List;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nash.entity.Address;
import com.nash.entity.Company;
import com.nash.repository.AddressRepository;
import com.nash.repository.CompanyRepository;

@Service
public class CompanyServiceHandler {
	
	@Autowired
	CompanyRepository companyRepository;
	@Autowired
	AddressRepository addressRepository;
	
	@Autowired
	EntityManager em;

	@Transactional
	public void create(Company company) {
        companyRepository.save(company);
	}
	
	@Transactional
	public List<Company> getAllCompany(){
		return companyRepository.findAll();
	}
	public Company getCompanyByPincode(Long pin) {
	
		Address add = addressRepository.findByPincode(pin);
		Company cp = add.getCompany();
		return cp;
	}
	
	
}
