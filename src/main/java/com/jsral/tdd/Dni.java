package com.jsral.tdd;

public class Dni {

    private int number;
    private char letter;

    protected Dni(String id) throws InvalidDni
    {
        DniFilter idFilter = new DniFilter(id);

        this.number = idFilter.getFilteredNumber();
        this.letter = Character.toUpperCase(id.charAt(id.length()-1));
    }

    protected void verify() throws InvalidDni
    {
        DniChecker checker = new DniChecker(number, letter);

        checker.verify();
    }

    public static void parse(String id) throws InvalidDni
    {
        Dni dni = new Dni(id);

        dni.verify();
    }
}
