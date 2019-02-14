package com.suraj.lambda;

public class OrderDetails {
	private String ordername;
	private double orderprice;

	public OrderDetails(String ordername, double orderprice) {
		this.ordername = ordername;
		this.orderprice = orderprice;
	}

	public String getOrdername() {
		return ordername;
	}

	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}

	public double getOrderprice() {
		return orderprice;
	}

	public void setOrderprice(double orderprice) {
		this.orderprice = orderprice;
	}

	@Override
	public String toString() {
		return "OrderDetails [ordername=" + ordername + ", orderprice="
				+ orderprice + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((ordername == null) ? 0 : ordername.hashCode());
		long temp;
		temp = Double.doubleToLongBits(orderprice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}


}