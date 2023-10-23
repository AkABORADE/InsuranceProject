package com.ak.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="drivertable")
public class Driver {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private	Integer id;
	@Column(name="policyId")
	private	Integer policyId;
	private	String firstName;
	private	String lastName;
	private	String dOB;
	private	String emailAddress;
	private	String mobileNumber;
	
	public Driver() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Driver(Integer id, Integer policyId, String firstName, String lastName, String dOB, String emailAddress,
			String mobileNumber) {
		super();
		this.id = id;
		this.policyId = policyId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dOB = dOB;
		this.emailAddress = emailAddress;
		this.mobileNumber = mobileNumber;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPolicyId() {
		return policyId;
	}

	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getdOB() {
		return dOB;
	}

	public void setdOB(String dOB) {
		this.dOB = dOB;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "Driver [id=" + id + ", policyId=" + policyId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", dOB=" + dOB + ", emailAddress=" + emailAddress + ", mobileNumber=" + mobileNumber + "]";
	}
	
}
