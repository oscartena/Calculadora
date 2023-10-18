package com.example.calculadora;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class CalculadoraTest {

    @Test
    public void testAdd2Operands(){
        String total = Calculator.calculate("5+3");
        assertEquals("8",total);
    }
    @Test
    public void testAdd1Operand(){
        String total = Calculator.calculate("4+3+1");
        assertEquals("8",total);
    }

    @Test
    public void testMult2Operands(){
        String total = Calculator.calculate("4*2");
        assertEquals("8",total);
    }

    @Test
    public void testResta(){
        String total = Calculator.calculate("4-2");
        assertEquals("2",total);
    }

    @Test
    public void testSumaYResta(){
        String total = Calculator.calculate("4+6-3");
        assertEquals("7",total);
    }

    @Test
    public void testMultiplica(){
        String total = Calculator.calculate("2*3");
        assertEquals("6",total);
    }

    @Test
    public void testMultiplicaYSuma(){
        String total = Calculator.calculate("3+3*3");
        assertEquals("12",total);
    }
}