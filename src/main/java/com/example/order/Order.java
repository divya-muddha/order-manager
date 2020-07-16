package com.example.order;

import java.io.Serializable;
import java.util.Date;


public class Order implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4887002134601753873L;
	private long id;
	private long custId;
	private Date orderDate;
	private String status;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(long id, long custId, Date orderDate, String status) {
		super();
		this.id = id;
		this.custId = custId;
		this.orderDate = orderDate;
		this.status = status;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (custId ^ (custId >>> 32));
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (custId != other.custId)
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", custId=" + custId + ", orderDate=" + orderDate + ", status=" + status + "]";
	}
	
	
	

}
