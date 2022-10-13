package com.subalab.Cuenta_cobro.dao;

import java.util.List;

import javax.persistence.Tuple;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.subalab.Cuenta_cobro.models.Table_SEGUIMENTOMUSI;

public interface IConsultaSeguimientomusi extends JpaRepository<Table_SEGUIMENTOMUSI, String>{
	
@Query(value = "SELECT "
			
			+ "tsm.Codigo_Propuesta, \r\n"
			+ "tsm.CONSULTA_Codigo_Proyecto, \r\n"
			+ "tsm.Meta_Proyecto, \r\n"
			+ "tsm.Nombre_Proyecto, \r\n"
			+ "tsm.Propuesta_Ciudadana,\r\n"
			+ "tsm.Sector \r\n"
			
			+ "From\r\n"
			
			+ "Table_SEGUIMENTOMUSI tsm\r\n"
			
			
			
			+ "where\r\n"
			
			+ "tsm.Codigo_Propuesta = :Codigo_Propuesta ", nativeQuery = true)
	 
	 List<Tuple> encontrarCodigoPropuesta(@Param("Codigo_Propuesta")String Codigo_Propuesta);

	

}
