/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author zanna
 */
public class EspecialidadeMedica {
   
    private int id;
    private String descricao;
    
    public EspecialidadeMedica(int id, String descricao){
        this.id = id;
        this.descricao = descricao;
    }
    
    public int getId (){
        return this.id;
    }
    
    public void setId (int id){
        this.id = id;
    }
    
     public String getDescricao (){
        return this.descricao;
    }
    
    public void setDescricao (String descricao){
        this.descricao = descricao;
    }
    
}
