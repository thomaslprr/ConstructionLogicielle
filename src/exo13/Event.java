package exo13;

import java.util.ArrayList;
import java.util.Date;

public class Event {
	
	private int id;
	
	private String name;
	
	private String location;
	
	Date start;
	
	Date end;
	
	

	public Event(int id, String name, String location, Date start, Date end){
		this.id = id;
		this.name = name;
		this.location = location;
		this.start = start;
		this.end = end;
		
		if(start.after(end)) {
			throw new IllegalArgumentException("La date de début ne peut être après la date de fin");
		}
	}

	private final MultivaluedAttribute<Integer> alarms =
	        new MultivaluedAttribute<Integer>(new ArrayList<Integer>(),5);

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public MultivaluedAttribute<Integer> getAlarms() {
		return this.alarms;
	}
	
	
	
	
	
}
