package com.yckim.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yckim.model.Person;

@RestController
public class PersonKafkaService {

	@Value("${kafka.topic}")
	private String topic;
	
	@Autowired
	private KafkaTemplate<String, Person> kafkaTemplate;
	
	@PostMapping("/publish")
	public String publish(@RequestBody Person person) {
		kafkaTemplate.send(topic, person);
		return "Success Publish";
	}
	
}
