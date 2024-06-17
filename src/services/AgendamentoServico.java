/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import dao.repository.AgendamentoRepositorio;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import model.Agendamento;
import model.Medico;
import model.Paciente;

/**
 * Classe de serviço para operações relacionadas aos agendamentos.
 * Realiza operações de CRUD (Criar, Ler, Atualizar, Deletar) para a entidade Agendamento.
 * 
 * @autor zanna
 */
public class AgendamentoServico {
    // Método para obter um agendamento pelo ID
    public Agendamento obterPorId(int id){
        AgendamentoRepositorio repositorio = new AgendamentoRepositorio();
        return repositorio.obterPorId(id);
    }
    // Método para filtrar agendamentos por data
    public ArrayList<Agendamento> filtrarPorData(Date data){
        AgendamentoRepositorio repositorio = new AgendamentoRepositorio();
        return repositorio.obterPorData(data);
    }
    // Método para agendar um novo agendamento
    public boolean agendar(Medico medico, Paciente paciente, Calendar dataHora){
        // Cria um novo objeto Agendamento com os dados fornecidos
        AgendamentoRepositorio repositorio = new AgendamentoRepositorio();
        
        //int id, Paciente paciente, Medico medico, Date data, String Hora
        Agendamento agendamento = new Agendamento(0,paciente,medico,dataHora);
        // Salva o agendamento no repositório
        repositorio.salvar(agendamento);
        return true;
    }
    // Método para reagendar um agendamento existente
    public boolean reagendar(Agendamento agendamento, Medico medico, Paciente paciente, Calendar dataHora){
        AgendamentoRepositorio repositorio = new AgendamentoRepositorio();
        // Atualiza os dados do agendamento existente
        agendamento.setMedico(medico);
        agendamento.setPaciente(paciente);
        agendamento.setDataHora(dataHora);
        // Atualiza o agendamento no repositório
        repositorio.atualizar(agendamento);
        return true;
    }
    // Método para cancelar um agendamento pelo ID
    public boolean cancelar(int id){
        AgendamentoRepositorio repositorio = new AgendamentoRepositorio();
        repositorio.excluir(id);
        return true;
    }
}
