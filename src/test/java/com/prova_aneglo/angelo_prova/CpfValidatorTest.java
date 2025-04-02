package com.prova_aneglo.angelo_prova;

import static org.junit.jupiter.api.Assertions.*;

import com.prova_aneglo.angelo_prova.app.CpfValidator;
import org.junit.jupiter.api.Test;


class CpfValidatorTest {

    @Test
    void testCpfValido() {
        assertTrue(CpfValidator.validarCpf("529.982.247-25")); // CPF válido
    }

    @Test
    void testCpfInvalido() {
        assertFalse(CpfValidator.validarCpf("123.456.789-00")); // CPF inválido
    }

    @Test
    void testCpfComCaracteresEspeciais() {
        assertTrue(CpfValidator.validarCpf("52998224725")); // CPF válido sem pontos e traços
    }

    @Test
    void testCpfMenorQue11Digitos() {
        assertFalse(CpfValidator.validarCpf("52998")); // CPF muito curto
    }

    @Test
    void testCpfTodosDigitosIguais() {
        assertFalse(CpfValidator.validarCpf("111.111.111-11")); // CPF inválido
    }

    @Test
    void testCpfNulo() {
        assertFalse(CpfValidator.validarCpf(null)); // CPF nulo
    }
}
