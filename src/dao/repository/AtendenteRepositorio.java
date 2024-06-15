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
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Atendente;

/**
 *
 * @author zanna
 */
public class AtendenteRepositorio implements IRepositorio<Atendente> {

    @Override
    public Atendente obterPorId(int id) {
        Connection con = ConnectionFactory.getConnection(); // Obtém a conexão com o banco de dados
        PreparedStatement stmt = null;
        ResultSet rs = null;

        Atendente atendente = null; // Inicializa o atenndente nulo

        try {
            stmt = con.prepareStatement("SELECT * FROM atendente WHERE id_atendente = ?");// Prepara a consulta SQL
            stmt.setInt(0, id);
            rs = stmt.executeQuery(); // Executa a consulta

            if (rs.next()) { // Pega a primeira linha
                int at_id = rs.getInt("id_atendente");
                String at_nome = rs.getString("nome");
                String at_cpf = rs.getString("cpf");
                String at_telefone = rs.getString("telefone");
                String at_email = rs.getString("email");
                Date at_data_nascimento = rs.getDate("data_nascimento");
                atendente = new Atendente(at_id, at_nome, at_cpf, at_data_nascimento, at_telefone, at_email);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioRepositorio.class.getName()).log(Level.SEVERE, null, ex);// Registra o erro
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs); // Fecha a conexão, o PreparedStatement e o ResultSet
        }

        return atendente; // Retorna um atendente
    }

    @Override
    public ArrayList<Atendente> obterTodos() {
        Connection con = ConnectionFactory.getConnection(); // Obtém a conexão com o banco de dados
        PreparedStatement stmt = null;
        ResultSet rs = null;

        ArrayList<Atendente> atendentes = new ArrayList<>(); // Lista para armazenar os pacientes

        // pecorre sobre os resultados da consulta
        try {
            stmt = con.prepareStatement("SELECT * FROM atendente");// Prepara a consulta SQL
            rs = stmt.executeQuery(); // Executa a consulta

            while (rs.next()) {
                int at_id = rs.getInt("id_atendente");
                String at_nome = rs.getString("nome");
                String at_cpf = rs.getString("cpf");
                String at_telefone = rs.getString("telefone");
                String at_email = rs.getString("email");
                Date at_data_nascimento = rs.getDate("data_nascimento");
                Atendente atendente = new Atendente(at_id, at_nome, at_cpf, at_data_nascimento, at_telefone, at_email);
                atendentes.add(atendente);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioRepositorio.class.getName()).log(Level.SEVERE, null, ex);// Registra o erro
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs); // Fecha a conexão, o PreparedStatement e o ResultSet
        }

        return atendentes; // Retorna a lista de atendente
    }

    @Override
    public void salvar(Atendente obj) {
        Connection con = ConnectionFactory.getConnection(); // Obtém a conexão com o banco de dados
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO atendente (nome,cpf,telefone,email,data_nascimento) VALUES(?,?,?,?,?)");// Prepara a consulta SQL
            stmt.setString(0, obj.getNome());
            stmt.setString(1, obj.getCpf());
            stmt.setString(2, obj.getTelefone());
            stmt.setString(3, obj.getEmail());
            stmt.setDate(4, (java.sql.Date) obj.getData_de_nascimento());
            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioRepositorio.class.getName()).log(Level.SEVERE, null, ex);// Registra o erro
        } finally {
            ConnectionFactory.closeConnection(con, stmt); // Fecha a conexão, o PreparedStatement
        }
    }

    @Override
    public void atualizar(Atendente obj) {
        Connection con = ConnectionFactory.getConnection(); // Obtém a conexão com o banco de dados
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE atendente SET nome = ? , cpf = ?, telefone = ?, email = ? , data_nascimento = ? WHERE id_atendente = ?");// Prepara a consulta SQL
            stmt.setString(0, obj.getNome());
            stmt.setString(1, obj.getCpf());
            stmt.setString(2, obj.getTelefone());
            stmt.setString(3, obj.getEmail());
            stmt.setDate(4, (java.sql.Date) obj.getData_de_nascimento());
            stmt.setInt(5, obj.getId());
            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioRepositorio.class.getName()).log(Level.SEVERE, null, ex);// Registra o erro
        } finally {
            ConnectionFactory.closeConnection(con, stmt); // Fecha a conexão, o PreparedStatement
        }

    }

    @Override
    public void excluir(int id) {
        Connection con = ConnectionFactory.getConnection(); // Obtém a conexão com o banco de dados
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM atendente WHERE id_atendente = ?");// Prepara a consulta SQL
            stmt.setInt(0, id);
            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioRepositorio.class.getName()).log(Level.SEVERE, null, ex);// Registra o erro
        } finally {
            ConnectionFactory.closeConnection(con, stmt); // Fecha a conexão, o PreparedStatement
        }
    }
}
