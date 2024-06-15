/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe para gerenciar conexões com o banco de dados.
 */
public class ConnectionFactory {
    
    private static final String URL = "jdbc:mysql://localhost:3306/medicalcenter";
    private static final String USER = "root";
    private static final String PASS = "";
    
    /**
     * Cria e retorna uma conexão com o banco de dados.
     */
    public static Connection getConnection() {
        try {
            
            return DriverManager.getConnection(URL, USER, PASS);
        } catch(SQLException excecao) {
            // Lança uma exceção se a conexão falhar
			throw new RuntimeException(
                                excecao);
		 }
    }
    
    /**
     * Fecha a conexão com o banco de dados.
     */
    public static void closeConnection(Connection con) {
        try {
            if (con != null) {
                con.close(); // Fecha a conexão se não for nula
            }
        } catch (SQLException ex) {
            // Registra o erro se não conseguir fechar a conexão
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * Fecha a conexão e o PreparedStatement.
     */
    public static void closeConnection(Connection con, PreparedStatement stmt) {

        closeConnection(con); // Fecha a conexão

        try {

            if (stmt != null) {
                stmt.close(); // Fecha o PreparedStatement se não for nulo
            }

        } catch (SQLException ex) {
            // Registra o erro se não conseguir fechar o PreparedStatement
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * Fecha a conexão, o PreparedStatement e o ResultSet.
     */
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs) {

        closeConnection(con, stmt); // Fecha a conexão e o PreparedStatement

        try {

            if (rs != null) {
                rs.close(); // Fecha o ResultSet se não for nulo
            }

        } catch (SQLException ex) {
            // Registra o erro se não conseguir fechar o ResultSet
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}