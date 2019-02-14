package com.suraj.collection_assignment;

public class Movie_Details {

	String mov_Name,lead_actor, lead_actress, genre;

	/**
	 * @return the mov_Name
	 */
	public String getMov_Name() {
		return mov_Name;
	}

	public Movie_Details(String mov_Name, String lead_actor,
			String lead_actress, String genre) {
		super();
		this.mov_Name = mov_Name;
		this.lead_actor = lead_actor;
		this.lead_actress = lead_actress;
		this.genre = genre;
	}

	/**
	 * @param mov_Name the mov_Name to set
	 */
	public void setMov_Name(String mov_Name) {
		this.mov_Name = mov_Name;
	}

	/**
	 * @return the lead_actor
	 */
	public String getLead_actor() {
		return lead_actor;
	}

	/**
	 * @param lead_actor the lead_actor to set
	 */
	public void setLead_actor(String lead_actor) {
		this.lead_actor = lead_actor;
	}

	/**
	 * @return the lead_actress
	 */
	public String getLead_actress() {
		return lead_actress;
	}

	/**
	 * @param lead_actress the lead_actress to set
	 */
	public void setLead_actress(String lead_actress) {
		this.lead_actress = lead_actress;
	}

	/**
	 * @return the genre
	 */
	public String getGenre() {
		return genre;
	}

	/**
	 * @param genre the genre to set
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
}
