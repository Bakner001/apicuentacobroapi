package com.subalab.Cuenta_cobro;



import java.time.Duration;
import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

@RestController
@SpringBootApplication
public class CuentaCobroApplication {
	
	
@RequestMapping("/")
public String home() {
	return "en linea";
}


	public static void main(String[] args) {
		SpringApplication.run(CuentaCobroApplication.class, args);
	}
	
	
	public CorsConfigurationSource corsConfigurationSource() {
		  CorsConfiguration cc = new CorsConfiguration();
          cc.setAllowedHeaders(Arrays.asList("Origin,Accept", "X-Requested-With", "Content-Type", "Access-Control-Request-Method", "Access-Control-Request-Headers","Authorization"));
          cc.setExposedHeaders(Arrays.asList("Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"));                
          cc.setAllowedOrigins(Arrays.asList("/*"));
          cc.setAllowedMethods(Arrays.asList("GET", "POST", "OPTIONS", "PUT", "PATCH"));
          cc.addAllowedOrigin("*");
          cc.setMaxAge(Duration.ZERO);
          cc.setAllowCredentials(Boolean.TRUE);
		  UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		  source.registerCorsConfiguration("/**", cc);
			return (CorsConfigurationSource) source;
		}
					
		
	}

