package com.subalab.Cuenta_cobro.dao;

import java.util.List;

import javax.persistence.Tuple;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.subalab.Cuenta_cobro.models.Login;


@Repository
public interface INumeropersonalSup extends JpaRepository<Login, String> {
	
	@Query(value = "SELECT "
			
			+ "count(tsp.ID_SUPERVISOR) as PERSONAL_ASIGNADO"
			
			+ "FROM"
			
			+ "Login lg"
			+ "inner join Table_SUPERVISOR tsp on lg.UserName = tsp.CEDULA_SUPERVISOR"
			+ "inner join Table_PERSONA_CONTRATISTA tp on tsp.ID_SUPERVISOR = tp.SUPERVISOR"
			+ "where"
			+ "tsp.CEDULA_SUPERVISOR = :UserName ", nativeQuery = true)
	 
	 List<Tuple> encontrarUserporusername(@Param("UserName")String UserName);
	 

}
