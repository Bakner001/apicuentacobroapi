package com.subalab.Cuenta_cobro.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Table_EPS")
public class Table_EPS implements Serializable {
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="IDEPS")
	private Integer IDEPS;
	
	@Column(name="NAME_EPS")
	private String NAME_EPS;

	public Integer getIDEPS() {
		return IDEPS;
	}

	public void setIDEPS(Integer iDEPS) {
		IDEPS = iDEPS;
	}

	public String getNAME_EPS() {
		return NAME_EPS;
	}

	public void setNAME_EPS(String nAME_EPS) {
		NAME_EPS = nAME_EPS;
	}
	
	

}
