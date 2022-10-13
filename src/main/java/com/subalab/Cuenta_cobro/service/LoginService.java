package com.subalab.Cuenta_cobro.service;


import java.util.List;

import javax.persistence.Tuple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subalab.Cuenta_cobro.models.Login;
import com.subalab.Cuenta_cobro.models.PojoContratista;
import com.subalab.Cuenta_cobro.dao.IConsultaPerson;


@Service
public class LoginService {
	

	@Autowired
	private IConsultaPerson Consultarepository;
	


	public List<Login> obtener(){
		
		return Consultarepository.findAll();
	}	
	
	
	
	public PojoContratista obtener(String UserName){
		
		PojoContratista pc = new PojoContratista();
		List<Tuple> pj = null;
		
		pj = Consultarepository.encontrarUserporusername(UserName);
		for (int i = 0; i < pj.size(); i++) {
			pc.setUserName((pj.get(i).get(0)).toString());
			pc.setROL((pj.get(i).get(1)).toString());
			pc.setPassWord((pj.get(i).get(2)).toString());
			pc.setCEDULA((pj.get(i).get(3)).toString());
			pc.setNAM_AREA((pj.get(i).get(4)).toString());
			pc.setNAME_EPS((pj.get(i).get(5)).toString());
			pc.setNAM_ARL((pj.get(i).get(6)).toString());
			pc.setPENSION((pj.get(i).get(7)).toString());
			pc.setNAME_BANCO((pj.get(i).get(8)).toString());
			pc.setTIPO_CUENTA((pj.get(i).get(9)).toString());
			pc.setNAME_SUPER((pj.get(i).get(10)).toString());
			pc.setID_RIESGO((Integer)(pj.get(i).get(11)));
			pc.setID_PROYECTO((pj.get(i).get(12).toString()));
			pc.setN_CONTRATO((pj.get(i).get(13).toString()));
			pc.setNOMBRES((pj.get(i).get(14).toString()));
			pc.setTELEFONO((pj.get(i).get(15).toString()));
			pc.setDIRECCION((pj.get(i).get(16).toString()));
			pc.setN_CUENTA_BANCO((pj.get(i).get(17).toString()));
			pc.setCEDULA_SUPERVISOR((pj.get(i).get(18).toString()));
			pc.setCiudad_cedula_supervisor((pj.get(i).get(19).toString()));
			pc.setCARGO((pj.get(i).get(20).toString()));
			pc.setDETALLE_POR((pj.get(i).get(21).toString()));
			//pc.setFirma_Contratista((pj.get(i).get(21).toString()));
			
			
			
		}
		return pc;
			
	}	
	 
	
}

