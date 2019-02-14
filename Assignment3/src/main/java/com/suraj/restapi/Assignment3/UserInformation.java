package com.suraj.restapi.Assignment3;

public class UserInformation {

	String state,city,country;
	double zipCode;
	public UserInformation(String state, String city, String country) {
	
		this.state = state;
		this.city = city;
		this.country = country;
	}
	public UserInformation(double zipCode) {
		
		this.zipCode = zipCode;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserInformation [state=" + state + ", city=" + city
				+ ", country=" + country + "]";
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the zipCode
	 */
	public double getZipCode() {
		return zipCode;
	}
	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(double zipCode) {
		this.zipCode = zipCode;
	}
}
