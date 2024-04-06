package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void 요구사항1() {
        String[] actual1 = "1,2".split(",");
        assertThat(actual1).contains("1");
        assertThat(actual1).contains("2");

        String[] actual2 = "1".split(",");
        assertThat(actual2).containsExactly("1");
    }
}
