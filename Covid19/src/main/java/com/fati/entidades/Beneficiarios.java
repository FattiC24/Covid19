package com.fati.entidades;

public class Beneficiarios extends Personas {
	
	protected int idbeneficiario;
	protected Double MontoARecibir;
	protected int getIdbeneficiario() {
		return idbeneficiario;
	}
	protected void setIdbeneficiario(int idbeneficiario) {
		this.idbeneficiario = idbeneficiario;
	}
	protected Double getMontoARecibir() {
		return MontoARecibir;
	}
	protected void setMontoARecibir(Double montoARecibir) {
		MontoARecibir = montoARecibir;
	}

	
}
