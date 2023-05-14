package org.example;

import org.example.PasswordGenerator.PasswordValidator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatCode;

public class PasswordValidatorTest {
    /**
     * 비밀번호는 최소 8자 이상 12자 이하여야 한다.
     * 비밀번호가 8자 미만 또는 12자 초과인 경우 IllegalArgumentException 예외를 발생시킨다.
     * 경계조건에 대해 테스트 코드를 작성해야 한다.
     */
    @DisplayName("비밀번호가 최소 8자 이상, 12자 이하면 예외가 발생하지 않는다.") // 문서화 역할
    @Test
    void validatePasswordTest() {
        assertThatCode(()-> PasswordValidator.validate("serverHJ"))
                .doesNotThrowAnyException(); // 해당 부분이 호출(실행) 되었을때 예외가 발생 하지 않음을 확인하고 싶다.
    }

    @DisplayName("비밀번호가 8자 미만 또는 12자 초과하는 경우 IllegalArgumentException 예외가 발생한다.")
    @ParameterizedTest // 실무에서 많이 사용함 공부하기!
    @ValueSource(strings = {"aabbcc","aabbccddeeffg"}) //13자 예외가 나타나는지 확인 -> 경계값 잘 통과하는 것을 확인
    void validatePasswordTest2(String password) {
        assertThatCode(() -> PasswordValidator.validate(password))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("비밀번호는 최소 8자 이상 12자 이하여야 한다.");
    }
}
