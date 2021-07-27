package com.nash.model;


import java.io.Serializable;
import javax.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Embeddable
public class CompanyId implements Serializable {


	private static final long serialVersionUID = -6598228680063262876L;
	
	private String companyName;
	private String branchName;
	private String branchCode;
	private Boolean primaryCompany;
	
}
