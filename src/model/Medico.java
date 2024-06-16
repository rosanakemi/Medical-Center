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
public class Medico extends Pessoa {
    private String CRM;
    private String especialidades;
    private String status;
    
    public Medico(int id, String nome, String cpf, Date data_de_nascimento, String CRM, String especialidades,String status) {
        super(id, nome, cpf, data_de_nascimento);
        this.status = status;
        this.CRM = CRM;
        this.especialidades = especialidades;
        this.status = status;
    }

    public String getCRM() {
        return this.CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    public String getEspecialidades() {
        return this.especialidades;
    }

    public void setEspecialidades(String especialidades) {
        this.especialidades = especialidades;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
}
