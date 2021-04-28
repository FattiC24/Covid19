package com.fati.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
	private Connection coonec;

	public Conexion() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			coonec = DriverManager.getConnection("jdbc:mysql://localhost/covid19", "root", "root");
			System.out.println("> ¡Conectado a la Base de Datos covid19!");

		} catch (Exception e) {
			System.out.println("> ¡Error en la conexión! " + e);
		}
	}

	public Connection RetornarConexion() {
		return coonec;
	}

}
