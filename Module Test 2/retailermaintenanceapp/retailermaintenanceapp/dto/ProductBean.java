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
@Table(name = "product_info")
public class ProductBean {
	@Id
	@Column
	@GeneratedValue
	private String id;
	@Column
	private String price;
	@Column(unique = true, nullable = false)
	private String name; 
	@Column
	private int quantity;
	@Column
	private String details;
	
	@JsonIgnore
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "product_id", referencedColumnName = "id")
	private OrderBean orderBeans;
	
	@JsonIgnore
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	private UserBean userBean;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public UserBean getUserBean() {
		return userBean;
	}

	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public OrderBean getOrderBeans() {
		return orderBeans;
	}

	public void setOrderBeans(OrderBean orderBeans) {
		this.orderBeans = orderBeans;
	}
	
}
