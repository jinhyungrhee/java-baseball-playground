package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

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

    @Test
    void 요구사항2() {
        String actual = "(1,2)".substring(1,4);
        assertThat(actual).isEqualTo("1,2");
    }

    @Test
    @DisplayName("Test Exception")
    void 요구사항3() {

        assertThatThrownBy(() -> {

            IntStream.range(0, 4).forEach(index -> {
                try {
                    System.out.println("abc".charAt(index));
                } catch(Exception e) {
                    throw new IndexOutOfBoundsException("BOOM!");
                }
            });

        }).isInstanceOf(IndexOutOfBoundsException.class).hasMessageContaining("BOOM!");

    }
}
