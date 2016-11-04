package com.jsral.tdd;

import org.junit.Test;

public class DniTests {

    @Test
    public void testValidDnis() throws InvalidDni
    {
        Dni.parse("7.983.231-T");
        Dni.parse("7983231 T");
        Dni.parse("7983231T");
    }

    @Test(expected = InvalidDni.class)
    public void testInvalidLetterDni() throws InvalidDni
    {
        Dni.parse("7.983.231-R");
    }

    @Test(expected = InvalidDni.class)
    public void testInvalidNumberDni() throws InvalidDni
    {
        Dni.parse("X7.983.231-R");
    }
}
