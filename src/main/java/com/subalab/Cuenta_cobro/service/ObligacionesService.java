package com.subalab.Cuenta_cobro.service;

import java.util.List;

import javax.persistence.Tuple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subalab.Cuenta_cobro.dao.IConsultaObligaciones;
import com.subalab.Cuenta_cobro.models.PojoObligaciones;

@Service
public class ObligacionesService {
	
	
	@Autowired
	private IConsultaObligaciones Obligacioinesrepository;
	
	
	 public PojoObligaciones obtener(String UserName) {
		
		PojoObligaciones pob = new PojoObligaciones();
		List<Tuple> pk = null;
		pk = Obligacioinesrepository.encontrarObligacionporusername(UserName);
		for(int i = 0; i< pk.size(); i++) {
			
			pob.setIDSIPSE((pk.get(i).get(0)).toString());
			
			
		}
		return pob;
		
		
	}
	

}
