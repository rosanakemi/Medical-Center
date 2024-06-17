/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author zanna
 */
public class Agendamento {
   
    private int id;
    private Paciente paciente;
    private Medico medico;
    private Calendar dataHora;
    
    public Agendamento(int id, Paciente paciente, Medico medico, Calendar dataHora){
        this.id = id;
        this.paciente = paciente;
        this.medico = medico;
        this.dataHora = dataHora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    /**
     * @return the dataHora
     */
    public Calendar getDataHora() {
        return dataHora;
    }

    /**
     * @param dataHora the dataHora to set
     */
    public void setDataHora(Calendar dataHora) {
        this.dataHora = dataHora;
    }  
}
