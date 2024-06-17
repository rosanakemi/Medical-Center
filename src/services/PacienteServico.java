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
    // Método para consultar todos os pacientes
    public ArrayList<Paciente> consultarTodos(){
        PacienteRepositorio repositorio = new PacienteRepositorio();
        return repositorio.obterTodos();
    }
    // Método para consultar um paciente pelo ID
    public Paciente consultarPorId(int id){
        PacienteRepositorio repositorio = new PacienteRepositorio();
        return repositorio.obterPorId(id);
    }
    // Método para consultar um paciente pelo CPF
    public Paciente consultarPorCPF(String cpf){
        PacienteRepositorio repositorio = new PacienteRepositorio();
        return repositorio.obterPorCPF(cpf);
    }
    // Método para filtrar pacientes pelo nome
    public ArrayList<Paciente> filtrar(String nome){
        PacienteRepositorio repositorio = new PacienteRepositorio();
        return repositorio.obterPorNome(nome);
    }
    // Método para cadastrar um novo paciente
    public boolean cadastrar(String nome, String cpf, String data_de_nascimento, String numeroSus, String email, String telefone, String status) throws ParseException{
        PacienteRepositorio repositorio = new PacienteRepositorio();
        
        // Formata a data de nascimento do formato String para Date
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date dataFormatter = formatter.parse(data_de_nascimento);
        // Cria um novo objeto Paciente com os dados fornecidos
        Paciente paciente = new Paciente(0,nome,cpf,dataFormatter, numeroSus,email,telefone,status);
        // Verifica se a idade do paciente é maior ou igual a 120 anos
        if(paciente.getIdade() >= 120){
            return false;
        }
        // Cria um novo objeto Paciente com os dados fornecidos
        repositorio.salvar(paciente);
        return true;
    }
    // Método para atualizar um paciente existente
    public boolean atualizar(int id,String nome, String cpf, String data_de_nascimento, String numeroSus, String email, String telefone, String status) throws ParseException{
        PacienteRepositorio repositorio = new PacienteRepositorio();
        
        // Formata a data de nascimento do formato String para Date
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date dataFormatter = formatter.parse(data_de_nascimento);
        // Obtém o paciente existente pelo ID
        Paciente paciente = repositorio.obterPorId(id);
        paciente.setNome(nome);
        paciente.setCpf(cpf);
        paciente.setData_de_nascimento(dataFormatter);
        paciente.setNumeroSUS(numeroSus);
        paciente.setEmail(email);
        paciente.setTelefone(telefone);
        paciente.setStatus(status);
        // Verifica se a idade do paciente é maior ou igual a 120 anos
        if(paciente.getIdade() >= 120){
            return false;
        }
        // Salva o paciente no repositório
        repositorio.atualizar(paciente);
        return true;
    }
     // Método para deletar um paciente pelo ID
    public boolean deletar(int id){
        PacienteRepositorio repositorio = new PacienteRepositorio();
        repositorio.excluir(id);
        return true;
    }
}
