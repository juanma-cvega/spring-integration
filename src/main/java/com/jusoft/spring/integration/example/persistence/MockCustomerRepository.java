package com.jusoft.spring.integration.example.persistence;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.inject.Named;

import com.jusoft.spring.integration.example.model.Customer;

@Named
public class MockCustomerRepository implements CustomerRepository {

	private final Map<Long, Customer> customers;

	public MockCustomerRepository() {
		customers = new ConcurrentHashMap<>();
	}

	public void storeCustomer(final Customer customer) {
		customers.put(customer.getId(), customer);

	}

}
