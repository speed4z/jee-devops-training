package com.train.entities;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="events")
public class Event {
	@Id
	@GeneratedValue
	long id  ;
	String eventName ;
	LocalDate dateOfEvent ;
	@Column(name = "starts_at")
	LocalDateTime startTimeOfEvent;
	Duration durationOfEvent;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public LocalDate getDateOfEvent() {
		return dateOfEvent;
	}
	public void setDateOfEvent(LocalDate dateOfEvent) {
		this.dateOfEvent = dateOfEvent;
	}
	public LocalDateTime getStartTimeOfEvent() {
		return startTimeOfEvent;
	}
	public void setStartTimeOfEvent(LocalDateTime startTimeOfEvent) {
		this.startTimeOfEvent = startTimeOfEvent;
	}
	public Duration getDurationOfEvent() {
		return durationOfEvent;
	}
	public void setDurationOfEvent(Duration durationOfEvent) {
		this.durationOfEvent = durationOfEvent;
	}
	
	//Constructors
	public Event() {}
	
	public Event(String eventName, LocalDate dateOfEvent, LocalDateTime startTimeOfEvent, Duration durationOfEvent) {
		super();
		this.eventName = eventName;
		this.dateOfEvent = dateOfEvent;
		this.startTimeOfEvent = startTimeOfEvent;
		this.durationOfEvent = durationOfEvent;
	}
	
	public Event(long id, String eventName, LocalDate dateOfEvent, LocalDateTime startTimeOfEvent,
			Duration durationOfEvent) {
		super();
		this.id = id;
		this.eventName = eventName;
		this.dateOfEvent = dateOfEvent;
		this.startTimeOfEvent = startTimeOfEvent;
		this.durationOfEvent = durationOfEvent;
	}
	
	//toString
	@Override
	public String toString() {
		return "Event [id=" + id + ", eventName=" + eventName + ", dateOfEvent=" + dateOfEvent + ", startTimeOfEvent="
				+ startTimeOfEvent + ", durationOfEvent=" + durationOfEvent + "]";
	}
}
