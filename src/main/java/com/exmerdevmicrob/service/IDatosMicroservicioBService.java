package com.exmerdevmicrob.service;

import java.util.Optional;

import com.exmerdevmicrob.model.DatosMicroservicioB;

public interface IDatosMicroservicioBService {
	DatosMicroservicioB save(DatosMicroservicioB datosMicroservicioB );
	Optional<DatosMicroservicioB> findById(Integer id);
}
