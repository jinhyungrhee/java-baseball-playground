package study;

import TDD.BaseballGame;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class BaseballGameTest {

    @Test
    void 기능1_임의의_세자리_숫자_생성() {
        // given
        String actual = BaseballGame.generateRandomNumber();

        // when
        String num1 = actual.substring(0, 1);
        String num2 = actual.substring(1, 2);
        String num3 = actual.substring(2, 3);

        // then
        assertThat(num1).isNotEqualTo(num2);
        assertThat(num2).isNotEqualTo(num3);
        assertThat(num3).isNotEqualTo(num1);

    }

}
