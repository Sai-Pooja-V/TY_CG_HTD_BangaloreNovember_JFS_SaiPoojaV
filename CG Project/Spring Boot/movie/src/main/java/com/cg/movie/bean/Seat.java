package com.cg.movie.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "seat")
public class Seat {

	@Id
	@Column
	private int seatId;

	private enum seatStatus {
		Booked, Book
	};
	@Column
	private double seatPrice;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "showsId")
	private Show seaters;
	public int getSeatId() {
		return seatId;
	}
	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}
	public double getSeatPrice() {
		return seatPrice;
	}
	public void setSeatPrice(double seatPrice) {
		this.seatPrice = seatPrice;
	}
	public Show getSeaters() {
		return seaters;
	}
	public void setSeaters(Show seaters) {
		this.seaters = seaters;
	}
	
	

}
