package org.example.PasswordGenerator;

public class PasswordValidator {
    private static final String WRONG_PASSWORD_LENGTH_EXCEPTION_MESSAGE = "비밀번호는 최소 8자 이상 12자 이하여야 한다.";

    public static void validate(String password) {
       // 테스트 코드 통과후 리팩토링 => 리팩토링시 안정성 확보
        int length = password.length();
        if(length < 8 || length >12){
           throw new IllegalArgumentException(WRONG_PASSWORD_LENGTH_EXCEPTION_MESSAGE);
       }

    }
}
