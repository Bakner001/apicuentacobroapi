package com.subalab.Cuenta_cobro.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Table_AREA")
public class Table_AREA implements Serializable {
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ID_AREA")
	private Integer ID_AREA;
	
	@Column(name="NAM_AREA")
	private String NAM_AREA;

	public Integer getID_AREA() {
		return ID_AREA;
	}

	public void setID_AREA(Integer iD_AREA) {
		ID_AREA = iD_AREA;
	}

	public String getNAM_AREA() {
		return NAM_AREA;
	}

	public void setNAM_AREA(String nAM_AREA) {
		NAM_AREA = nAM_AREA;
	}
	
	

}
