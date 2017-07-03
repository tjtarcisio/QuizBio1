/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifgoiano.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Naiane
 */
public class ConnectionFactory {
    private final String host = 	"jdbc:mysql://localhost:3306/quiz_bd?zeroDateTimeBehavior=convertToNull";
	private final String user = 	"root";
	private final String password = "";

     public Connection getConnection(){
        try {
            return DriverManager.getConnection(host, user, password);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
