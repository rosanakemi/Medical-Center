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
    private Usuario usuario;
    
    public Atendente(int id, String nome, String cpf, Date data_de_nascimento, String idade) {
        super(id, nome, cpf, data_de_nascimento, idade);
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setId (int id){
        this.id = id;
    }
    
    public Usuario getUsuario(){
        return this.usuario;
    }
    
    public void setUsuario (Usuario usuario){
        this.usuario = usuario;
    }
}
