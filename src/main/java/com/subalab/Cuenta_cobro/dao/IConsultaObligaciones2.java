package com.subalab.Cuenta_cobro.dao;

import java.util.List;

import javax.persistence.Tuple;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.subalab.Cuenta_cobro.models.Login;

public interface IConsultaObligaciones2 extends JpaRepository<Login, String> {
	
	@Query(value = "SELECT "
			
			+ "lg.UserName as USUARIO,\r\n"
			+ "pc.NOMBRES,\r\n"
			+ "tc.N_CONTRATO,\r\n"
			+ "ts.IDSIPSE,\r\n"
			+ "ts.OBLIGACION_1,\r\n"
			+ "ts.OBLIGACION_2,\r\n"
			+ "ts.OBLIGACION_3,\r\n"
			+ "ts.OBLIGACION_4,\r\n"
			+ "ts.OBLIGACION_5,\r\n"
			+ "ts.OBLIGACION_6,\r\n"
			+ "ts.OBLIGACION_7,\r\n"
			+ "ts.OBLIGACION_8,\r\n"
			+ "ts.OBLIGACION_9,\r\n"
			+ "ts.OBLIGACION_10,\r\n"
			+ "ts.OBLIGACION_11,\r\n"
			+ "ts.OBLIGACION_12,\r\n"
			+ "ts.OBLIGACION_13,\r\n"
			+ "ts.OBLIGACION_14,\r\n"
			+ "ts.OBLIGACION_15,\r\n"
			+ "ts.OBLIGACION_16,\r\n"
			+ "ts.OBLIGACION_17,\r\n"
			+ "ts.OBLIGACION_18,\r\n"
			+ "ts.OBLIGACION_19\r\n"
			
			
			+ "FROM \r\n"
			
			+ "Login lg\r\n"
			+ "inner join Table_PERSONA_CONTRATISTA pc on pc.CEDULA = lg.UserName\r\n"
			+ "inner join Table_CONTRATO tc on tc.N_CONTRATO = pc.NCONTRATO\r\n"
			+ "inner join Table_SIPSE ts on ts.IDSIPSE= tc.id_SIPSE\r\n"
			
		
			
			+ "where \r\n"
			
			+ "lg.UserName = :UserName ", nativeQuery = true)
	 
	 List<Tuple> encontrarObligacionporusername(@Param("UserName")String UserName);
	 
}
