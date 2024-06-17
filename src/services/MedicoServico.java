/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import dao.repository.MedicoRepositorio;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import model.Medico;

/**
 *
 * @author zanna
 */
public class MedicoServico {
    
    public ArrayList<Medico> consultarTodos(){
        MedicoRepositorio repositorio = new MedicoRepositorio();
        return repositorio.obterTodos();
    }
    
    public Medico consultarPorId(int id){
        MedicoRepositorio repositorio = new MedicoRepositorio();
        return repositorio.obterPorId(id);
    }
    
    public ArrayList<Medico> filtrar(String nome){
        MedicoRepositorio repositorio = new MedicoRepositorio();
        return repositorio.obterPorNome(nome);
    }
    
    public boolean cadastrar(String nome, String cpf, String data_de_nascimento, String crm, String especialidade, String status) throws ParseException{
        MedicoRepositorio repositorio = new MedicoRepositorio();
        
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date dataFormatter = formatter.parse(data_de_nascimento);
        
        Medico medico = new Medico(0,nome,cpf,dataFormatter,crm,especialidade,status);
        
        if(medico.getIdade() >= 120){
            return false;
        }
        
        repositorio.salvar(medico);
        return true;
    }
    
    public boolean atualizar(int id,String nome, String cpf, String data_de_nascimento, String crm, String especialidade, String status) throws ParseException{
        MedicoRepositorio repositorio = new MedicoRepositorio();
        
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date dataFormatter = formatter.parse(data_de_nascimento);
        
        
        Medico medico = repositorio.obterPorId(id);
        medico.setNome(nome);
        medico.setCpf(cpf);
        medico.setData_de_nascimento(dataFormatter);
        medico.setCRM(crm);
        medico.setStatus(status);
        medico.setEspecialidades(especialidade);
       
        if(medico.getIdade() >= 120){
            return false;
        }
        
        repositorio.atualizar(medico);
        return true;
    }
    
    public boolean deletar(int id){
        MedicoRepositorio repositorio = new MedicoRepositorio();
        repositorio.excluir(id);
        return true;
    }
    
    
}
