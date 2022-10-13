package com.subalab.Cuenta_cobro.service;

import java.util.List;

import javax.persistence.Tuple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subalab.Cuenta_cobro.dao.INumeropersonalSup;

import com.subalab.Cuenta_cobro.models.PojoNumeropersonal;

@Service
public class NumeropersonalSupService {
	@Autowired
	private INumeropersonalSup NumeropersonalSuprepository;
	
	public PojoNumeropersonal obtenerc(String UserName) {
		 
		 PojoNumeropersonal pd = new PojoNumeropersonal();
			List<Tuple> pk = null;
			pk =  NumeropersonalSuprepository.encontrarUserporusername(UserName);
			for (int i = 0; i < pk.size(); i++) {
			
				pd.setID_SUPERVISOR(pk.get(i).get(0).toString());
					
			}
			
			return pd;
	 }

}
