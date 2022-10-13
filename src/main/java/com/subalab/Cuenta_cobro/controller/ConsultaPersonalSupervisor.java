package com.subalab.Cuenta_cobro.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.subalab.Cuenta_cobro.models.PojoPersonalSupervisor;
import com.subalab.Cuenta_cobro.service.PersonalSupervisorService;


@RestController
@RequestMapping("/")
@CrossOrigin(maxAge = 3600)
public class ConsultaPersonalSupervisor {
	
	@Autowired
	private PersonalSupervisorService personasSupervisorServicio;

		
	
	@GetMapping("PersonalSupervisor")
	public ResponseEntity<PojoPersonalSupervisor>obtenerlogin(@RequestParam("UserName")String UserName)
	{
		ResponseEntity<PojoPersonalSupervisor>respuesta=null;
		try {
			
			PojoPersonalSupervisor pojo = personasSupervisorServicio.obtener1(UserName);
			respuesta = new ResponseEntity<PojoPersonalSupervisor>(pojo,HttpStatus.OK); 
			
		} catch (Exception e) {
			
				System.out.print("Excepcion" + e.getMessage());
		}
		return respuesta;
	}

}
