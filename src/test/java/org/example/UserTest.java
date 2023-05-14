package org.example;

import org.example.PasswordGenerator.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UserTest {
    // 프로덕션 코드 작성후 테스트 코드 작성
    @DisplayName("패스워드 초기화 한다.")
    @Test
    void passwordTest() {
        //given
        User user = new User();

        //when
        user.initPassword(new CorrectFixedPasswordGenerator());
        // 해당 generator 는 8글자 만 나오므로 항상 성공
        // 초기화됨

        //then
        assertThat(user.getPassword()).isNotNull();

        // 비밀번호가 랜덤으로 만들어져서 test 코드시 성공할수도 성공하지 않을 수도 있다.

    }

    @DisplayName("패스워드가 요구사항에 부합하지 않아 초기화가 되지 않는다.")
    @Test
    void passwordTest2() {
        //given
        User user = new User();

        //when
        user.initPassword(new WrongFixedPasswordGenerator());
        // 해당 generator 는2 글자 만 나온다
        // 항상 실패하도록 만듬-> 항상 초기화되지않음

        //then
        assertThat(user.getPassword()).isNull();

    }
}