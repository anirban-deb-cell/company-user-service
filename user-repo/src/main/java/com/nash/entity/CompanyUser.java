package com.nash.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Data
@NoArgsConstructor
@ToString
public class CompanyUser implements Serializable{

	private static final long serialVersionUID = 14869356344094292L;
	
	@Id
	@GeneratedValue
    private int id;
	
	private String firstName;
	private String lastName;
	private String userId;
	private String companyUniqueId;
	private String email;
	private Long phoneNumber;
	private String password;
	private Profile profile;	
	
}
