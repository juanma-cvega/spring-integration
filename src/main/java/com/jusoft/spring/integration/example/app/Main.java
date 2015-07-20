package com.jusoft.spring.integration.example.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jusoft.spring.integration.example.config.JmsConfig;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

	public static void main(final String... args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JmsConfig.class);
		log.info("Start....");
		ctx.registerShutdownHook();

	}
}
