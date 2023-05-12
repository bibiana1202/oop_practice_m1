package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
    @Test
    void validatePasswordTest2() {
        assertThatCode(() -> PasswordValidator.validate("aabb"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("비밀번호는 최소 8자 이상 12자 이하여야 한다.");
    }
}
