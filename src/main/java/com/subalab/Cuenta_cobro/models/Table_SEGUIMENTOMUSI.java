package com.subalab.Cuenta_cobro.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Table_SEGUIMENTOMUSI")
public class Table_SEGUIMENTOMUSI {
	

	@Id
	@Column(name="Codigo_Propuesta")
	private String Codigo_Propuesta;
	
	@Column(name="Meta_Proyecto")
	private String Meta_Proyecto;
	
	@Column(name="CONSULTA_Codigo_Proyecto")
	private Integer CONSULTA_Codigo_Proyecto;
	
	@Column(name="Propuesta_Ciudadana")
	private String Propuesta_Ciudadana;
	
	@Column(name="Nombre_Proyecto")
	private String Nombre_Proyecto;
	
	@Column(name="Sector")
	private String Sector;

	public String getCodigo_Propuesta() {
		return Codigo_Propuesta;
	}

	public void setCodigo_Propuesta(String codigo_Propuesta) {
		Codigo_Propuesta = codigo_Propuesta;
	}

	public String getMeta_Proyecto() {
		return Meta_Proyecto;
	}

	public void setMeta_Proyecto(String meta_Proyecto) {
		Meta_Proyecto = meta_Proyecto;
	}

	public Integer getCONSULTA_Codigo_Proyecto() {
		return CONSULTA_Codigo_Proyecto;
	}

	public void setCONSULTA_Codigo_Proyecto(Integer cONSULTA_Codigo_Proyecto) {
		CONSULTA_Codigo_Proyecto = cONSULTA_Codigo_Proyecto;
	}

	public String getPropuesta_Ciudadana() {
		return Propuesta_Ciudadana;
	}

	public void setPropuesta_Ciudadana(String propuesta_Ciudadana) {
		Propuesta_Ciudadana = propuesta_Ciudadana;
	}

	public String getNombre_Proyecto() {
		return Nombre_Proyecto;
	}

	public void setNombre_Proyecto(String nombre_Proyecto) {
		Nombre_Proyecto = nombre_Proyecto;
	}

	public String getSector() {
		return Sector;
	}

	public void setSector(String sector) {
		Sector = sector;
	}

	
	
	

}
