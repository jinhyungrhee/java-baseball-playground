package study;

import TDD.BaseballGame;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;
import static TDD.BaseballGame.TARGET_NUMBER;

public class BaseballGameTest {

    @Test
    void 기능1_임의의_세자리_숫자_생성() {
        // given
        //String actual = BaseballGame.generateRandomNumber();
        BaseballGame.generateRandomNumber();

        // when
        String num1 = TARGET_NUMBER.substring(0, 1);
        String num2 = TARGET_NUMBER.substring(1, 2);
        String num3 = TARGET_NUMBER.substring(2, 3);

        // then
        assertThat(num1).isNotEqualTo(num2);
        assertThat(num2).isNotEqualTo(num3);
        assertThat(num3).isNotEqualTo(num1);

    }

    @ParameterizedTest
    @ValueSource(strings = {"123"})
    void 기능2_사용자의_숫자_입력받은_숫자와_컴퓨터의_숫자_비교(String inputNumber) {
        // given
        //String targetNumber = BaseballGame.generateRandomNumber();
        BaseballGame.generateRandomNumber();

        // when
        boolean result = BaseballGame.isCorrect(TARGET_NUMBER, inputNumber);

        // then
        System.out.println("TARGET:" + TARGET_NUMBER + " INPUT : " + inputNumber + " RESULT:" + result);
        assertThat(result).isEqualTo(false);
        //assertThat(result).isEqualTo(true);
    }

    @ParameterizedTest
    @ValueSource(strings={"123"})
    void 기능3_1_볼_카운트_확인(String inputNumber) {
        // given
        String targetNumber = "123";

        // when
        int ballCount = BaseballGame.getBallCount(targetNumber, inputNumber);

        // then
        System.out.println(ballCount);
        assertThat(ballCount).isEqualTo(0);

    }

    @ParameterizedTest
    @ValueSource(strings={"123"})
    void 기능3_2_스트라이크_카운트_확인(String inputNumber) {
        // given
        String targetNumber = "123";

        // when
        int strikeCount = BaseballGame.getStrikeCount(targetNumber, inputNumber);

        // then
        System.out.println(strikeCount);
        assertThat(strikeCount).isEqualTo(3);
    }


}
