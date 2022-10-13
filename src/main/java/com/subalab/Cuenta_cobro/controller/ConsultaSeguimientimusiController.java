package com.subalab.Cuenta_cobro.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.subalab.Cuenta_cobro.models.Table_SEGUIMENTOMUSI;
import com.subalab.Cuenta_cobro.service.SeguimentoMusiService;

@RestController
@RequestMapping("/")
@CrossOrigin(maxAge = 3600)
public class ConsultaSeguimientimusiController {
	
	@Autowired
	private SeguimentoMusiService seguimentoservice;
	
	@GetMapping("musi")
	public ResponseEntity<Object>obtenermusi()
	{
		ResponseEntity<Object>respuesta=null;
		try {
			
			List<Table_SEGUIMENTOMUSI>lista=seguimentoservice.obtener();
			respuesta = new ResponseEntity<Object>(lista,HttpStatus.OK); 
			
		} catch (Exception e) {
			
				System.out.print("Excepcion" + e.getMessage());
		}
		return respuesta;
	}
	
	@GetMapping("codigopropuesta")
	public ResponseEntity<Table_SEGUIMENTOMUSI>obtenermusi(@RequestParam("Codigo_Propuesta")String Codigo_Propuesta)
	{
		ResponseEntity<Table_SEGUIMENTOMUSI>respuesta=null;
		try {
			
			Table_SEGUIMENTOMUSI pojo = seguimentoservice.obtener(Codigo_Propuesta);
			respuesta = new ResponseEntity<Table_SEGUIMENTOMUSI>(pojo,HttpStatus.OK); 
			
		} catch (Exception e) {
			
				System.out.print("Excepcion" + e.getMessage());
		}
		return respuesta;
	}
	
	

}
