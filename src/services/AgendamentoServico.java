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
 *
 * @author zanna
 */
public class AgendamentoServico {
    
    public Agendamento obterPorId(int id){
        AgendamentoRepositorio repositorio = new AgendamentoRepositorio();
        return repositorio.obterPorId(id);
    }
    
    public ArrayList<Agendamento> filtrarPorData(Date data){
        AgendamentoRepositorio repositorio = new AgendamentoRepositorio();
        return repositorio.obterPorData(data);
    }
    
    public boolean agendar(Medico medico, Paciente paciente, Calendar dataHora){
        
        AgendamentoRepositorio repositorio = new AgendamentoRepositorio();
        
        //int id, Paciente paciente, Medico medico, Date data, String Hora
        Agendamento agendamento = new Agendamento(0,paciente,medico,dataHora);
        repositorio.salvar(agendamento);
        return true;
    }
    
    public boolean reagendar(Agendamento agendamento, Medico medico, Paciente paciente, Calendar dataHora){
        AgendamentoRepositorio repositorio = new AgendamentoRepositorio();
        
        agendamento.setMedico(medico);
        agendamento.setPaciente(paciente);
        agendamento.setDataHora(dataHora);
        repositorio.atualizar(agendamento);
        return true;
    }
    
    public boolean cancelar(int id){
        AgendamentoRepositorio repositorio = new AgendamentoRepositorio();
        repositorio.excluir(id);
        return true;
    }
}
