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
public class MedicoRepositorio implements IRepositorio<Medico>{
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
                 int id = rs.getInt("id");
                 String CRM = rs.getString("CRM");
                 String especialidades = rs.getString("especialidade");
                 String usuario = rs.getString("usuario");
                 String nome = rs.getString("nome");
                 String cpf = rs.getString("cpf");
                 Date data_de_nascimento = rs.getDate("data_de_nascimento");
                 String idade = rs.getString("idade");
                Medico medico = new Medico(id, nome, cpf, data_de_nascimento, idade, CRM, usuario, especialidades); // Cria um objeto Medico
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
    }

    @Override
    public void atualizar(Medico obj) {
    }

    @Override
    public void excluir(int id) {
    }

    @Override
    public Medico obterPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
