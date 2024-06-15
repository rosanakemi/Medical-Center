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
import model.Paciente;

/**
 *
 * @author zanna
 */
public class PacienteRepositorio implements IRepositorio<Paciente> {

    @Override
    public Paciente obterPorId(int id) {
        Connection con = ConnectionFactory.getConnection(); // Obtém a conexão com o banco de dados
        PreparedStatement stmt = null;
        ResultSet rs = null;

        Paciente paciente = null; // Inicializa o paciente nulo

        try {
            stmt = con.prepareStatement("SELECT * FROM paciente WHERE id_paciente = ?");// Prepara a consulta SQL
            stmt.setInt(0, id);
            rs = stmt.executeQuery(); // Executa a consulta

            if (rs.next()) { // Pega a primeira linha
                int pac_id = rs.getInt("paciente_id");
                String pac_nome = rs.getString("nome");
                String pac_cpf = rs.getString("cpf");
                Date pac_data_nasc = rs.getDate("data_nascimento");
                String pac_c_sus = rs.getString("cartaoSus");
                String pac_tel = rs.getString("telefone");
                String pac_email = rs.getString("email");
                String pac_status = rs.getString("status");
                paciente = new Paciente(pac_id, pac_nome, pac_cpf, pac_data_nasc, pac_c_sus, pac_email, pac_tel, pac_status); // Inicializa o paciente
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioRepositorio.class.getName()).log(Level.SEVERE, null, ex);// Registra o erro
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs); // Fecha a conexão, o PreparedStatement e o ResultSet
        }

        return paciente; // Retorna um paciente
    }

    @Override
    public ArrayList<Paciente> obterTodos() {
        Connection con = ConnectionFactory.getConnection(); // Obtém a conexão com o banco de dados
        PreparedStatement stmt = null;
        ResultSet rs = null;

        ArrayList<Paciente> pacientes = new ArrayList<>(); // Lista para armazenar os pacientes

        // pecorre sobre os resultados da consulta
        try {
            stmt = con.prepareStatement("SELECT * FROM paciente");// Prepara a consulta SQL
            rs = stmt.executeQuery(); // Executa a consulta

            while (rs.next()) {
                int pac_id = rs.getInt("paciente_id");
                String pac_nome = rs.getString("nome");
                String pac_cpf = rs.getString("cpf");
                Date pac_data_nasc = rs.getDate("data_nascimento");
                String pac_c_sus = rs.getString("cartaoSus");
                String pac_tel = rs.getString("telefone");
                String pac_email = rs.getString("email");
                String pac_status = rs.getString("status");
                Paciente paciente = new Paciente(pac_id, pac_nome, pac_cpf, pac_data_nasc, pac_c_sus, pac_email, pac_tel, pac_status);
                pacientes.add(paciente);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioRepositorio.class.getName()).log(Level.SEVERE, null, ex);// Registra o erro
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs); // Fecha a conexão, o PreparedStatement e o ResultSet
        }

        return pacientes; // Retorna a lista de paciente
    }

    @Override
    public void salvar(Paciente obj) {
        Connection con = ConnectionFactory.getConnection(); // Obtém a conexão com o banco de dados
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO paciente (nome, cpf, data_nascimento, cartaoSus, telefone, email, status) VALUES (?,?,?,?,?,?,?)");// Prepara a consulta SQL
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getCpf());
            stmt.setDate(3, new java.sql.Date(obj.getData_de_nascimento().getTime()));
            stmt.setString(4, obj.getNumeroSUS());
            stmt.setString(5, obj.getTelefone());
            stmt.setString(6, obj.getEmail());
            stmt.setString(7, obj.getStatus());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioRepositorio.class.getName()).log(Level.SEVERE, null, ex);// Registra o erro
        } finally {
            ConnectionFactory.closeConnection(con, stmt); // Fecha a conexão, o PreparedStatement
        }
    }

    @Override
    public void atualizar(Paciente obj) {
        Connection con = ConnectionFactory.getConnection(); // Obtém a conexão com o banco de dados
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE paciente SET nome = ? cpf = ? data_nascimento = ? cartaoSus = ? telefone = ? email = ? status = ? WHERE id_paciente = ?");// Prepara a consulta SQL
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getCpf());
            stmt.setDate(3, (java.sql.Date) obj.getData_de_nascimento());
            stmt.setString(4, obj.getNumeroSUS());
            stmt.setString(5, obj.getTelefone());
            stmt.setString(6, obj.getEmail());
            stmt.setString(7, obj.getStatus());
            stmt.setInt(8, obj.getId());
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
            stmt = con.prepareStatement("DELETE FROM paciente WHERE id_paciente = ?");// Prepara a consulta SQL
            stmt.setInt(0, id);
            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioRepositorio.class.getName()).log(Level.SEVERE, null, ex);// Registra o erro
        } finally {
            ConnectionFactory.closeConnection(con, stmt); // Fecha a conexão, o PreparedStatement
        }
    }

}
