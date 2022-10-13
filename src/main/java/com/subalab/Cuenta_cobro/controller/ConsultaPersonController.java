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

import com.subalab.Cuenta_cobro.models.Login;
import com.subalab.Cuenta_cobro.models.PojoContratista;

import com.subalab.Cuenta_cobro.service.LoginService;
@RestController
@RequestMapping("/")
@CrossOrigin(maxAge = 3600)
public class ConsultaPersonController {
	
	@Autowired
	private LoginService serviciologin;
	
	@GetMapping("contratista")
	public ResponseEntity<Object>obtenerlogin()
	{
		ResponseEntity<Object>respuesta=null;
		try {
			
			List<Login>lista=serviciologin.obtener();
			respuesta = new ResponseEntity<Object>(lista,HttpStatus.OK); 
			
		} catch (Exception e) {
			
				System.out.print("Excepcion" + e.getMessage());
		}
		return respuesta;
	}
	
	
	@GetMapping("contratistaUser")
	public ResponseEntity<PojoContratista>obtenerlogin(@RequestParam("UserName")String UserName)
	{
		ResponseEntity<PojoContratista>respuesta=null;
		try {
			
			PojoContratista pojo = serviciologin.obtener(UserName);
			respuesta = new ResponseEntity<PojoContratista>(pojo,HttpStatus.OK); 
			
		} catch (Exception e) {
			
				System.out.print("Excepcion" + e.getMessage());
		}
		return respuesta;
	}
	


}
