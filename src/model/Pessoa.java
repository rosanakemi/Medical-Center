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
public abstract class Pessoa {
    
   private int id;
   private String nome;
   private String cpf;
   private Date data_de_nascimento;
   private String idade;
   
   public Pessoa(int id, String nome, String cpf, Date data_de_nascimento, String idade){
       this.id = id;
       this.nome = nome;
       this.cpf = cpf;
       this.data_de_nascimento = data_de_nascimento;
       this.idade = idade;
   }
   
   public int getId(){
       return this.id;
   }
   
   public void setId(int id){
       this.id = id;
   }
   
   public String getNome (){
       return this.nome;
   }
   
   public void setNome(String nome){
       this.nome = nome;
   }
   
   public String getCpf (){
       return this.cpf;
   }
   
   public void setCpf (String cpf){
       this.cpf = cpf;
   }
   
   public Date getData_de_nascimento (){
       return this.data_de_nascimento;
   }
   
   public void setData_de_nascimento(Date data_de_nascimento){
       this.data_de_nascimento = data_de_nascimento;
   }
   
   public String getIdade() {
        return this.idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
   
}
