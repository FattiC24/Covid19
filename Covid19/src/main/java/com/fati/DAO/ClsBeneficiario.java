package com.fati.DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

import com.fati.conexion.Conexion;
import com.fati.entidades.Personas;


public class ClsBeneficiario {

	Conexion Conectar = new Conexion();
    Connection conectar = Conectar.RetornarConexion();
    
    public boolean ObtenerBeneficiario(Personas person){
    	
    	boolean SiSoybeneficiario = false;
    	try {
			CallableStatement statement = conectar.prepareCall("call SP_S_BENEFICIARIOS(?)");
			statement.setString("PDUI", person.getDUI());
			ResultSet result = statement.executeQuery();
			
			if(result.next()) {
				SiSoybeneficiario = true;
			}
		} catch (Exception e) {
			System.out.println("> Ocurrió un error" + e);
		}
    	return SiSoybeneficiario;
    }
    
    public String VerificarBeneficiario(Personas person) {
    	
    	String fullname = "";
    	try {
			CallableStatement statement = conectar.prepareCall("call SP_S_BENEFICIARIOS(?)");
			statement.setString("PDUI", person.getDUI());
			ResultSet result = statement.executeQuery();
			
			if(result.next()) {
				fullname = result.getString("Fullname");
			}
		} catch (Exception e) {
			System.out.println("> Ocurrió un error" + e);
		}
    	return fullname;
    }
}
