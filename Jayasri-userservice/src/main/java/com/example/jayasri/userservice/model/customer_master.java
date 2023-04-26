package com.example.jayasri.userservice.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer_master")
public class customer_master {
	@Id
    @Column(name="CUSTOMER_NUMBER")
	String customernumber;
	@Column(name="FIRSTNAME")
    String firstname;
	String middlename;
	String lastname;
	@Column(name="CUSTOMER_CITY")
	String city ;
	@Column(name="CUSTOMER_CONTACT_NO")
	String contactNo;
	@Column(name="occupation")
	String occupation ;
	@Column(name="CUSTOMER_DATE_OF_BIRTH")
	Date dob;
	public customer_master() {
		
	}
	public String getCustomernumber() {
		return customernumber;
	}
	public void setCustomernumber(String customernumber) {
		this.customernumber = customernumber;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public customer_master(String customernumber, String firstname, String middlename, String lastname, String city,
			String contactNo, String occupation, Date dob) {
		super();
		this.customernumber = customernumber;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.city = city;
		this.contactNo = contactNo;
		this.occupation = occupation;
		this.dob = dob;
	}
	
}
