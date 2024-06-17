/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;

/**
 *
 * @author aldri
 */
public class CalculoIdade {
    public static int calculateIdade(String nascimento) {
        DateTimeFormatter formatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate nascimentoDate = LocalDate.parse(nascimento, formatada);
        LocalDate atualData = LocalDate.now();
        return Period.between(nascimentoDate, atualData).getYears();
    }
}
