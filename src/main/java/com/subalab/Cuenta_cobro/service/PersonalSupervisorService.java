package com.subalab.Cuenta_cobro.service;

import java.util.List;

import javax.persistence.Tuple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subalab.Cuenta_cobro.dao.IConsultaPersonalSupervisor;
import com.subalab.Cuenta_cobro.models.PojoPersonalSupervisor;

@Service
public class PersonalSupervisorService {
	
	@Autowired
	private IConsultaPersonalSupervisor PersonalSupervisorRespository;
	
	public PojoPersonalSupervisor obtener1(String UserName) {
		PojoPersonalSupervisor pd = new PojoPersonalSupervisor();
		List<Tuple> pk = null;
		pk = PersonalSupervisorRespository.encontrarUserporusername(UserName);
		for(int i = 0; i < pk.size(); i++) {
			pd.setUsername(pk.get(i).get(0).toString());
			pd.setNOMBRES((pk.get(i).get(1).toString()));  
			
			
		}
		return pd;
	}
	

}
