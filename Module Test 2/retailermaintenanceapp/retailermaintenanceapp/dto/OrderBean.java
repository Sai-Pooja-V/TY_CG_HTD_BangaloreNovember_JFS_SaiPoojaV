package com.cg.retailermaintenanceapp.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "order_info")
public class OrderBean {
	@Id
	@Column
	@GeneratedValue
	private int id; 

	@JsonIgnore
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "product_id", referencedColumnName = "id")
	private ProductBean productBean;
	
	@JsonIgnore
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	private UserBean userBean;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ProductBean getProductBean() {
		return productBean;
	}

	public void setProductBean(ProductBean productBean) {
		this.productBean = productBean;
	}

	public UserBean getUserBean() {
		return userBean;
	}

	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
	}
}
