package com.example.order;

import java.util.List;

public interface OrderService {
	
	public Order createOrder(Order order);
	
	public Order updateOrder(Order order);
	
	public Order findOrderById(long id);
	
	public List<Order> findCustomerOrders(long customerId);

}
