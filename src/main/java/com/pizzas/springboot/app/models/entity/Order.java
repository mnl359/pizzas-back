package com.pizzas.springboot.app.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "orders")
public class Order implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idOrders;

	@NotEmpty
	@Size(max = 45)
	private String name;

	@Email
	@NotEmpty
	@Size(max = 45)
	private String email;

	@NotEmpty
	@Size(max = 45)
	@Column(name = "delivery")
	private String delivery;

	@NotNull
	@Column(name = "regular_client")
	private boolean regularClient;

	@Column(name = "order_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date orderAt;

	@Size(max = 100)
	private String notes;

	@Column(name = "coupon_code")
	private Long couponCode;

	@PrePersist
	public void prePersist() {
		orderAt = new Date();
	}

	public Long getIdOrders() {
		return idOrders;
	}

	public void setIdOrders(Long idOrders) {
		this.idOrders = idOrders;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDelivery() {
		return delivery;
	}

	public void setDelivery(String delivery) {
		this.delivery = delivery;
	}

	public boolean getRegularClient() {
		return regularClient;
	}

	public void setRegularClient(boolean regularClient) {
		this.regularClient = regularClient;
	}

	public Date getOrderAt() {
		return orderAt;
	}

	public void setOrderAt(Date orderAt) {
		this.orderAt = orderAt;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Long getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(Long couponCode) {
		this.couponCode = couponCode;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
