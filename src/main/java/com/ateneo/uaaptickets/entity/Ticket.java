package com.ateneo.uaaptickets.entity;

import javax.persistence.*;

import java.util.Date;

import com.sun.istack.internal.NotNull;

@Entity(name="ticket")
public class Ticket {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	@NotNull
	private int ticketId;
	
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}	

	@ManyToOne
	@JoinColumn(name="student_id")
	private Student student;

	@ManyToOne
	@JoinColumn(name="event_id")
	private Event event;

	@ManyToOne
	@JoinColumn(name="seat_price_id")
	private SeatPrice seatPrice;

	@Column(name="created_at")
	private Date createdAt;

	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Event getEvent() {
		return event;
	}
	public void setEvent(Event event) {
		this.event = event;
	}
	public SeatPrice getSeatPrice() {
		return seatPrice;
	}
	public void setSeatPrice(SeatPrice seatPrice) {
		this.seatPrice = seatPrice;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

		
}
