package com.subalab.Cuenta_cobro.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Table_BANCOS")
public class Table_BANCOS implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="IDBANCO")
	private Integer IDBANCO;
	
	@Column(name="NAME_BANCO")
	private String NAME_BANCO;

	public Integer getIDBANCO() {
		return IDBANCO;
	}

	public void setIDBANCO(Integer iDBANCO) {
		IDBANCO = iDBANCO;
	}

	public String getNAME_BANCO() {
		return NAME_BANCO;
	}

	public void setNAME_BANCO(String nAME_BANCO) {
		NAME_BANCO = nAME_BANCO;
	}
	
	
	
}
