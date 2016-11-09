package com.jsral.tdd;

public class DniFilter {

    public static String ID_FILTER_PATTERN = "[ \\.-]";

    private String id;

    public int getFilteredNumber() throws InvalidDni {
        String filteredId = id.replaceAll(ID_FILTER_PATTERN, "");
        try {
            return Integer.parseInt(filteredId.substring(0, filteredId.length() - 1));
        } catch (NumberFormatException e) {
            throw new InvalidDni(e);
        }
    }

    public char getLetter()
    {
        return Character.toUpperCase(id.charAt(id.length()-1));
    }

    public void setId(String id) {
        this.id = id;
    }
}