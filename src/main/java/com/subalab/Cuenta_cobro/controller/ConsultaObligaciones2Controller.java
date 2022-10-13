package com.subalab.Cuenta_cobro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.subalab.Cuenta_cobro.models.PojoObligaciones2;
import com.subalab.Cuenta_cobro.service.Obligaciones2Serve;


@RestController
@RequestMapping("/")
@CrossOrigin(maxAge = 3600)
public class ConsultaObligaciones2Controller {
	
	@Autowired
	private Obligaciones2Serve servicio2Obligacion;
	
	@GetMapping("consultaObligaciones2")
	public ResponseEntity<Object>obtenerlogin(@RequestParam("UserName")String UserName)
	{
		ResponseEntity<Object>respuesta=null;
		try {
			PojoObligaciones2 pojo = servicio2Obligacion.obtener(UserName);
			respuesta = new ResponseEntity<Object>(pojo, HttpStatus.OK);
		} catch (Exception e) {
			System.out.print("Excepcion" + e.getMessage());
		}
		return respuesta;
	}
	
	

}
