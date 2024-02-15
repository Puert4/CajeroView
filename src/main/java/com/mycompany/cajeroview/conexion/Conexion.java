/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cajeroview.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TeLesheo
 */
public class Conexion implements IConexion {

    final String cadenaConexion;
    final String usuario;
    final String password;
    static final Logger logger = Logger.getLogger(Conexion.class.getName());

    public Conexion(String cadenaConexion, String usuario, String password) {
        this.cadenaConexion = cadenaConexion;
        this.usuario = usuario;
        this.password = password;
    }

    @Override
    public Connection obtenerConexion() throws SQLException {
        Connection conexion = DriverManager.getConnection(cadenaConexion, usuario, password);

        logger.log(Level.INFO, "Conexion Establecida {0}", cadenaConexion);
        return conexion;
    }

}
