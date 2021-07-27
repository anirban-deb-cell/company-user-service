package com.nash.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import lombok.ToString;


@Entity
@ToString
public class Company implements Serializable{
	
	private static final long serialVersionUID = -3590400809160922268L;

	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long companyUniqueId;
	
	@EmbeddedId
    private CompanyId companyId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id", referencedColumnName = "id")
	private Address address;
	private Boolean primaryCompany;
	private String email;
	private String phoneNumber;
	private String faxNumber;
	private String secondaryEmail;
	private String secondaryPhoneNumber;
	private BusinessType businessType; 
	private String gstn;
	private String vat;
	private String financialYear; 
	private Date creationDate;
	
	public Company() {
		super();
	}
	
	
	public Company(Long companyUniqueId, CompanyId companyId, Address address, Boolean primaryCompany, String email,
			String phoneNumber, String faxNumber, String secondaryEmail, String secondaryPhoneNumber,
			BusinessType businessType, String gstn, String vat, String financialYear, Date creationDate) {
		super();
		this.companyUniqueId = companyUniqueId;
		this.companyId = companyId;
		this.address = address;
		this.primaryCompany = primaryCompany;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.faxNumber = faxNumber;
		this.secondaryEmail = secondaryEmail;
		this.secondaryPhoneNumber = secondaryPhoneNumber;
		this.businessType = businessType;
		this.gstn = gstn;
		this.vat = vat;
		this.financialYear = financialYear;
		this.creationDate = creationDate;
	}


	public Long getCompanyUniqueId() {
		return companyUniqueId;
	}


	public void setCompanyUniqueId(Long companyUniqueId) {
		this.companyUniqueId = companyUniqueId;
	}


	public CompanyId getCompanyId() {
		return companyId;
	}


	public void setCompanyId(CompanyId companyId) {
		this.companyId = companyId;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public Boolean getPrimaryCompany() {
		return primaryCompany;
	}


	public void setPrimaryCompany(Boolean primaryCompany) {
		this.primaryCompany = primaryCompany;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getFaxNumber() {
		return faxNumber;
	}


	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}


	public String getSecondaryEmail() {
		return secondaryEmail;
	}


	public void setSecondaryEmail(String secondaryEmail) {
		this.secondaryEmail = secondaryEmail;
	}


	public String getSecondaryPhoneNumber() {
		return secondaryPhoneNumber;
	}


	public void setSecondaryPhoneNumber(String secondaryPhoneNumber) {
		this.secondaryPhoneNumber = secondaryPhoneNumber;
	}


	public BusinessType getBusinessType() {
		return businessType;
	}


	public void setBusinessType(BusinessType businessType) {
		this.businessType = businessType;
	}


	public String getGstn() {
		return gstn;
	}


	public void setGstn(String gstn) {
		this.gstn = gstn;
	}


	public String getVat() {
		return vat;
	}


	public void setVat(String vat) {
		this.vat = vat;
	}


	public String getFinancialYear() {
		return financialYear;
	}


	public void setFinancialYear(String financialYear) {
		this.financialYear = financialYear;
	}


	public Date getCreationDate() {
		return creationDate;
	}


	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
