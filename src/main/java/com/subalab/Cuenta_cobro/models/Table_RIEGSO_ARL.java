package com.subalab.Cuenta_cobro.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Table_RIEGSO_ARL")
public class Table_RIEGSO_ARL implements Serializable {
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ID_RIESGO")
	private Integer ID_RIESGO;
	
	@Column(name="DETALLE")
	private String DETALLE;

	public Integer getID_RIESGO() {
		return ID_RIESGO;
	}

	public void setID_RIESGO(Integer iD_RIESGO) {
		ID_RIESGO = iD_RIESGO;
	}

	public String getDETALLE() {
		return DETALLE;
	}

	public void setDETALLE(String dETALLE) {
		DETALLE = dETALLE;
	}
	
	

}
