package com.mx.nj.pet.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonRootName;

@Entity
@Table(name="APPOINTMENT")
@JsonRootName(value = "appointment")
public class Appointment {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;

	@Column(name="service")
	int service;
			
	@Column(name="from_date")
	Date fromDate;	
		
	@Column(name="to_date")
	Date toDate;			

	@ManyToOne
	@JoinColumn(name="from_user", nullable=false)
	Usuario fromUser;

	@ManyToOne
	@JoinColumn(name="to_user", nullable=false)
	Usuario toUser;

	@OneToOne
	@JoinColumn(name="pet", nullable=false)
	Pet pet;
	
	@Column(name="rating")
	int rating;
	
	@Column(name="review")
	String review;
	
	@Column(name="status")
	int status;
	
	
	public Appointment() {
		super();
	}

	public Appointment(Integer id, int service, Date fromDate, Date toDate, Usuario fromUser, Usuario toUser, Pet pet, int rating, String review, int status) {
		super();
		this.id = id;
		this.service = service;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.fromUser = fromUser;
		this.toUser = toUser;
		this.pet = pet;
		this.rating = rating;
		this.review = review;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getService() {
		return service;
	}

	public void setService(int service) {
		this.service = service;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public Usuario getFromUser() {
		return fromUser;
	}

	public void setFromUser(Usuario fromUser) {
		this.fromUser = fromUser;
	}

	public Usuario getToUser() {
		return toUser;
	}

	public void setToUser(Usuario toUser) {
		this.toUser = toUser;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}

