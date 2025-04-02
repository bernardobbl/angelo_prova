package com.prova_aneglo.angelo_prova.app;

public class CpfValidator {

    public static boolean validarCpf(String cpf) {
        if (cpf == null) return false;

        // Remove caracteres não numéricos
        cpf = cpf.replaceAll("\\D", "");

        // CPF deve ter 11 dígitos e não pode ter todos os números iguais
        if (cpf.length() != 11 || cpf.matches("(\\d)\\1{10}")) {
            return false;
        }

        try {
            // Cálculo do primeiro dígito verificador
            int soma = 0;
            for (int i = 0; i < 9; i++) {
                soma += Character.getNumericValue(cpf.charAt(i)) * (10 - i);
            }
            int digito1 = (soma * 10) % 11;
            if (digito1 == 10) digito1 = 0;

            // Cálculo do segundo dígito verificador
            soma = 0;
            for (int i = 0; i < 10; i++) {
                soma += Character.getNumericValue(cpf.charAt(i)) * (11 - i);
            }
            int digito2 = (soma * 10) % 11;
            if (digito2 == 10) digito2 = 0;

            // Verifica se os dígitos calculados correspondem aos do CPF
            return digito1 == Character.getNumericValue(cpf.charAt(9)) &&
                    digito2 == Character.getNumericValue(cpf.charAt(10));

        } catch (NumberFormatException e) {
            return false;
        }
    }
}

