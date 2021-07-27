package com.nash.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.ToString;


@Data
@ToString
public class Company implements Serializable{
	
	private static final long serialVersionUID = -1961637238086262957L;

    private CompanyId companyId;
	private Address address;
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

}
