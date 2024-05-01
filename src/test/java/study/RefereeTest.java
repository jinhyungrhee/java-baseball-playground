package study;

import baseball.Referee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class RefereeTest {

    static Referee referee;

    @BeforeEach
    void setUp() {
        referee = new Referee();
    }

    /**
     * Junit5 파라미터로 List 전달하는 방법
     * @MethodSource("메서드명")
     * - 메소드의 리턴 값으로 파라미터를 전달함!
     */
    static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(Arrays.asList(1, 2, 3), "3스트라이크"),
                Arguments.of(Arrays.asList(2, 4, 3), "1스트라이크 1볼")
        );
    }

    @ParameterizedTest()
    @MethodSource("generateData")
    void compare(List<Integer> players, String expected) {

        List<Integer> computers = Arrays.asList(1, 2, 3);

        String actual = referee.compare(computers, players);
        assertThat(actual).isNotNull();
        assertThat(actual).isEqualTo(expected);

    }

}
