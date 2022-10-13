package com.subalab.Cuenta_cobro.models;

import java.util.ArrayList;
import java.util.List;
public class PojoPersonalSupervisor {
	
private String UserName;
private List<String> NOMBRES;

public PojoPersonalSupervisor() {
	this.NOMBRES= new ArrayList<>();
}

public String getUsername() {
	return UserName;
}
public void setUsername(String username) {
	UserName = username;
}
public List<String> getNOMBRES() {
	return NOMBRES;
}
public void setNOMBRES(String nOMBRES) {
	NOMBRES.add(nOMBRES);
}



	

	

}
