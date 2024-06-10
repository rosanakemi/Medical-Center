/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.repository;

import dao.connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Usuario;

/**
 * Repositório para manipulação dos dados de usuários no banco de dados.
 * 
 * @autor zanna
 */
public class UsuarioRepositorio implements IRepositorio<Usuario> {
    
    /**
     * Obtém todos os usuários do banco de dados.
     * 
     */
    @Override
    public ArrayList<Usuario> obterTodos() {
        Connection con = ConnectionFactory.getConnection(); // Obtém a conexão com o banco de dados
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        ArrayList<Usuario> usuarios = new ArrayList<>(); // Lista para armazenar os usuários
        
        // pecorre sobre os resultados da consulta
        try {
            stmt = con.prepareStatement("SELECT * FROM usuario");// Prepara a consulta SQL
            rs = stmt.executeQuery(); // Executa a consulta

            while (rs.next()) {
                 int id = rs.getInt("id");
                 String login = rs.getString("login");
                 String senha = rs.getString("senha");
                Usuario usuario = new Usuario(id,login,senha); // Cria um objeto Usuario
                usuarios.add(usuario); // Adiciona o usuário à lista
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioRepositorio.class.getName()).log(Level.SEVERE, null, ex);// Registra o erro
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs); // Fecha a conexão, o PreparedStatement e o ResultSet
        }

        return usuarios; // Retorna a lista de usuários
    }
    /**
     * Obtém um usuário pelo login do banco de dados.
     */
    public Usuario obterPorLogin(String login){
    
        Connection con = ConnectionFactory.getConnection(); // Obtém a conexão com o banco de dados
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        Usuario usuario = null; // Inicializa o objeto Usuario
        
        try {
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE login = ?"); // Prepara a consulta SQL
            stmt.setString(1, login); // Define o parâmetro do login
            rs = stmt.executeQuery(); // Executa a consulta
            
            // Verifica se há resultado
            if (rs.next()) {
                 int id = rs.getInt("id");
                 String dblogin = rs.getString("login");
                 String senha = rs.getString("senha");
                usuario = new Usuario(id,dblogin,senha); // Cria um objeto Usuario
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs); // Fecha a conexão, o PreparedStatement e o ResultSet
        }

        return usuario; // Retorna o usuário ou null
   
    }

    @Override
    public void salvar(Usuario obj) {

    }

    @Override
    public void atualizar(Usuario obj) {
    }

    @Override
    public void excluir(int id) {
    }

    @Override
    public Usuario obterPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

}
