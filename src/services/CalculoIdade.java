/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;

/**
 * Classe de serviço para cálculo de idade com base na data de nascimento.
 * 
 * @autor aldri
 */
public class CalculoIdade {
    // Método estático para calcular a idade com base na data de nascimento fornecida como String
    public static int calculateIdade(String nascimento) {
         // Define o formato da data de nascimento
        DateTimeFormatter formatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // Converte a data de nascimento do formato String para LocalDate
        LocalDate nascimentoDate = LocalDate.parse(nascimento, formatada);
        // Obtém a data atual
        LocalDate atualData = LocalDate.now();
         // Calcula a diferença entre a data de nascimento e a data atual em anos
        return Period.between(nascimentoDate, atualData).getYears();
        
    }
}
