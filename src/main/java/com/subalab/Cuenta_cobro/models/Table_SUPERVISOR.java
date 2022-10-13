package com.subalab.Cuenta_cobro.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Table_SUPERVISOR")
public class Table_SUPERVISOR implements Serializable {
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ID_SUPERVISOR")
	private Integer ID_SUPERVISOR;
	
	@Column(name="NAME_SUPER")
	private String NAME_SUPER;
	
	@Column(name="CEDULA_SUPERVISOR")
	private Integer CEDULA_SUPERVISOR;
	
	@Column(name="CARGO")
	private String CARGO;

	public Integer getID_SUPERVISOR() {
		return ID_SUPERVISOR;
	}

	public void setID_SUPERVISOR(Integer iD_SUPERVISOR) {
		ID_SUPERVISOR = iD_SUPERVISOR;
	}

	public String getNAME_SUPER() {
		return NAME_SUPER;
	}

	public void setNAME_SUPER(String nAME_SUPER) {
		NAME_SUPER = nAME_SUPER;
	}

	public Integer getCEDULA_SUPERVISOR() {
		return CEDULA_SUPERVISOR;
	}

	public void setCEDULA_SUPERVISOR(Integer cEDULA_SUPERVISOR) {
		CEDULA_SUPERVISOR = cEDULA_SUPERVISOR;
	}

	public String getCARGO() {
		return CARGO;
	}

	public void setCARGO(String cARGO) {
		CARGO = cARGO;
	}
	
	

}
