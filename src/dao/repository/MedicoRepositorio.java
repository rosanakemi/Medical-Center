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
import model.Medico;

/**
 * Repositório para manipulação dos dados de usuários no banco de dados.
 *
 * @autor zanna
 */
public class MedicoRepositorio implements IRepositorio<Medico> {

    @Override
    public Medico obterPorId(int id) {
        Connection con = ConnectionFactory.getConnection(); // Obtém a conexão com o banco de dados
        PreparedStatement stmt = null;
        ResultSet rs = null;

        Medico medico = null; // Inicializa o medico nulo

        try {
            stmt = con.prepareStatement("SELECT * FROM medico WHERE id_medico = ?");// Prepara a consulta SQL
            stmt.setInt(0, id);
            rs = stmt.executeQuery(); // Executa a consulta

            if (rs.next()) { // Pega a primeira linha
                int med_id = rs.getInt("id_medico");
                String med_CRM = rs.getString("crm");
                String med_especialidades = rs.getString("especialidade");
                String med_nome = rs.getString("nome");
                String med_cpf = rs.getString("cpf");
                Date med_data_de_nascimento = rs.getDate("data_nascimento");
                String med_status = rs.getString("status");
                medico = new Medico(med_id, med_nome, med_cpf, med_data_de_nascimento, med_CRM, med_especialidades, med_status);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioRepositorio.class.getName()).log(Level.SEVERE, null, ex);// Registra o erro
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs); // Fecha a conexão, o PreparedStatement e o ResultSet
        }

        return medico; // Retorna um Medico
    }

    @Override
    public ArrayList<Medico> obterTodos() {
        Connection con = ConnectionFactory.getConnection(); // Obtém a conexão com o banco de dados
        PreparedStatement stmt = null; // Objeto para executar instruções SQL parametrizadas.
        ResultSet rs = null; // Objeto para armazenar e processar resultados de consultas SQL.

        ArrayList<Medico> medicos = new ArrayList<>(); // Lista para armazenar os Medicos.

        // pecorre sobre os resultados da consulta
        try {
            stmt = con.prepareStatement("SELECT * FROM medico");// Prepara a consulta SQL
            rs = stmt.executeQuery(); // Executa a consulta

            // while - fique repetido.. repetição
            while (rs.next()) {
                int id = rs.getInt("id_medico");
                String CRM = rs.getString("crm");
                String especialidades = rs.getString("especialidade");
                String nome = rs.getString("nome");
                String cpf = rs.getString("cpf");
                Date data_de_nascimento = rs.getDate("data_nascimento");
                String status = rs.getString("status");
                Medico medico = new Medico(id, nome, cpf, data_de_nascimento, CRM, especialidades,status); // Cria um objeto Medico
                medicos.add(medico); // Adiciona o medico à lista
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioRepositorio.class.getName()).log(Level.SEVERE, null, ex);// Registra o erro
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs); // Fecha a conexão, o PreparedStatement e o ResultSet
        }

        return medicos; // Retorna a lista de medicos
    }

    @Override
    public void salvar(Medico obj) {
        Connection con = ConnectionFactory.getConnection(); // Obtém a conexão com o banco de dados
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO `medico`(nome, cpf, data_nascimento, crm, especialidade, status) VALUES (?,?,?,?,?,?)");// Prepara a consulta SQL
            stmt.setString(0, obj.getNome());
            stmt.setString(1, obj.getCpf());
            stmt.setDate(2, (java.sql.Date) obj.getData_de_nascimento());
            stmt.setString(3, obj.getCRM());
            stmt.setString(4, obj.getEspecialidades());
            stmt.setString(5, obj.getStatus());
            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioRepositorio.class.getName()).log(Level.SEVERE, null, ex);// Registra o erro
        } finally {
            ConnectionFactory.closeConnection(con, stmt); // Fecha a conexão, o PreparedStatement
        }
    }

    @Override
    public void atualizar(Medico obj) {
        Connection con = ConnectionFactory.getConnection(); // Obtém a conexão com o banco de dados
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE medico SET nome= ? ,cpf= ? ,data_nascimento= ? ,crm= ? ,especialidade= ? ,status= ?  WHERE id_medico = ?");// Prepara a consulta SQL
            stmt.setString(0, obj.getNome());
            stmt.setString(1, obj.getCpf());
            stmt.setDate(2, (java.sql.Date) obj.getData_de_nascimento());
            stmt.setString(3, obj.getCRM());
            stmt.setString(4, obj.getEspecialidades());
            stmt.setString(5, obj.getStatus());
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
            stmt = con.prepareStatement("DELETE FROM medico WHERE id_medico = ?");// Prepara a consulta SQL
            stmt.setInt(0, id);
            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioRepositorio.class.getName()).log(Level.SEVERE, null, ex);// Registra o erro
        } finally {
            ConnectionFactory.closeConnection(con, stmt); // Fecha a conexão, o PreparedStatement
        }
    }

}
