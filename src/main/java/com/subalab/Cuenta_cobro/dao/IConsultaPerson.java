package com.subalab.Cuenta_cobro.dao;

import java.util.List;
import javax.persistence.Tuple;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.subalab.Cuenta_cobro.models.Login;


@Repository
public interface IConsultaPerson extends JpaRepository<Login, String> {
	
	@Query(value = "SELECT "
			
			+ "lg.UserName as Usuario, \r\n"
			+ "lg.ROL as Rol_Persona, \r\n"
			+ "lg.Password as Contraseña, \r\n"
			+ "tp.CEDULA as Cedula, \r\n"
			+ "tare.NAM_AREA as Area,\r\n"
			+ "Teps.NAME_EPS as EPS, \r\n"
			+ "ar.NAM_ARL as ARL, \r\n"
			+ "Tfd.PENSION as Fondo_Pension, \r\n"
			+ "tb.NAME_BANCO as Banco, \r\n"
			+ "tcb.TIPO_CUENTA as Tipo_cuenta, \r\n"
			+ "ts.NAME_SUPER as Supervisor, \r\n"
			+ "tra.ID_RIESGO as RiesgoARL, \r\n"
			+ "tpp.ID_PROYECTO as Proyecto, \r\n"
			+ "tp.NCONTRATO as Contrato, \r\n"
			+ "tp.NOMBRES, \r\n"
			+ "tp.TELEFONO, \r\n"
			+ "tp.DIRECCION, \r\n"
			+ "tp.N_CUENTA_BANCO as #CuentaBanco, \r\n"
			+ "ts.CEDULA_SUPERVISOR as Cedula_supervisor, \r\n"
			+ "ts.ciudad_cedula_supervisor as Ciudad_cedula_supervisor, \r\n"
			+ "ts.CARGO as Cargo_supervisor, \r\n"
			+ "tra.DETALLE_POR as Riesgo_Arl_Valor, \r\n"
			+ "tp.Firma_Contratista \r\n"
			
			+ "From\r\n"
			
			+ "Login lg\r\n"
			+ "inner join Table_PERSONA_CONTRATISTA tp on lg.UserName = tp.CEDULA\r\n"
			+ "left join Table_AREA Tare on tare.ID_AREA = tp.AREA\r\n"
			+ "left join Table_EPS Teps on Teps.IDEPS = tp.EPS\r\n"
			+ "left join Table_ARL ar on ar.ID_ARL = tp.ARL\r\n"
			+ "left join Table_FONDO_PENSION Tfd on Tfd.IDFONDOPENSION = tp.FONDO_PENSION\r\n"
			+ "left join Table_BANCOS tb on tb.IDBANCO = tp.BANCO\r\n"
			+ "left join Table_TIPO_CUENTA_banco tcb on tcb.N_CUENTA = tp.TIPO_BANCO\r\n"
			+ "left join Table_SUPERVISOR ts on ts.ID_SUPERVISOR = tp.SUPERVISOR\r\n"
			+ "left join Table_RIESGO_ARL tra on tra.ID_RIESGO = tp.RIESGOS_ARL\r\n"
			+ "left join Table_PROYECTO_PRESUPUESTAL tpp on tpp.ID_PROYECTO = tp.PROYECTO\r\n"
			
			+ "where\r\n"
			
			+ "tp.CEDULA = :UserName ", nativeQuery = true)
	 
	 List<Tuple> encontrarUserporusername(@Param("UserName")String UserName);
	 
}

