package com.suraj.springassignment.customer_application;

public class Customer {
	String customerName;
	Address customerAddress;
	int customerId, customerContact;


	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerContact="
				+ customerContact + ", customerAddress=" + customerAddress
				+ ", customerId=" + customerId + "]";
	}

	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @param customerName
	 *            the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * @return the customerContact
	 */
	public int getCustomerContact() {
		return customerContact;
	}

	/**
	 * @param customerContact
	 *            the customerContact to set
	 */
	public void setCustomerContact(int customerContact) {
		this.customerContact = customerContact;
	}

	/**
	 * @return the customerAddress
	 */
	public Address getCustomerAddress() {
		return customerAddress;
	}

	public Customer(String customerName, Address customerAddress,
			int customerId, int customerContact) {
		super();
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerId = customerId;
		this.customerContact = customerContact;
	}

	/**
	 * @param customerAddress
	 *            the customerAddress to set
	 */
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}

	/**
	 * @return the customerId
	 */
	public int getCustomerId() {
		return customerId;
	}

	/**
	 * @param customerId
	 *            the customerId to set
	 */
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public void getCustomerDetails() {
		System.out.println("name: " + getCustomerName() + "\n " + "address: "
				+ getCustomerAddress() + "\n  " + "id: " + getCustomerId()
				+ " \n " + "phone: " + getCustomerContact());
	}

}
