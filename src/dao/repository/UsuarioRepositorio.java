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
 *
 * @author zanna
 */
public class UsuarioRepositorio implements IRepositorio<Usuario> {

    @Override
    public ArrayList<Usuario> obterTodos() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        ArrayList<Usuario> usuarios = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM usuario");
            rs = stmt.executeQuery();

            while (rs.next()) {
                 int id = rs.getInt("id");
                 String login = rs.getString("login");
                 String senha = rs.getString("senha");
                Usuario usuario = new Usuario(id,login,senha);
                usuarios.add(usuario);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return usuarios;
    }
    
    public Usuario obterPorLogin(String login){
    
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        Usuario usuario = null;
        
        try {
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE login = ?");
            stmt.setString(1, login);
            rs = stmt.executeQuery();

            if (rs.next()) {
                 int id = rs.getInt("id");
                 String dblogin = rs.getString("login");
                 String senha = rs.getString("senha");
                usuario = new Usuario(id,dblogin,senha);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return usuario;
   
    }
    

}
