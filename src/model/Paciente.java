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
    
    private int id;
    private String numeroSUS;
    private String email;
    private String telefone;
    
    public Paciente(int id, String nome, String cpf, Date data_de_nascimento, String idade) {
        super(id, nome, cpf, data_de_nascimento, idade);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    
}
