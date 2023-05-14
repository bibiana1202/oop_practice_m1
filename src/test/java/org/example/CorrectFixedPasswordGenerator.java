package org.example;

import org.example.PasswordGenerator.PasswordGenerator;

public class CorrectFixedPasswordGenerator implements PasswordGenerator {

    @Override
    public String generatePassword() {
        return "abcdefgg"; //8글자
    }
}
