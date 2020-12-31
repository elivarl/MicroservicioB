package com.exmerdevmicrob.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exmerdevmicrob.model.DatosMicroservicioB;

@Repository
public interface IDatosMicroservicioBDao extends JpaRepository<DatosMicroservicioB, Integer> {

}
