package org.example;

public class CorrectFixedPasswordGenerator implements PasswordGenerator{

    @Override
    public String generatePassword() {
        return "abcdefgg"; //8글자
    }
}
