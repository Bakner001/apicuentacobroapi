package com.subalab.Cuenta_cobro.service;

import java.util.List;

import javax.persistence.Tuple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subalab.Cuenta_cobro.dao.IConsultaSeguimientomusi;
import com.subalab.Cuenta_cobro.models.Table_SEGUIMENTOMUSI;

@Service
public class SeguimentoMusiService {
	
	@Autowired
	private IConsultaSeguimientomusi consultaSeguimientorepository;
	
	public List<Table_SEGUIMENTOMUSI>obtener(){
		
		return consultaSeguimientorepository.findAll();
	}	
	
public Table_SEGUIMENTOMUSI obtener(String Codigo_Propuesta){
		
		Table_SEGUIMENTOMUSI pc = new Table_SEGUIMENTOMUSI();
		List<Tuple> pj = null;
		
		pj = consultaSeguimientorepository.encontrarCodigoPropuesta(Codigo_Propuesta);
		for (int i = 0; i < pj.size(); i++) {
			pc.setCodigo_Propuesta((pj.get(i).get(0)).toString());
			pc.setCONSULTA_Codigo_Proyecto((Integer)(pj.get(i).get(1)));
			pc.setMeta_Proyecto((pj.get(i).get(2)).toString());
			pc.setNombre_Proyecto((pj.get(i).get(3)).toString());
			pc.setPropuesta_Ciudadana((pj.get(i).get(4)).toString());
			pc.setSector((pj.get(i).get(5)).toString());
			
						
			
		}
		return pc;
			
	}	

}
