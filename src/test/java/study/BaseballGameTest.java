package study;

import TDD.BaseballGame;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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

    @ParameterizedTest
    @ValueSource(strings = {"123"})
    void 기능2_사용자의_숫자_입력받은_숫자와_컴퓨터의_숫자_비교(String inputNumber) {
        // given
        String targetNumber = BaseballGame.generateRandomNumber();

        // when
        boolean result = BaseballGame.IsCorrect(targetNumber, inputNumber);

        // then
        System.out.println("TARGET:" + targetNumber + " INPUT : " + inputNumber + " RESULT:" + result);
        assertThat(result).isEqualTo(false);
        //assertThat(result).isEqualTo(true);
    }

}
