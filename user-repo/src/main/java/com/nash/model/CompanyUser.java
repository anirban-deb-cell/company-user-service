package com.nash.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class CompanyUser {

	private String firstName;
	private String lastName;
	private String userId;
	private String companyUniqueId;
	private String email;
	private Long phoneNumber;
	private String password;
	private Profile profile;	
	
}
