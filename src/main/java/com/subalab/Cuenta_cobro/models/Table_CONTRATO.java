package com.subalab.Cuenta_cobro.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Table_CONTRATO")
public class Table_CONTRATO implements Serializable {
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="N_CONTRATO")
	private String N_CONTRATO;
	
	@Column(name="FECHA_INICIO_CONTRATO")
	private Date FECHA_INICIO_CONTRATO;
	
	@Column(name="FECHA_FINAL_CONTRATO")
	private Date FECHA_FINAL_CONTRATO;

	@Column(name="DURACION_CONTRATO")
	private Float DURACION_CONTRATO;
	
	@Column(name="VALOR_TOTAL_CONTRATO")
	private String VALOR_TOTAL_CONTRATO;
	
	@Column(name="VALOR_CONTRATO")
	private String VALOR_CONTRATO;
	
	@Column(name="id_tipocontrato")
	private Integer id_tipocontrato;
	
	@Column(name="id_SIPSE")
	private Integer id_SIPSE;
	
	@Column(name="ESTADO_SUSPENSION")
	private Integer SUSPENSION;

	@Column(name="VALOR_ADICION")
	private String ADICION;
	
	@Column(name="ESTADO_PRORROGA")
	private Integer PRORROGA;


	public String getN_CONTRATO() {
		return N_CONTRATO;
	}

	public void setN_CONTRATO(String n_CONTRATO) {
		N_CONTRATO = n_CONTRATO;
	}

	public Date getFECHA_INICIO_CONTRATO() {
		return FECHA_INICIO_CONTRATO;
	}

	public void setFECHA_INICIO_CONTRATO(Date fECHA_INICIO_CONTRATO) {
		FECHA_INICIO_CONTRATO = fECHA_INICIO_CONTRATO;
	}

	public Date getFECHA_FINAL_CONTRATO() {
		return FECHA_FINAL_CONTRATO;
	}

	public void setFECHA_FINAL_CONTRATO(Date fECHA_FINAL_CONTRATO) {
		FECHA_FINAL_CONTRATO = fECHA_FINAL_CONTRATO;
	}

	public Float getDURACION_CONTRATO() {
		return DURACION_CONTRATO;
	}

	public void setDURACION_CONTRATO(Float dURACION_CONTRATO) {
		DURACION_CONTRATO = dURACION_CONTRATO;
	}

	public String getVALOR_TOTAL_CONTRATO() {
		return VALOR_TOTAL_CONTRATO;
	}

	public void setVALOR_TOTAL_CONTRATO(String vALOR_TOTAL_CONTRATO) {
		VALOR_TOTAL_CONTRATO = vALOR_TOTAL_CONTRATO;
	}

	public String getVALOR_CONTRATO() {
		return VALOR_CONTRATO;
	}

	public void setVALOR_CONTRATO(String vALOR_CONTRATO) {
		VALOR_CONTRATO = vALOR_CONTRATO;
	}

	public Integer getId_tipocontrato() {
		return id_tipocontrato;
	}

	public void setId_tipocontrato(Integer id_tipocontrato) {
		this.id_tipocontrato = id_tipocontrato;
	}

	public Integer getId_SIPSE() {
		return id_SIPSE;
	}

	public void setId_SIPSE(Integer id_SIPSE) {
		this.id_SIPSE = id_SIPSE;
	}

	public Integer getSUSPENSION() {
		return SUSPENSION;
	}

	public void setSUSPENSION(Integer sUSPENSION) {
		SUSPENSION = sUSPENSION;
	}

	public String getADICION() {
		return ADICION;
	}

	public void setADICION(String aDICION) {
		ADICION = aDICION;
	}

	public Integer getPRORROGA() {
		return PRORROGA;
	}

	public void setPRORROGA(Integer pRORROGA) {
		PRORROGA = pRORROGA;
	}
	
	
	
}
