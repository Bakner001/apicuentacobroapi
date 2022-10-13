package com.subalab.Cuenta_cobro.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Table_PERSONA_CONTRATISTA")
public class Table_PERSONA_CONTRATISTA implements Serializable {
	

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CEDULA")
	private String CEDULA;
	
	@Column(name="NOMBRES")
	private String NOMBRES;
	
	@Column(name="TELEFONO")
	private String TELEFONO;
	
	@Column(name="DIRECCION")
	private String DIRECCION;
	
	@Column(name="AREA")
	private Integer AREA;
	
	@Column(name="EPS")
	private Integer EPS;
	
	@Column(name="ARL")
	private Integer ARL;
	
	@Column(name="FONDO_PENSION")
	private Integer FONDO_PENSION;
	
	@Column(name="BANCO")
	private Integer BANCO;
	
	@Column(name="N_CUENTA_BANCO")
	private String N_CUENTA_BANCO;
	
	@Column(name="TIPO_BANCO")
	private Integer TIPO_BANCO;
	
	@Column(name="ALCALDE")
	private String ALCALDE;
	
	@Column(name="SUPERVISOR")
	private Integer SUPERVISOR;
	
	@Column(name="RIESGOS_ARL")
	private Integer RIESGOS_ARL;
	
	@Column(name="PROYECTO")
	private String PROYECTO;
	
	@Column(name="NCONTRATO")
	private String NCONTRATO;
	
	@Column(name="Firma_Contratista")
	private String Firma_Contratista;

	
	
	

	public String getCEDULA() {
		return CEDULA;
	}

	public String getNOMBRES() {
		return NOMBRES;
	}

	public String getTELEFONO() {
		return TELEFONO;
	}

	public String getDIRECCION() {
		return DIRECCION;
	}

	public Integer getAREA() {
		return AREA;
	}

	public Integer getEPS() {
		return EPS;
	}

	public Integer getARL() {
		return ARL;
	}

	public Integer getFONDO_PENSION() {
		return FONDO_PENSION;
	}

	public Integer getBANCO() {
		return BANCO;
	}

	public String getN_CUENTA_BANCO() {
		return N_CUENTA_BANCO;
	}

	public Integer getTIPO_BANCO() {
		return TIPO_BANCO;
	}

	public String getALCALDE() {
		return ALCALDE;
	}

	public Integer getSUPERVISOR() {
		return SUPERVISOR;
	}

	public Integer getRIESGOS_ARL() {
		return RIESGOS_ARL;
	}

	public String getPROYECTO() {
		return PROYECTO;
	}

	public String getNCONTRATO() {
		return NCONTRATO;
	}

	public String getFirma_Contratista() {
		return Firma_Contratista;
	}

	public void setCEDULA(String cEDULA) {
		CEDULA = cEDULA;
	}

	public void setNOMBRES(String nOMBRES) {
		NOMBRES = nOMBRES;
	}

	public void setTELEFONO(String tELEFONO) {
		TELEFONO = tELEFONO;
	}

	public void setDIRECCION(String dIRECCION) {
		DIRECCION = dIRECCION;
	}

	public void setAREA(Integer aREA) {
		AREA = aREA;
	}

	public void setEPS(Integer ePS) {
		EPS = ePS;
	}

	public void setARL(Integer aRL) {
		ARL = aRL;
	}

	public void setFONDO_PENSION(Integer fONDO_PENSION) {
		FONDO_PENSION = fONDO_PENSION;
	}

	public void setBANCO(Integer bANCO) {
		BANCO = bANCO;
	}

	public void setN_CUENTA_BANCO(String n_CUENTA_BANCO) {
		N_CUENTA_BANCO = n_CUENTA_BANCO;
	}

	public void setTIPO_BANCO(Integer tIPO_BANCO) {
		TIPO_BANCO = tIPO_BANCO;
	}

	public void setALCALDE(String aLCALDE) {
		ALCALDE = aLCALDE;
	}

	public void setSUPERVISOR(Integer sUPERVISOR) {
		SUPERVISOR = sUPERVISOR;
	}

	public void setRIESGOS_ARL(Integer rIESGOS_ARL) {
		RIESGOS_ARL = rIESGOS_ARL;
	}

	public void setPROYECTO(String pROYECTO) {
		PROYECTO = pROYECTO;
	}

	public void setNCONTRATO(String nCONTRATO) {
		NCONTRATO = nCONTRATO;
	}

	public void setFirma_Contratista(String firma_Contratista) {
		Firma_Contratista = firma_Contratista;
	}

	public Table_PERSONA_CONTRATISTA(String cEDULA, String nOMBRES, String tELEFONO, String dIRECCION, Integer aREA,
			Integer ePS, Integer aRL, Integer fONDO_PENSION, Integer bANCO, String n_CUENTA_BANCO, Integer tIPO_BANCO,
			String aLCALDE, Integer sUPERVISOR, Integer rIESGOS_ARL, String pROYECTO, String nCONTRATO,
			String firma_Contratista) {
		super();
		CEDULA = cEDULA;
		NOMBRES = nOMBRES;
		TELEFONO = tELEFONO;
		DIRECCION = dIRECCION;
		AREA = aREA;
		EPS = ePS;
		ARL = aRL;
		FONDO_PENSION = fONDO_PENSION;
		BANCO = bANCO;
		N_CUENTA_BANCO = n_CUENTA_BANCO;
		TIPO_BANCO = tIPO_BANCO;
		ALCALDE = aLCALDE;
		SUPERVISOR = sUPERVISOR;
		RIESGOS_ARL = rIESGOS_ARL;
		PROYECTO = pROYECTO;
		NCONTRATO = nCONTRATO;
		Firma_Contratista = firma_Contratista;
	}

	public Table_PERSONA_CONTRATISTA() {
		super();
	}
	

	
}
