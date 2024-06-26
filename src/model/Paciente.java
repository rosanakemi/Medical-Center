/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author zanna
 */
public class Paciente extends Pessoa { 
    private String numeroSUS;
    private String email;
    private String telefone;
    private String status;
    
    public Paciente(int id, String nome, String cpf, Date data_de_nascimento, String numeroSus, String email, String telefone, String status) {
        super(id, nome, cpf, data_de_nascimento);
        this.numeroSUS = numeroSus;
        this.email = email;
        this.telefone = telefone;
        this.status = status;
    }

    public String getNumeroSUS() {
        return numeroSUS;
    }

    public void setNumeroSUS(String numeroSUS) {
        this.numeroSUS = numeroSUS;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String toString(){
        return this.getNome();
    }
}
