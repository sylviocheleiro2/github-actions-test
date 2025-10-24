package br.com.infnet;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraTestTest
{
    @Test
    public void testSoma()
    {
        CalculadoraTest calc = new CalculadoraTest();
        assertEquals(5, calc.soma(2, 3));
    }

    @Test
    public void testSubt()
    {
        CalculadoraTest calc = new CalculadoraTest();
        assertEquals(1, calc.subt(3, 2));
    }
}
