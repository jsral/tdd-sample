package com.jsral.tdd;

public class DniFilter {

    public static final String IDFILTERPATTERN = "[ \\.-]";

    public int getFilteredNumber(String id) throws InvalidDni {
        String filteredId = id.replaceAll(IDFILTERPATTERN, "");
        try {
            return Integer.parseInt(filteredId.substring(0, filteredId.length() - 1));
        } catch (NumberFormatException e) {
            throw new InvalidDni(e);
        }
    }

    public char getLetter(String id)
    {
        return Character.toUpperCase(id.charAt(id.length()-1));
    }

}