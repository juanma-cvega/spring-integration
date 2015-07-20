package com.jusoft.spring.integration.example.persistence;

import com.jusoft.spring.integration.example.model.Customer;

public interface CustomerRepository {

	void storeCustomer(final Customer customer);
}
