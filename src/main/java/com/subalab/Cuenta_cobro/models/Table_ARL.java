package com.subalab.Cuenta_cobro.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Table_ARL")
public class Table_ARL implements Serializable {
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ID_ARL")
	private Integer ID_ARL;
	
	@Column(name="NAM_ARL")
	private String NAM_ARL;

	public Integer getID_ARL() {
		return ID_ARL;
	}

	public void setID_ARL(Integer iD_ARL) {
		ID_ARL = iD_ARL;
	}

	public String getNAM_ARL() {
		return NAM_ARL;
	}

	public void setNAM_ARL(String nAM_ARL) {
		NAM_ARL = nAM_ARL;
	}
	
	

}
