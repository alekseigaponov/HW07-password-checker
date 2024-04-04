package org.password;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordCheckerTest {
    @Test
    void shouldReturnTrueForComplexPasswordWithDigitsAndSpecialChars() {
        assertTrue( PasswordChecker.checkPasswordComplexity("Password123!") );
    }

    @Test
    void testComplexPasswordWithLongLength() {
        Assertions.assertTrue(PasswordChecker.checkPasswordComplexity("LongPassword1!"));
    }

    @Test
    void testComplexPasswordWithDigitsAndSpecialCharsAtStart() {
        Assertions.assertTrue(PasswordChecker.checkPasswordComplexity("!1Password"));
    }

    @Test
    void testComplexPasswordWithDigitsAndSpecialCharsAtEnd() {
        Assertions.assertTrue(PasswordChecker.checkPasswordComplexity("Password!1"));
    }

    @Test
    void testComplexPasswordWithDigitsAndSpecialCharsInTheMiddle() {
        Assertions.assertTrue(PasswordChecker.checkPasswordComplexity("Pa$$w0rd"));
    }

    @Test
    void testComplexPasswordWithRepeatedSpecialChars() {
        Assertions.assertTrue(PasswordChecker.checkPasswordComplexity("P@$$w0rd!"));
    }

}
