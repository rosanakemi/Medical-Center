/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

/**
 *
 * @author aldri
 */

// Método para validar um CPF
public class ValidacaoCpf {
     public static boolean validaCPF(String cpf) {
         // Declaração das variáveis para os dígitos do CPF e para os cálculos
        int num1, num2, num3, num4, num5, num6, num7, num8, num9, num10, num11;
        int soma1, soma2;
        int resto1, resto2;

        // Extrai os dígitos do CPF e converte para inteiro
        num1 = Character.getNumericValue(cpf.charAt(0));
        num2 = Character.getNumericValue(cpf.charAt(1));
        num3 = Character.getNumericValue(cpf.charAt(2));
        num4 = Character.getNumericValue(cpf.charAt(4));
        num5 = Character.getNumericValue(cpf.charAt(5));
        num6 = Character.getNumericValue(cpf.charAt(6));
        num7 = Character.getNumericValue(cpf.charAt(8));
        num8 = Character.getNumericValue(cpf.charAt(9));
        num9 = Character.getNumericValue(cpf.charAt(10));
        num10 = Character.getNumericValue(cpf.charAt(12));
        num11 = Character.getNumericValue(cpf.charAt(13));

        // Validação dos CPFs inválidos conhecidos (onde todos os dígitos são iguais)
        if (num1 == num2 && num2 == num3 && num3 == num4 && 
            num4 == num5 && num5 == num6 && num6 == num7 && 
            num7 == num8 && num8 == num9 && num9 == num10 && 
            num10 == num11) {
            return false;// CPF inválido
        } else {
            // Cálculo do primeiro dígito verificador
            soma1 = (num1 * 10) + (num2 * 9) + (num3 * 8) + (num4 * 7) + 
                    (num5 * 6) + (num6 * 5) + (num7 * 4) + (num8 * 3) + 
                    (num9 * 2);

            resto1 = (soma1 * 10) % 11;
            // Se o resto for 10, o dígito verificador deve ser 0  
            if (resto1 == 10) {
                resto1 = 0;
            }
            // Cálculo do segundo dígito verificador
            soma2 = (num1 * 11) + (num2 * 10) + (num3 * 9) + (num4 * 8) + 
                    (num5 * 7) + (num6 * 6) + (num7 * 5) + (num8 * 4) + 
                    (num9 * 3) + (num10 * 2);

            resto2 = (soma2 * 10) % 11;
            // Se o resto for 10, o dígito verificador deve ser 0
            if (resto2 == 10) {
                resto2 = 0;
            }
            // Verifica se os dígitos verificadores calculados são iguais aos dígitos do CPF
            return resto1 == num10 && resto2 == num11;
        }
    }
}
