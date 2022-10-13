package com.subalab.Cuenta_cobro.dao;

import java.util.List;

import javax.persistence.Tuple;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.subalab.Cuenta_cobro.models.Login;

@Repository
public interface IConsultaObligaciones extends JpaRepository<Login, String> {
	
	@Query(value = "SELECT "
			
			+ "COUNT(ts.IDSIPSE)"
			
			
			+ "FROM \r\n"
			
			+ "Login lg\r\n"
			+ "inner join Table_PERSONA_CONTRATISTA pc on pc.CEDULA = lg.UserName\r\n"
			+ "inner join Table_CONTRATO tc on tc.N_CONTRATO = pc.NCONTRATO\r\n"
			+ "inner join Table_SIPSE ts on ts.IDSIPSE= tc.id_SIPSE\r\n"
			+ "inner join Table_SISPEOBLIGACIONES tso on tso.d_SISPE = ts.IDSIPSE\r\n"
		
			
			+ "where \r\n"
			
			+ "lg.UserName = :UserName ", nativeQuery = true)
	 
	 List<Tuple> encontrarObligacionporusername(@Param("UserName")String UserName);
	 

}
