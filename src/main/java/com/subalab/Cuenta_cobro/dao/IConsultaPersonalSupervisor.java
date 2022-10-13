package com.subalab.Cuenta_cobro.dao;

import java.util.List;
import javax.persistence.Tuple;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.subalab.Cuenta_cobro.models.Login;


@Repository
public interface IConsultaPersonalSupervisor extends JpaRepository<Login, String> {
	
	@Query(value = "SELECT "
			
			+ "lg.UserName as Usuario, \r\n"
			+ "tp.NOMBRES as NombresContratistas \r\n"
				
					
			
			+ "From\r\n"
			
			+ "Login lg\r\n"
			+ "inner join Table_PERSONA_CONTRATISTA tp on lg.UserName = tp.CEDULA\r\n"
			+ "left join Table_AREA ta on ta.ID_AREA = tp.AREA\r\n"
			+ "left join Table_CONTRATO tc on tc.N_CONTRATO = tp.NCONTRATO\r\n"
			+ "left join Table_SUPERVISOR ts on ts.ID_SUPERVISOR = tp.SUPERVISOR\r\n"
	
			
			+ "where\r\n"
			
			
			+ "ts.CEDULA_SUPERVISOR = :UserName", nativeQuery = true)
	 
	 List<Tuple> encontrarUserporusername(@Param("UserName")String UserName);
	 
}

