/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import dao.repository.PacienteRepositorio;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import model.Paciente;

/**
 *
 * @author zanna
 */
public class PacienteServico {
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
}
