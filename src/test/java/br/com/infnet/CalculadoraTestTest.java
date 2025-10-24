package br.com.infnet;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class CalculadoraTestTest
{
    @Test
    public void testSoma()
    {
        CalculadoraTest calc = new CalculadoraTest();
        assertEquals(5, calc.soma(2, 3));
    }
}
