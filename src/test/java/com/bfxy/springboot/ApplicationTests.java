package com.bfxy.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Autowired
	private RabbitTemplate rabbitTemplate;

	@Autowired
	private RabbitAdmin rabbitAdmin;
	@Test
	public void removeBinding() {
		rabbitAdmin.removeBinding(new Binding("queue-1", Binding.DestinationType.QUEUE,"exchange-5","",new HashMap<>()));
	}

	@Test
	public void binding() {
		rabbitAdmin.declareBinding(new Binding("queue-1", Binding.DestinationType.QUEUE,"exchange-5","",new HashMap<>()));
	}
}
