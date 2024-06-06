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
    private String login;
    private String senha;
    
    public Usuario(int id, String login, String senha){
        this.id = id;
        this.login = login;
        this.senha = senha;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setId (int id){
        this.id = id;
    }
    
    public String getLogin(){
        return this.login;
    }
    
    public void setLogin (String login){
        this.login = login;
    }
    
    public String getSenha(){
        return this.senha;
    }
    
    public void setSenha (String senha){
        this.senha = senha;
    }
    
}
