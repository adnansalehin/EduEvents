package models;

import java.util.HashSet;

public class Report {
	private int reportID;
	private String message;
	private Event event;

	public Report(int reportID, String message, Event event) {
		this.reportID = reportID;
		this.message = message;
		this.event = event;
	}

	/**
	 * Returns value of reportID
	 *
	 * @return
	 */
	public int getReportID() {
		return reportID;
	}

	/**
	 * Sets new value of reportID
	 *
	 * @param
	 */
	public void setReportID(int reportID) {
		this.reportID = reportID;
	}

	/**
	 * Returns value of message
	 *
	 * @return
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Sets new value of message
	 *
	 * @param
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * Returns value of event
	 *
	 * @return
	 */
	public Event getEvent() {
		return event;
	}

	/**
	 * Sets new value of event
	 *
	 * @param
	 */
	public void setEvent(Event event) {
		this.event = event;
	}
}
