package study;

import baseball.NumberGenerator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class NumberGeneratorTest {

    static NumberGenerator numberGenerator;
    static List<Integer> numbers;

    @BeforeEach
    void setUp() {
        numberGenerator = new NumberGenerator();
        numbers = numberGenerator.generateRandomNumbers();
    }

    @Test
    void generateRandomNumber() {

        assertThat(numbers).isNotNull();
        assertThat(numbers.stream().findFirst().get()).isBetween(0, 9);

        assertThat(numbers.get(0)).isBetween(0, 9);
        assertThat(numbers.get(1)).isBetween(0, 9);
        assertThat(numbers.get(2)).isBetween(0, 9);

        System.out.println(numbers.get(0));
        System.out.println(numbers.get(1));
        System.out.println(numbers.get(2));

        assertThat(numbers.get(0)).isNotEqualTo(numbers.get(1));
        assertThat(numbers.get(1)).isNotEqualTo(numbers.get(2));
        assertThat(numbers.get(2)).isNotEqualTo(numbers.get(0));

    }

}
