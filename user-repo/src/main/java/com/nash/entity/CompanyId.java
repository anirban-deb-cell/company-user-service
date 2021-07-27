package com.nash.entity;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class CompanyId implements Serializable {
	
	private String companyName;
	private String branchName;
	private String branchCode;
	
	public CompanyId() {
		super();
	}

	public CompanyId(String companyName, String branchName, String branchCode) {
		super();
		this.companyName = companyName;
		this.branchName = branchName;
		this.branchCode = branchCode;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

}
