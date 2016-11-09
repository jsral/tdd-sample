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

        filter.setId(id);
        checker.verify(filter.getFilteredNumber(), filter.getLetter());
    }

    public static void parse(String id) throws InvalidDni
    {
        Dni dni = new Dni(id);

        dni.verify();
    }
}
