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
public class Agendamento {
   
    private int id;
    private Paciente paciente;
    private Medico medico;
    private EspecialidadeMedica especialidade;
    private Date data;
    private String Hora;
    
    public Agendamento(int id, Paciente paciente, Medico medico, EspecialidadeMedica especialidade, Date data, String Hora){
        this.id = id;
        this.paciente = paciente;
        this.medico = medico;
        this.especialidade = especialidade;
        this.data = data;
        this.Hora = Hora;
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

    public EspecialidadeMedica getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(EspecialidadeMedica especialidade) {
        this.especialidade = especialidade;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }
}
