package com.jusoft.spring.integration.example.jms;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.jms.annotation.JmsListener;

import com.jusoft.spring.integration.example.model.Customer;
import com.jusoft.spring.integration.example.persistence.CustomerRepository;

@Named
public class CustomerMessageListener {

	@Inject
	private CustomerRepository customerRepository;

	@JmsListener(destination = "customer_queue")
	public void handleMessage(final Customer customer) {
		customerRepository.storeCustomer(customer);
	}
}
