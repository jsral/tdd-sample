package com.jsral.tdd;

import org.junit.Test;

public class DniTest {

    @Test
    public void testValidDnis() throws InvalidDni
    {
        Dni.parse("7.873.231-D");
        Dni.parse("7873231 D");
        Dni.parse("7873231D");
    }

    @Test(expected = InvalidDni.class)
    public void testInvalidLetterDni() throws InvalidDni
    {
        Dni.parse("7.873.231-I");
    }

    @Test(expected = InvalidDni.class)
    public void testInvalidExpectedLetterDni() throws InvalidDni
    {
        Dni.parse("7.873.231-T");
    }

    @Test(expected = InvalidDni.class)
    public void testInvalidNumberDni() throws InvalidDni
    {
        Dni.parse("X7.873.231-D");
    }
}
