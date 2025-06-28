package com.devops.finalProject;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class finalProjectTest {

    @Test
    void testCelsiusToFahrenheit1() {
        assertEquals(32.0, finalProject.celsiusToFahrenheit(0), 0.001);
        assertEquals(212.0, finalProject.celsiusToFahrenheit(100), 0.001);
        assertEquals(98.6, finalProject.celsiusToFahrenheit(37), 0.001);
    }

    @Test
    void testFahrenheitToCelsius2() {
        assertEquals(0.0, finalProject.fahrenheitToCelsius(32), 0.001);
        assertEquals(100.0, finalProject.fahrenheitToCelsius(212), 0.001);
        assertEquals(37.0, finalProject.fahrenheitToCelsius(98.6), 0.001);
    }
    
    @Test
    void testCelsiusToFahrenheit3() {
        assertEquals(32.0, finalProject.celsiusToFahrenheit(0), 0.001);
        assertEquals(212.0, finalProject.celsiusToFahrenheit(100), 0.001);
        assertEquals(98.6, finalProject.celsiusToFahrenheit(37), 0.001);
    }

    @Test
    void testFahrenheitToCelsius4() {
        assertEquals(0.0, finalProject.fahrenheitToCelsius(32), 0.001);
        assertEquals(100.0, finalProject.fahrenheitToCelsius(212), 0.001);
        assertEquals(37.0, finalProject.fahrenheitToCelsius(98.6), 0.001);
    }

    @Test
    void testCelsiusToFahrenheit5() {
        assertEquals(32.0, finalProject.celsiusToFahrenheit(0), 0.001);
        assertEquals(212.0, finalProject.celsiusToFahrenheit(100), 0.001);
        assertEquals(98.6, finalProject.celsiusToFahrenheit(37), 0.001);
    }

    @Test
    void testFahrenheitToCelsius6() {
        assertEquals(0.0, finalProject.fahrenheitToCelsius(32), 0.001);
        assertEquals(100.0, finalProject.fahrenheitToCelsius(212), 0.001);
        assertEquals(37.0, finalProject.fahrenheitToCelsius(98.6), 0.001);
    }

    @Test
    void testCelsiusToFahrenheit7() {
        assertEquals(32.0, finalProject.celsiusToFahrenheit(0), 0.001);
        assertEquals(212.0, finalProject.celsiusToFahrenheit(100), 0.001);
        assertEquals(98.6, finalProject.celsiusToFahrenheit(37), 0.001);
    }

    @Test
    void testFahrenheitToCelsius8() {
        assertEquals(0.0, finalProject.fahrenheitToCelsius(32), 0.001);
        assertEquals(100.0, finalProject.fahrenheitToCelsius(212), 0.001);
        assertEquals(37.0, finalProject.fahrenheitToCelsius(98.6), 0.001);
    }
}
