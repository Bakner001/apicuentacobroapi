package com.subalab.Cuenta_cobro.models;

public class PojoContrato {
	
	private String UserName;
	private String CEDULA;
	private String N_CONTRATO;
	private String FECHA_INICIO_CONTRATO;
	private String FECHA_FINAL_CONTRATO;
	private String VALOR_TOTAL_CONTRATO;     
	private String VALOR_CONTRATO;			
	private String DETALLE;
	private String VALOR_ADICION;			
	private String DETALLE_PRORROGA;
	private Integer id_SIPSE;
	private String DETALLE_SUPENCION;	
	private String OBJETO_CONTRATO;
	private String OBSERVACIONES_CONTRATO;
	private String TIEMPO_MESES;
	private String TIEMPO_DIAS;
	private Integer DURACION_CONTRATO;
	private String DETALLE_POR;
	private String FECHA_INICAL_PRORROGA;
	private String FECHA_FINAL_PRORROGA;
	private String SUSPE_FECHA_INICIAL;
	private String SUSPE_FECHA_FINAL;
	private String RUBRO_PRESUPUESTAL;
	
	
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getCEDULA() {
		return CEDULA;
	}
	public void setCEDULA(String cEDULA) {
		CEDULA = cEDULA;
	}
	public String getN_CONTRATO() {
		return N_CONTRATO;
	}

	public void setN_CONTRATO(String n_CONTRATO) {
		N_CONTRATO = n_CONTRATO;
	}
	public String getFECHA_INICIO_CONTRATO() {
		return FECHA_INICIO_CONTRATO;
	}
	public void setFECHA_INICIO_CONTRATO(String string) {
		FECHA_INICIO_CONTRATO = string;
	}
	public String getFECHA_FINAL_CONTRATO() {
		return FECHA_FINAL_CONTRATO;
	}
	public void setFECHA_FINAL_CONTRATO(String fECHA_FINAL_CONTRATO) {
		FECHA_FINAL_CONTRATO = fECHA_FINAL_CONTRATO;
	}
	public String getDETALLE() {
		return DETALLE;
	}
	public void setDETALLE(String dETALLE) {
		DETALLE = dETALLE;
	}
	public String getDETALLE_PRORROGA() {
		return DETALLE_PRORROGA;
	}
	public void setDETALLE_PRORROGA(String dETALLE_PRORROGA) {
		DETALLE_PRORROGA = dETALLE_PRORROGA;
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
	public String getVALOR_ADICION() {
		return VALOR_ADICION;
	}
	public void setVALOR_ADICION(String vALOR_ADICION) {
		VALOR_ADICION = vALOR_ADICION;
	}
	public Integer getId_SIPSE() {
		return id_SIPSE;
	}
	public void setId_SIPSE(Integer id_SIPSE) {
		this.id_SIPSE = id_SIPSE;
	}
	public String getDETALLE_SUPENCION() {
		return DETALLE_SUPENCION;
	}
	public void setDETALLE_SUPENCION(String dETALLE_SUPENCION) {
		DETALLE_SUPENCION = dETALLE_SUPENCION;
	}
	public String getOBJETO_CONTRATO() {
		return OBJETO_CONTRATO;
	}
	public void setOBJETO_CONTRATO(String oBJETO_CONTRATO) {
		OBJETO_CONTRATO = oBJETO_CONTRATO;
	}
	public String getOBSERVACIONES_CONTRATO() {
		return OBSERVACIONES_CONTRATO;
	}
	public void setOBSERVACIONES_CONTRATO(String oBSERVACIONES_CONTRATO) {
		OBSERVACIONES_CONTRATO = oBSERVACIONES_CONTRATO;
	}

	public String getTIEMPO_MESES() {
		return TIEMPO_MESES;
	}
	public void setTIEMPO_MESES(String tIEMPO_MESES) {
		TIEMPO_MESES = tIEMPO_MESES;
	}
	public String getTIEMPO_DIAS() {
		return TIEMPO_DIAS;
	}
	public void setTIEMPO_DIAS(String tIEMPO_DIAS) {
		TIEMPO_DIAS = tIEMPO_DIAS;
	}
	public Integer getDURACION_CONTRATO() {
		return DURACION_CONTRATO;
	}
	public void setDURACION_CONTRATO(Integer dURACION_CONTRATO) {
		DURACION_CONTRATO = dURACION_CONTRATO;
	}
	public String getDETALLE_POR() {
		return DETALLE_POR;
	}
	public void setDETALLE_POR(String dETALLE_POR) {
		DETALLE_POR = dETALLE_POR;
	}
	public String getFECHA_INICAL_PRORROGA() {
		return FECHA_INICAL_PRORROGA;
	}
	public void setFECHA_INICAL_PRORROGA(String fECHA_INICAL_PRORROGA) {
		FECHA_INICAL_PRORROGA = fECHA_INICAL_PRORROGA;
	}
	public String getFECHA_FINAL_PRORROGA() {
		return FECHA_FINAL_PRORROGA;
	}
	public void setFECHA_FINAL_PRORROGA(String fECHA_FINAL_PRORROGA) {
		FECHA_FINAL_PRORROGA = fECHA_FINAL_PRORROGA;
	}
	public String getSUSPE_FECHA_INICIAL() {
		return SUSPE_FECHA_INICIAL;
	}
	public void setSUSPE_FECHA_INICIAL(String sUSPE_FECHA_INICIAL) {
		SUSPE_FECHA_INICIAL = sUSPE_FECHA_INICIAL;
	}
	public String getSUSPE_FECHA_FINAL() {
		return SUSPE_FECHA_FINAL;
	}
	public void setSUSPE_FECHA_FINAL(String sUSPE_FECHA_FINAL) {
		SUSPE_FECHA_FINAL = sUSPE_FECHA_FINAL;
	}
	public String getRUBRO_PRESUPUESTAL() {
		return RUBRO_PRESUPUESTAL;
	}
	public void setRUBRO_PRESUPUESTAL(String rUBRO_PRESUPUESTAL) {
		RUBRO_PRESUPUESTAL = rUBRO_PRESUPUESTAL;
	}



}
