package br.com.ubots.tdd;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestCalculator {

    @Test
    public void testMutiplication() {
        Calculator calculator = new Calculator();
        int produto = calculator.times(5, 2);
        assertEquals(10, result);
    }
}

