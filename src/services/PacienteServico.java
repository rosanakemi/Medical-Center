/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import dao.repository.PacienteRepositorio;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import model.Paciente;

/**
 *
 * @author zanna
 */
public class PacienteServico {
    
    public ArrayList<Paciente> consultarTodos(){
        PacienteRepositorio repositorio = new PacienteRepositorio();
        return repositorio.obterTodos();
    }
    
    public Paciente consultarPorId(int id){
        PacienteRepositorio repositorio = new PacienteRepositorio();
        return repositorio.obterPorId(id);
    }
    
    public Paciente consultarPorCPF(String cpf){
        PacienteRepositorio repositorio = new PacienteRepositorio();
        return repositorio.obterPorCPF(cpf);
    }
    
    public ArrayList<Paciente> filtrar(String nome){
        PacienteRepositorio repositorio = new PacienteRepositorio();
        return repositorio.obterPorNome(nome);
    }
    
    public boolean cadastrar(String nome, String cpf, String data_de_nascimento, String numeroSus, String email, String telefone, String status) throws ParseException{
        PacienteRepositorio repositorio = new PacienteRepositorio();
        
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date dataFormatter = formatter.parse(data_de_nascimento);
        
        Paciente paciente = new Paciente(0,nome,cpf,dataFormatter, numeroSus,email,telefone,status);
        
        if(paciente.getIdade() >= 120){
            return false;
        }
        
        repositorio.salvar(paciente);
        return true;
    }
    
    public boolean atualizar(int id,String nome, String cpf, String data_de_nascimento, String numeroSus, String email, String telefone, String status) throws ParseException{
        PacienteRepositorio repositorio = new PacienteRepositorio();
        
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date dataFormatter = formatter.parse(data_de_nascimento);
        
        Paciente paciente = repositorio.obterPorId(id);
        paciente.setNome(nome);
        paciente.setCpf(cpf);
        paciente.setData_de_nascimento(dataFormatter);
        paciente.setNumeroSUS(numeroSus);
        paciente.setEmail(email);
        paciente.setTelefone(telefone);
        paciente.setStatus(status);
        
        if(paciente.getIdade() >= 120){
            return false;
        }
        
        repositorio.atualizar(paciente);
        return true;
    }
    
    public boolean deletar(int id){
        PacienteRepositorio repositorio = new PacienteRepositorio();
        repositorio.excluir(id);
        return true;
    }
}
