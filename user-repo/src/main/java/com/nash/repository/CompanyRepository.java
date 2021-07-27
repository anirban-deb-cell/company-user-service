package com.nash.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nash.entity.Company;
import com.nash.entity.CompanyId;

@Repository
public interface CompanyRepository extends JpaRepository<Company, CompanyId> {

}
