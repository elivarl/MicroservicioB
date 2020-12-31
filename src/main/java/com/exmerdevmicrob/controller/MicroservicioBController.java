package com.exmerdevmicrob.controller;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exmerdevmicrob.model.DatosMicroservicioB;
import com.exmerdevmicrob.service.IDatosMicroservicioBService;

@RestController
@RequestMapping("/api/microservices/v1")
public class MicroservicioBController {
	Logger loggerTransaccionController = org.slf4j.LoggerFactory.getLogger(MicroservicioBController.class);
	
	@Autowired
	private IDatosMicroservicioBService microServiciosBService;
	
	@PostMapping("/requestmicrob") // solo para prueba de insert antes de implementar el sms con colas
	public void callMicroA(@RequestBody DatosMicroservicioB requestMicroB) {
		//guardar los datos solo para MB solo test
		microServiciosBService.save(requestMicroB);
	}
	
	
	@GetMapping("/requestmicrob/{id}")
	public DatosMicroservicioB DatosMicroservicioB(@PathVariable Integer id) {
		Optional<DatosMicroservicioB> optionalDatosMb=  microServiciosBService.findById(id);
		//si no esta presente el recurso		
		if (!optionalDatosMb.isPresent()) {
			throw new EntityNotFoundException("Datos con id: "+ id+" no encontrado");
		}
		
		return optionalDatosMb.get();
	}
	
	

}
