package com.exmerdevmicrob.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exmerdevmicrob.dao.IDatosMicroservicioBDao;
import com.exmerdevmicrob.model.DatosMicroservicioB;

@Service
public class DatosMicroservicioBServiceImpl implements IDatosMicroservicioBService {
	
	@Autowired
	private IDatosMicroservicioBDao datosMicroservicioBDao; 

	@Override
	public DatosMicroservicioB save(DatosMicroservicioB datosMicroservicioB) {
		datosMicroservicioBDao.save(datosMicroservicioB);
		return datosMicroservicioB;
	}

	@Override
	public  Optional<DatosMicroservicioB>  findById(Integer id) {
		return datosMicroservicioBDao.findById(id);
	}

}
