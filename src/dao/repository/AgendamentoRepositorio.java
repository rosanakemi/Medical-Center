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
import model.Agendamento;
import model.Medico;
import model.Paciente;

/**
 *
 * @author zanna
 */
public class AgendamentoRepositorio implements IRepositorio<Agendamento>{
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
                 int id = rs.getInt("id");
                 Paciente paciente = pacienteRepo.obterPorId(rs.getInt("paciente"));
                 Medico medico = medicoRepo.obterPorId(rs.getInt("medico"));
                 String especialidade = rs.getString("especialidade");
                 Date data = rs.getDate("data");
                 String Hora = rs.getString("Hora");
                Agendamento agendamento = new Agendamento(id, paciente, medico, especialidade, data, Hora); // Cria um agendamento
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
    public void excluir(int id) {
    }

    @Override
    public void salvar(Agendamento obj) {
    }

    @Override
    public void atualizar(Agendamento obj) {
    }

    @Override
    public Agendamento obterPorId(int id) {
        return null;
    }

}
