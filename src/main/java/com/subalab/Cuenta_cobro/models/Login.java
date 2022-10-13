package com.subalab.Cuenta_cobro.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="Login")
public class Login implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Column(name="UserId")
	private Integer UserId;
	
	@Id
	@Column(name="UserName")
	private String UserName;
	
	@Column(name="PassWord")
	private String PassWord;
	
	@Column(name="ROL")
	private String ROL;
	
	@OneToOne
	@JoinTable(name="Table_PERSONA_CONTRATISTA",
	joinColumns = @JoinColumn(name="UserName")
			)

	

	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassWord() {
		return PassWord;
	}

	public void setPassword(String passWord) {
		PassWord = passWord;
	}

	public String getROL() {
		return ROL;
	}

	public void setROL(String rOL) {
		ROL = rOL;
	}	
	

}
