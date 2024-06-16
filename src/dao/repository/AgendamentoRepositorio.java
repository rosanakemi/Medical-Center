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
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Agendamento;
import model.Medico;
import model.Paciente;

/**
 *
 * @author zanna
 */
public class AgendamentoRepositorio implements IRepositorio<Agendamento> {

    @Override
    public Agendamento obterPorId(int id) {
        PacienteRepositorio pacienteRepo = new PacienteRepositorio();
        MedicoRepositorio medicoRepo = new MedicoRepositorio();

        Connection con = ConnectionFactory.getConnection(); // Obtém a conexão com o banco de dados
        PreparedStatement stmt = null;
        ResultSet rs = null;

        Agendamento agendamento = null; // Inicializar

        // pecorre sobre os resultados da consulta
        try {
            stmt = con.prepareStatement("SELECT * FROM agendamento WHERE id_agendamento = ?");// Prepara a consulta SQL
            stmt.setInt(1, id);
            rs = stmt.executeQuery(); // Executa a consulta

            if (rs.next()) {
                int ag_id = rs.getInt("id_agendamento");
                Paciente ag_paciente = pacienteRepo.obterPorId(rs.getInt("paciente"));
                Medico ag_medico = medicoRepo.obterPorId(rs.getInt("medico"));
                Date data = rs.getTimestamp("data_hora");
                Calendar datahora = Calendar.getInstance();
                datahora.setTime(data);
                agendamento = new Agendamento(ag_id, ag_paciente, ag_medico, datahora);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioRepositorio.class.getName()).log(Level.SEVERE, null, ex);// Registra o erro
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs); // Fecha a conexão, o PreparedStatement e o ResultSet
        }

        return agendamento; // Retorna agendamento
    }

    /**
     * Obtém todos os usuários do banco de dados.
     *
     */
    @Override
    public ArrayList<Agendamento> obterTodos() {
        PacienteRepositorio pacienteRepo = new PacienteRepositorio();
        MedicoRepositorio medicoRepo = new MedicoRepositorio();

        Connection con = ConnectionFactory.getConnection(); // Obtém a conexão com o banco de dados
        PreparedStatement stmt = null;
        ResultSet rs = null;

        ArrayList<Agendamento> agendamentos = new ArrayList<>(); // Lista para armazenar os agendamentos

        // pecorre sobre os resultados da consulta
        try {
            stmt = con.prepareStatement("SELECT * FROM agendamento");// Prepara a consulta SQL
            rs = stmt.executeQuery(); // Executa a consulta

            while (rs.next()) {
                int id = rs.getInt("id_agendamento");
                Paciente paciente = pacienteRepo.obterPorId(rs.getInt("paciente"));
                Medico medico = medicoRepo.obterPorId(rs.getInt("medico"));
                Date data = rs.getDate("data_hora");
                Calendar datahora = Calendar.getInstance();
                datahora.setTime(data);
                Agendamento agendamento = new Agendamento(id, paciente, medico, datahora); // Cria um agendamento
                agendamentos.add(agendamento); // Adiciona um agendamento à lista
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioRepositorio.class.getName()).log(Level.SEVERE, null, ex);// Registra o erro
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs); // Fecha a conexão, o PreparedStatement e o ResultSet
        }

        return agendamentos; // Retorna a lista de agendamento.
    }

    public ArrayList<Agendamento> obterPorData(Date data) {
        PacienteRepositorio pacienteRepo = new PacienteRepositorio();
        MedicoRepositorio medicoRepo = new MedicoRepositorio();

        Connection con = ConnectionFactory.getConnection(); // Obtém a conexão com o banco de dados
        PreparedStatement stmt = null;
        ResultSet rs = null;

        ArrayList<Agendamento> agendamentos = new ArrayList<>(); // Lista para armazenar os agendamentos

        // pecorre sobre os resultados da consulta
        try {
            stmt = con.prepareStatement("SELECT * FROM agendamento WHERE DATE(data_hora) = ?");// Prepara a consulta SQL
            stmt.setDate(1, new java.sql.Date(data.getTime()));
            rs = stmt.executeQuery(); // Executa a consulta

            while (rs.next()) {
                int id = rs.getInt("id_agendamento");
                Paciente paciente = pacienteRepo.obterPorId(rs.getInt("paciente"));
                Medico medico = medicoRepo.obterPorId(rs.getInt("medico"));
                Date ag_data = rs.getTimestamp("data_hora");
                Calendar datahora = Calendar.getInstance();
                datahora.setTime(ag_data);
                Agendamento agendamento = new Agendamento(id, paciente, medico, datahora); // Cria um agendamento
                agendamentos.add(agendamento); // Adiciona um agendamento à lista
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioRepositorio.class.getName()).log(Level.SEVERE, null, ex);// Registra o erro
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs); // Fecha a conexão, o PreparedStatement e o ResultSet
        }

        return agendamentos; // Retorna a lista de agendamento.
    }

    @Override
    public void salvar(Agendamento obj) {
        Connection con = ConnectionFactory.getConnection(); // Obtém a conexão com o banco de dados
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO agendamento (paciente, medico, data_hora) VALUES (?, ?, ?)");// Prepara a consulta SQL
            stmt.setInt(1, obj.getPaciente().getId());
            stmt.setInt(2, obj.getMedico().getId());
            stmt.setTimestamp(3, new java.sql.Timestamp(obj.getDataHora().getTimeInMillis()));
            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioRepositorio.class.getName()).log(Level.SEVERE, null, ex);// Registra o erro
        } finally {
            ConnectionFactory.closeConnection(con, stmt); // Fecha a conexão, o PreparedStatement
        }
    }

    @Override
    public void atualizar(Agendamento obj) {
        Connection con = ConnectionFactory.getConnection(); // Obtém a conexão com o banco de dados
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE agendamento SET paciente = ?, medico = ?, data_hora = ? WHERE id_agendamento = ?");// Prepara a consulta SQL
            stmt.setInt(1, obj.getPaciente().getId());
            stmt.setInt(2, obj.getMedico().getId());
            stmt.setTimestamp(3, new java.sql.Timestamp(obj.getDataHora().getTimeInMillis()));
            stmt.setInt(4, obj.getId());
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
            stmt = con.prepareStatement("DELETE FROM agendamento WHERE id_agendamento = ?");// Prepara a consulta SQL
            stmt.setInt(1, id);
            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioRepositorio.class.getName()).log(Level.SEVERE, null, ex);// Registra o erro
        } finally {
            ConnectionFactory.closeConnection(con, stmt); // Fecha a conexão, o PreparedStatement
        }
    }

}
