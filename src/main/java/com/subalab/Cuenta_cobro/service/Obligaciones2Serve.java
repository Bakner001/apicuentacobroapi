package com.subalab.Cuenta_cobro.service;

import java.util.List;
import javax.persistence.Tuple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.subalab.Cuenta_cobro.dao.IConsultaObligaciones2;
import com.subalab.Cuenta_cobro.models.PojoObligaciones2;

@Service
public class Obligaciones2Serve {
	@Autowired
	private IConsultaObligaciones2 Obligacioines2repository;
	
	
	 public PojoObligaciones2 obtener(String UserName) {
		
		PojoObligaciones2 pob = new PojoObligaciones2();
		List<Tuple> pk = null;
		pk = Obligacioines2repository.encontrarObligacionporusername(UserName);
		for(int i = 0; i< pk.size(); i++) {
			pob.setUserName((pk.get(i).get(0)).toString());
			pob.setNOMBRES((pk.get(i).get(1)).toString());
			pob.setN_CONTRATO((pk.get(i).get(2)).toString());
			pob.setIDSIPSE((pk.get(i).get(3)).toString());
			pob.setOBLIGACION_1((pk.get(i).get(4).toString()));
			pob.setOBLIGACION_2((pk.get(i).get(5).toString()));
			pob.setOBLIGACION_3((pk.get(i).get(6).toString()));
			pob.setOBLIGACION_4((pk.get(i).get(7).toString()));
			pob.setOBLIGACION_5((pk.get(i).get(8).toString()));
			pob.setOBLIGACION_6((pk.get(i).get(9).toString()));
			pob.setOBLIGACION_7((pk.get(i).get(10).toString()));
			pob.setOBLIGACION_8((pk.get(i).get(11).toString()));
			pob.setOBLIGACION_9((pk.get(i).get(12).toString()));
			pob.setOBLIGACION_10((pk.get(i).get(13).toString()));
			pob.setOBLIGACION_11((pk.get(i).get(14).toString()));
			pob.setOBLIGACION_12((pk.get(i).get(15).toString()));
			pob.setOBLIGACION_13((pk.get(i).get(16).toString()));
			pob.setOBLIGACION_14((pk.get(i).get(17).toString()));
			pob.setOBLIGACION_15((pk.get(i).get(18).toString()));
			pob.setOBLIGACION_16((pk.get(i).get(19).toString()));
			pob.setOBLIGACION_17((pk.get(i).get(20).toString()));
			pob.setOBLIGACION_18((pk.get(i).get(21).toString()));
			pob.setOBLIGACION_19((pk.get(i).get(22).toString()));
						
			
		}
		return pob;
}
}
