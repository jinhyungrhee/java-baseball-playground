package study;

import baseball.Judgement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class JudgementTest {

    static Judgement judgement;

    @BeforeEach
    void setUp() {
        judgement = new Judgement();
    }

    /**
     * Junit5 파라미터로 List 전달하는 방법
     * @MethodSource("메서드명")
     * - 메소드의 리턴 값으로 파라미터를 전달함!
     */
    static Stream<Arguments> generateCorrectCountData() {
        return Stream.of(
                Arguments.of(Arrays.asList(1, 2, 3), 3),
                Arguments.of(Arrays.asList(2, 4, 3), 2)
        );
    }

    @ParameterizedTest()
    @MethodSource("generateCorrectCountData")
    void correctCount(List<Integer> players, Integer expected) {

        List<Integer> computers = Arrays.asList(1, 2, 3);

        Integer actual = judgement.correctCount(computers, players);
        assertThat(actual).isNotNull();
        assertThat(actual).isEqualTo(expected);

    }

    @Test
    void hasPlace() {
        List<Integer> computers = Arrays.asList(1, 2, 3);
        List<Integer> players = Arrays.asList(1, 2, 3);

        int strikeCount = 0;

        for (int index = 0; index < players.size(); index++) {
            boolean isStrike = judgement.hasPlace(computers, index, players.get(index));
            if (isStrike) strikeCount++;
        }

        assertThat(strikeCount).isEqualTo(3);


    }


}
