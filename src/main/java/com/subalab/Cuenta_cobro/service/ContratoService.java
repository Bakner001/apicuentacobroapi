package com.subalab.Cuenta_cobro.service;

import java.util.List;

import javax.persistence.Tuple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subalab.Cuenta_cobro.dao.IConsultaContrato;
import com.subalab.Cuenta_cobro.models.PojoContrato;

@Service
public class ContratoService {
	
	
	@Autowired
	private IConsultaContrato Consultarepository;
	
	public PojoContrato obtenerc(String UserName) {
		 
		 PojoContrato pd = new PojoContrato();
			List<Tuple> pk = null;
			pk =  Consultarepository.encontrarUserporusername(UserName);
			for (int i = 0; i < pk.size(); i++) {
				pd.setUserName((pk.get(i).get(0)).toString());
				pd.setCEDULA((pk.get(i).get(1)).toString());
				pd.setN_CONTRATO((pk.get(i).get(2)).toString());
				pd.setFECHA_INICIO_CONTRATO((pk.get(i).get(3)).toString());
				pd.setFECHA_FINAL_CONTRATO((pk.get(i).get(4)).toString());
				pd.setVALOR_TOTAL_CONTRATO((pk.get(i).get(5)).toString());
				pd.setVALOR_CONTRATO((pk.get(i).get(6)).toString());
				pd.setDETALLE((pk.get(i).get(7)).toString());
				pd.setId_SIPSE((Integer)(pk.get(i).get(8)));
				pd.setDETALLE_SUPENCION((pk.get(i).get(9)).toString());
				pd.setVALOR_ADICION((pk.get(i).get(10)).toString());
				pd.setDETALLE_PRORROGA((pk.get(i).get(11)).toString());
				pd.setOBJETO_CONTRATO((pk.get(i).get(12)).toString()); 
				pd.setOBSERVACIONES_CONTRATO((pk.get(i).get(13)).toString());
				pd.setTIEMPO_MESES((pk.get(i).get(14)).toString());
				pd.setTIEMPO_DIAS((pk.get(i).get(15)).toString());
				pd.setDURACION_CONTRATO((Integer)(pk.get(i).get(16)));
				pd.setDETALLE_POR((pk.get(i).get(17)).toString());
				pd.setFECHA_INICAL_PRORROGA((pk.get(i).get(18).toString()));
				pd.setFECHA_FINAL_PRORROGA((pk.get(i).get(19).toString()));
				pd.setSUSPE_FECHA_INICIAL((pk.get(i).get(20).toString()));
				pd.setSUSPE_FECHA_FINAL((pk.get(i).get(21).toString()));
				pd.setRUBRO_PRESUPUESTAL((pk.get(i).get(22).toString()));
			}
			
			return pd;
	 }

}
