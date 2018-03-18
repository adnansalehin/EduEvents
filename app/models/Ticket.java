package models;

import lombok.Data;

@Data
public class Ticket {
	int ticketID;
	String date;
	int transactionID;
	double price;

	public Ticket(String date, double price) {
		this.date = date;
		this.price = price;
	}
}
