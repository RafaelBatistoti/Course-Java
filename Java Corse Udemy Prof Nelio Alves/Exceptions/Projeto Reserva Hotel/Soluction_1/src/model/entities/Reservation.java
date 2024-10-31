package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Reservation {

	DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	private Integer roomNumber;
	private LocalDate checkIn;
	private LocalDate checkOut;
	
	public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) {
		super();
		this.roomNumber = roomNumber;
		this.checkIn    = checkIn;
		this.checkOut   = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public LocalDate getCheckIn() {
		return checkIn;
	}

	public LocalDate getCheckOut() {
		return checkOut;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public long duration() {
		long diasEntre = ChronoUnit.DAYS.between(checkIn, checkOut);
		return diasEntre;
	}

	public void updateDates(LocalDate checkIn, LocalDate checkOut) {
		this.checkIn  = checkIn;
		this.checkOut = checkOut;
	}

	@Override
	public String toString() {
		return "Room " + roomNumber 
				+ ", check-in: " + getCheckIn().format(dateFormatter) 
				+ ", check-out: " + getCheckOut().format(dateFormatter)
				+ ", " + duration() + " nights";
	}

}
