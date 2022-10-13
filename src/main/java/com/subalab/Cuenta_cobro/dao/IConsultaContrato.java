package com.subalab.Cuenta_cobro.dao;

import java.util.List;
import javax.persistence.Tuple;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.subalab.Cuenta_cobro.models.Login;


@Repository
public interface IConsultaContrato extends JpaRepository<Login, String> {
	
	@Query(value = "SELECT "
			
			+ "lg.UserName as USUARIO,\r\n"
			+ "tp.CEDULA,\r\n"
			+ "tc.N_CONTRATO as CONTRATO,\r\n"
			+ "tc.FECHA_INICIO_CONTRATO,\r\n"
			+ "tc.FECHA_FINAL_CONTRATO,\r\n"
			+ "tc.VALOR_TOTAL_CONTRATO, \r\n"
			+ "tc.VALOR_CONTRATO, \r\n"
			+ "ttc.DETALLE as TIPO_CONTRATO,\r\n"
			+ "tc.id_SIPSE as SIPSE,\r\n"
			+ "tss.DETALLE_SUPENCION as SUSPENCION,\r\n"
			+ "tc.VALOR_ADICION as ADICION,\r\n"
			+ "tpr.DETALLE_PRORROGA as PRORROGA,\r\n"
			+ "tc.OBJETO_CONTRATO as OBJETOCONTRATO,\r\n"
			+ "tc.OBSERVACIONES_CONTRATO as OBSERVACIONES,\r\n"
			+ "tpr.TIEMPO_MESES as MESESPRORROGA,\r\n"
			+ "tpr.TIEMPO_DIAS as DIASPRORROGA,\r\n"
			+ "tc.DURACION_CONTRATO as PLAZOCONTRATO, \r\n"
			+ "tra.DETALLE_POR, \r\n"
			+ "tpr.FECHA_INICAL_PRORROGA, \r\n"
			+ "tpr.FECHA_FINAL_PRORROGA, \r\n"
			+ "tss.SUSPE_FECHA_INICIAL, \r\n"
			+ "tss.SUSPE_FECHA_FINAL, \r\n"
			+ "tc.RUBRO_PRESUPUESTAL \r\n"
			+ "FROM \r\n"
			
			+ "Login lg\r\n"
			+ "inner join Table_PERSONA_CONTRATISTA tp on lg.UserName = tp.CEDULA\r\n"
			+ "left join Table_CONTRATO tc on tc.N_CONTRATO = tp.NCONTRATO\r\n"
			+ "left join Table_SUSPENSION tss on tss.IDSUSPENCION = tc.ESTADO_SUSPENSION\r\n"
			+ "left join Table_ESTADO_NOVEDAD ten on ten.ID_ESTADO = tss.ESTADO\r\n"
			+ "left join Table_TIPO_CONTRATOS ttc on ttc.ID_TIPO_CONTRATO = tc.id_tipocontrato\r\n"
			+ "left join Table_PRORROGA tpr on tpr.IDPRORROGA = tc.ESTADO_PRORROGA\r\n"
			+ "left join Table_RIESGO_ARL tra on tra.ID_RIESGO = tp.RIESGOS_ARL\r\n"
			
			+ "where \r\n"
			
			+ "tp.CEDULA = :UserName ", nativeQuery = true)
	 
	 List<Tuple> encontrarUserporusername(@Param("UserName")String UserName);
	 
}

