package com.jsral.tdd;

public class Dni {

    private String id;

    protected Dni(String id)
    {
        this.id = id;
    }

    protected void verify() throws InvalidDni
    {
        DniFilter filter = new DniFilter();
        DniChecker checker = new DniChecker();

        checker.verify(filter.getFilteredNumber(id), filter.getLetter(id));
    }

    public static void parse(String id) throws InvalidDni
    {
        Dni dni = new Dni(id);

        dni.verify();
    }
}
