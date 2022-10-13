package com.subalab.Cuenta_cobro.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Table_FONDO_PENSION")
public class Table_FONDO_PENSION implements Serializable {
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="IDFONDOPENSION")
	private Integer IDFONDOPENSION;
	
	@Column(name="PENSION")
	private String PENSION;

	public Integer getIDFONDOPENSION() {
		return IDFONDOPENSION;
	}

	public void setIDFONDOPENSION(Integer iDFONDOPENSION) {
		IDFONDOPENSION = iDFONDOPENSION;
	}

	public String getPENSION() {
		return PENSION;
	}

	public void setPENSION(String pENSION) {
		PENSION = pENSION;
	}
	
	

}
