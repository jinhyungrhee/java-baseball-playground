package study;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {

    public static String[] signs  = {"+", "-", "/", "*"};

    @Test
    void 요구사항() {

        // given
        //String input = "2 + 3 * 4 / 2";
        String input = "2 + 3 - 4 * 2";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Scanner scanner = new Scanner(System.in);

        String value = scanner.nextLine();
        String[] values = value.split(" ");

        // when
        int result = calculate(values);

        // then
        System.out.println(result);

        //assertThat(result).isEqualTo(10);
        assertThat(result).isEqualTo(2);

    }

    public static int calculate(String[] values) {
        int result = Integer.parseInt(values[0]);

        for (int i = 1; i < values.length; i++) {
            if (values[i].equals("+")) {
                result = result + Integer.parseInt(values[i+1]);
            } else if (values[i].equals("-")) {
                result = result - Integer.parseInt(values[i+1]);
            } else if (values[i].equals("/")) {
                result = result / Integer.parseInt(values[i+1]);
            } else if (values[i].equals("*")) {
                result = result * Integer.parseInt(values[i+1]);
            }
        }

        return result;
    }

}
