package com.exmerdevmicrob.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.exmerdevmicrob.model.DatosMicroservicioB;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class MicroservicioBConsume {
	/*
	 * Listener del microservicio A para guardar name, lastname y phone 
	*/
	
	private final ObjectMapper mapper = new ObjectMapper() ;
	@Autowired
	private IDatosMicroservicioBService microServiciosBService;
	
	 @RabbitListener(queues = "CREATED.DATOS.MICROSERVICESB")
	public void rabbitListener(String in) {
		try {
			DatosMicroservicioB datoMB= mapper.readValue(in, DatosMicroservicioB.class);
			microServiciosBService.save(datoMB);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

}
