package com.subalab.Cuenta_cobro.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Tabla_TIPO_CUENTA_banco")
public class Tabla_TIPO_CUENTA_banco implements Serializable {
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="N_CUENTA")
	private Integer N_CUENTA;
	
	@Column(name="TIPO_CUENTA")
	private String TIPO_CUENTA;

	public Integer getN_CUENTA() {
		return N_CUENTA;
	}

	public void setN_CUENTA(Integer n_CUENTA) {
		N_CUENTA = n_CUENTA;
	}

	public String getTIPO_CUENTA() {
		return TIPO_CUENTA;
	}

	public void setTIPO_CUENTA(String tIPO_CUENTA) {
		TIPO_CUENTA = tIPO_CUENTA;
	}
	
	

}
