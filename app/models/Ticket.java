package models;

public class Ticket {
	private int ticketID;
	private String date;
	private int transactionID;
	private double price;

	public Ticket(String date, double price) {
		this.date = date;
		this.price = price;
	}



	/**
	* Returns value of ticketID
	* @return
	*/
	public int getTicketID() {
		return ticketID;
	}

	/**
	* Sets new value of ticketID
	* @param
	*/
	public void setTicketID(int ticketID) {
		this.ticketID = ticketID;
	}

	/**
	* Returns value of date
	* @return
	*/
	public String getDate() {
		return date;
	}

	/**
	* Sets new value of date
	* @param
	*/
	public void setDate(String date) {
		this.date = date;
	}

	/**
	* Returns value of transactionID
	* @return
	*/
	public int getTransactionID() {
		return transactionID;
	}

	/**
	* Sets new value of transactionID
	* @param
	*/
	public void setTransactionID(int transactionID) {
		this.transactionID = transactionID;
	}

	/**
	* Returns value of price
	* @return
	*/
	public double getPrice() {
		return price;
	}

	/**
	* Sets new value of price
	* @param
	*/
	public void setPrice(double price) {
		this.price = price;
	}
}
