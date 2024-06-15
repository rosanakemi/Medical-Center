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
public class Atendente extends Pessoa {

    
    private int id;
    private String telefone;
    private String email;
    
    public Atendente(int id, String nome, String cpf, Date data_de_nascimento,String telefone, String email) {
        super(id, nome, cpf, data_de_nascimento);
        this.telefone = telefone;
        this.email = email;
        
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setId (int id){
        this.id = id;
    }
      
    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
