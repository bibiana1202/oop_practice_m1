package org.example;

public class WrongFixedPasswordGenerator implements PasswordGenerator{

    @Override
    public String generatePassword() {
        return "as"; //2글자
    }
}
됨