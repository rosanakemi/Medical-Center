/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author zanna
 */
public class Usuario {
    
    private int id;
    private String usuario;
    private String senha;
    
    public Usuario(int id, String usuario, String senha){
        this.id = id;
        this.usuario = usuario;
        this.senha = senha;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setId (int id){
        this.id = id;
    }
    
    public String getUsuario(){
        return this.usuario;
    }
    
    public void setUsuario (String usuario){
        this.usuario = usuario;
    }
    
    public String getSenha(){
        return this.senha;
    }
    
    public void setSenha (String senha){
        this.senha = senha;
    }
    
}
