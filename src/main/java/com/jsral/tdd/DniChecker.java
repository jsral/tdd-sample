package com.jsral.tdd;

public class DniChecker {

    private  static final String DNILETTERS = "TRWAGMYFPDXBNJZSQVHLCKE";

    public void verify(int number, char letter) throws InvalidDni
    {
        if ( DNILETTERS.indexOf(letter) == -1 ) {
            throw new InvalidDni(letter + " is not a valid letter");
        }

        char expectedLetter = DNILETTERS.charAt(number % 23);
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
