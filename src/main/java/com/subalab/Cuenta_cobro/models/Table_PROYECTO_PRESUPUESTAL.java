package com.subalab.Cuenta_cobro.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Table_PROYECTO_PRESUPUESTAL")
public class Table_PROYECTO_PRESUPUESTAL implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ID_PROYECTO")
	private String ID_PROYECTO;

	public String getID_PROYECTO() {
		return ID_PROYECTO;
	}

	public void setID_PROYECTO(String iD_PROYECTO) {
		ID_PROYECTO = iD_PROYECTO;
	}
	
	

}
