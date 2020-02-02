package com.cg.springboot.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="employee_address_info")
public class EmployeeAddressBean {
	@Id
	@Column
	@GeneratedValue
	private int id;
	@Column(nullable = false)
	private String addressType;
	@Column
	private String address1;
	@Column
	private String address2;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="emp_id", referencedColumnName = "id") //referenceColumnName is used coz id is already used in this class
	private EmployeeBean emp;
	
	public EmployeeBean getEmp() {
		return emp;
	}
	public void setEmp(EmployeeBean emp) {
		this.emp = emp;
	}
	
	
}
