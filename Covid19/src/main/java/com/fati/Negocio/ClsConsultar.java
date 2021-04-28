package com.fati.Negocio;

import com.fati.DAO.ClsBeneficiario;
import com.fati.entidades.Personas;

public class ClsConsultar {
	
	
	public int SoyBeneficiario(Personas persona) {
	
	int Sisoy = 0;
	
	ClsBeneficiario clsBeneficiario = new ClsBeneficiario();
	
	var beneficiario = clsBeneficiario.ObtenerBeneficiario(persona);
	
	if(beneficiario == true) {
		Sisoy = 1;
	}
	
	return Sisoy;
}
}
