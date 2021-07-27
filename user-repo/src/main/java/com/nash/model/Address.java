package com.nash.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@NoArgsConstructor
public class Address implements Serializable{
	
	private static final long serialVersionUID = -511829269848785302L;
	
	private String line1;
	private String line2;
	private String locality;
	private Long pincode;
	private String state;
	private String country;
	private String gLat;
	private String gLog;
	
	
}
