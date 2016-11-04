package com.jsral.tdd;

public class DniChecker {

    private static String DNI_LETTERS = "TRWAGMYFPDXBNJZSQVHLCKE";

    private int number;
    private char letter;

    public DniChecker(int number, char letter)
    {
        this.number = number;
        this.letter = letter;
    }

    public void verify() throws InvalidDni
    {
        char expectedLetter = DNI_LETTERS.charAt(number % 23);

        if ( expectedLetter != letter ) {
            throw new InvalidDni(
                    "Invalid Dni: Expecting "
                    + expectedLetter
                    + " as letter instead "
                    + letter
                    + " for number "
                    + number
            );
        }
    }
}
