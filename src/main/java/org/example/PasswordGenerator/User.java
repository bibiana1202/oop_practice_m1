package org.example.PasswordGenerator;

public class User {
    private String password;
    public void initPassword(PasswordGenerator passwordGenerator){
        // 패스워드를 몇글자로 만들지 컨트롤 할수가 없어서 힘듬 ->인터페이스 passwordGenerator 만든다.
        String password = passwordGenerator.generatePassword();
        /**
         * 비밀번호는 최소 8자 이상 12자 이하여야 한다.
         */
        // 비밀번호가 랜덤으로 만들어져서 test 코드 시 성공할수도 성공하지 않을 수도 있다.
        if (password.length()>=8 && password.length()<=12) {
            this.password = password;
        }
     }
    public String getPassword() {
        return password;
    }
}
