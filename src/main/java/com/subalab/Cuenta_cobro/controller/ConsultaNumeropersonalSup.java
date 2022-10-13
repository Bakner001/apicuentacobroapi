package com.subalab.Cuenta_cobro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.subalab.Cuenta_cobro.models.PojoNumeropersonal;
import com.subalab.Cuenta_cobro.service.NumeropersonalSupService;

@RestController
@RequestMapping("/")
@CrossOrigin(maxAge = 3600)
public class ConsultaNumeropersonalSup {

	@Autowired
	private NumeropersonalSupService servicionumeropersonassup;
	
	@GetMapping("numeropersonalsup")
	public ResponseEntity<Object>obtenerlogin(@RequestParam("UserName")String UserName)
	{
		ResponseEntity<Object>respuesta=null;
		try {
			PojoNumeropersonal pojo = servicionumeropersonassup.obtenerc(UserName);
			respuesta = new ResponseEntity<Object>(pojo, HttpStatus.OK);
		} catch (Exception e) {
			System.out.print("Excepcion" + e.getMessage());
		}
		return respuesta;
	}
	
	
	
}
