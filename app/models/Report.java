package models;

import lombok.Data;

import java.util.HashSet;

@Data
public class Report {
	private int reportID;
  private String message;
  private Event event;

	public Report(int reportID, String message, Event event)
  {
    this.reportID = reportID;
    this.message = message;
    this.event = event;
  }
}
