package com.example.order;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService{

	public Order createOrder(Order order) {
		// TODO Auto-generated method stub
		return order;
	}

	public Order updateOrder(Order order) {
		// TODO Auto-generated method stub
		return order;
	}

	public Order findOrderById(long id) {
		// TODO Auto-generated method stub
		return new Order(id, id+1000, new Date(),"done");
	}

	public List<Order> findCustomerOrders(long customerId) {
		// TODO Auto-generated method stub
		List<Order> orders =  new ArrayList<Order>();
			orders.add(new Order(1234, customerId, new Date(),"done"));
			orders.add(new Order(9875, customerId, new Date(),"done"));
			
			return orders;
	
	}
	
	
	

}
