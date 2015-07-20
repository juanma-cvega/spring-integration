package com.jusoft.spring.integration.example.config;

import javax.jms.ConnectionFactory;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.connection.CachingConnectionFactory;

@Configuration
@EnableJms
@ComponentScan("com.jusoft")
public class JmsConfig {

	@Bean
	public DefaultJmsListenerContainerFactory jmsListenerContainerFactory() {
		DefaultJmsListenerContainerFactory listenerContainerFactory = new DefaultJmsListenerContainerFactory();
		listenerContainerFactory
				.setConnectionFactory(cachingConnectionFactory());
		return listenerContainerFactory;
	}

	@Bean
	public ConnectionFactory cachingConnectionFactory() {
		return new CachingConnectionFactory(activemqConnectionFactory());
	}

	@Bean
	public ConnectionFactory activemqConnectionFactory() {
		return new ActiveMQConnectionFactory(
				"tcp:localhost:61616?broker.persistent=false");
	}
}
