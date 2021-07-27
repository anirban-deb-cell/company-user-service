package com.nash.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.nash.entity.CompanyUser;

@Repository
public interface UserRepository extends JpaRepository<CompanyUser, String> {
	
	@Query("SELECT u FROM CompanyUser u WHERE u.userId = ?1 and u.companyUniqueId = ?2")
	public CompanyUser retrievePasswordForUser(String userId, String companyUniqueId);

}
