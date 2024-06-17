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
 * Classe de serviço para operações relacionadas aos médicos.
 * Realiza operações de CRUD (Criar, Ler, Atualizar, Deletar) para a entidade Medico.
 * 
 * @autor zanna
 */
public class MedicoServico {
    // Método para consultar todos os médicos
    public ArrayList<Medico> consultarTodos(){
        MedicoRepositorio repositorio = new MedicoRepositorio();
        return repositorio.obterTodos();
    }
    // Método para consultar um médico pelo ID
    public Medico consultarPorId(int id){
        MedicoRepositorio repositorio = new MedicoRepositorio();
        return repositorio.obterPorId(id);
    }
    // Método para filtrar médicos pelo nome
    public ArrayList<Medico> filtrar(String nome){
        MedicoRepositorio repositorio = new MedicoRepositorio();
        return repositorio.obterPorNome(nome);
    }
    // Método para cadastrar um novo médico
    public boolean cadastrar(String nome, String cpf, String data_de_nascimento, String crm, String especialidade, String status) throws ParseException{
        MedicoRepositorio repositorio = new MedicoRepositorio();
        
        // Formata a data de nascimento do formato String para Date
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date dataFormatter = formatter.parse(data_de_nascimento);
        // Cria um novo objeto Medico com os dados fornecidos
        Medico medico = new Medico(0,nome,cpf,dataFormatter,crm,especialidade,status);
        // Verifica se a idade do médico é maior ou igual a 120 anos
        if(medico.getIdade() >= 120){
            return false;// Não permite cadastrar médicos com mais de 120 anos
        }
        // Salva o médico no repositório
        repositorio.salvar(medico);
        return true;
    }
     // Método para atualizar um médico existente
    public boolean atualizar(int id,String nome, String cpf, String data_de_nascimento, String crm, String especialidade, String status) throws ParseException{
        MedicoRepositorio repositorio = new MedicoRepositorio();
        
        // Formata a data de nascimento do formato String para Date
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date dataFormatter = formatter.parse(data_de_nascimento);
        
        // Obtém o médico existente pelo ID
        Medico medico = repositorio.obterPorId(id);
        medico.setNome(nome);
        medico.setCpf(cpf);
        medico.setData_de_nascimento(dataFormatter);
        medico.setCRM(crm);
        medico.setStatus(status);
        medico.setEspecialidades(especialidade);
       // Verifica se a idade do médico é maior ou igual a 120 anos
        if(medico.getIdade() >= 120){
            return false;// Não permite atualizar médicos com mais de 120 anos
        }
        // Atualiza o médico no repositório
        repositorio.atualizar(medico);
        return true;
    }
    // Método para deletar um médico pelo ID
    public boolean deletar(int id){
        MedicoRepositorio repositorio = new MedicoRepositorio();
        repositorio.excluir(id);
        return true;
    }
    
    
}
