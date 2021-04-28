package com.fati.DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import com.fati.conexion.Conexion;
import com.fati.entidades.Personas;

public class ClsPersona {

	Conexion Conectar = new Conexion();
    Connection conectar = Conectar.RetornarConexion();
    
    public boolean LoginPersona(String Usuario, String Password) {

    	ArrayList<Personas> ListadoUSUARIOPASS = new ArrayList<>();
        ArrayList<Personas> ListarContra = new ArrayList<>();

        try {
            CallableStatement Statement = conectar.prepareCall("call SP_S_LOGIN(?,?)");
            Statement.setString("PUsuario", Usuario);
            Statement.setString("Ppass", Password);
            ResultSet resultadoConsulta = Statement.executeQuery();
            while (resultadoConsulta.next()) {

                Personas persona = new Personas();
                persona.setUsuario(resultadoConsulta.getString("Usuario"));
                persona.setPass(resultadoConsulta.getString("Pass"));
                ListadoUSUARIOPASS.add(persona);
            }

        } catch (Exception e) {
            System.out.println("> Ha ocurrido un error" + e);
        }
        return false;
    }
}
