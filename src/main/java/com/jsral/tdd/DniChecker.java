package com.jsral.tdd;

public class DniChecker {

    private static String DNI_LETTERS = "TRWAGMYFPDXBNJZSQVHLCKE";

    public void verify(int number, char letter) throws InvalidDni
    {
        if ( DNI_LETTERS.indexOf(letter) == -1 ) {
            throw new InvalidDni(letter + " is not a valid letter");
        }

        char expectedLetter = DNI_LETTERS.charAt(number % 23);
        if ( expectedLetter != letter ) {
            throw new InvalidDni(
                    "Expecting "
                    + expectedLetter
                    + " instead "
                    + letter
                    + " for number "
                    + number
            );
        }
    }
}
