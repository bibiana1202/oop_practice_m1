package org.example;

import org.example.PasswordGenerator.PasswordGenerator;

public class WrongFixedPasswordGenerator implements PasswordGenerator {

    @Override
    public String generatePassword() {
        return "as"; //2글자
    }
}