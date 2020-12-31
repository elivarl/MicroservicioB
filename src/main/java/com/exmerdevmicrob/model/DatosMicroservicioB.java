package com.exmerdevmicrob.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "datosmicrob")
public class DatosMicroservicioB {
	//name, lastname y phone
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String lastname;
	private String phone;
	public DatosMicroservicioB() {

	}
	public DatosMicroservicioB(String name, String lastname, String phone) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "DatosMicroservicioB [name=" + name + ", lastname=" + lastname + ", phone=" + phone + "]";
	}		
}
