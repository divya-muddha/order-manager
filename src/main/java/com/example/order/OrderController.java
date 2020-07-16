package com.example.order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/order")
public class OrderController {
	
	
	@Autowired
	OrderService orderService;
	
	
	@PostMapping(path="/create",consumes="application/json")
	@ResponseStatus(HttpStatus.CREATED)
	public void createOrder(@RequestBody Order order) {
		
		orderService.createOrder(order);
	    
		
	}
	
	
	@PostMapping(path="/update",consumes="application/json")
	@ResponseStatus(HttpStatus.OK)
	public void updateOrder(@RequestBody Order order) {
		
		orderService.updateOrder(order);
		
	}
	
	@GetMapping(path="/{id}")
	public Order findOrderById(@PathVariable long id) {
		
		return orderService.findOrderById(id);
		
	}
	
	@GetMapping(path="/customer/{custId}")
	public List<Order> findCustomerOrders(@PathVariable long custId) {
		
		return orderService.findCustomerOrders(custId);
	}
	
}
