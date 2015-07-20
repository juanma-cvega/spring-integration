package com.jusoft.spring.integration.example.model;

import lombok.Data;

@Data
public class Customer implements Entity<Long> {

	private final Long id;
	private final String name;
	private final Address address;
}
