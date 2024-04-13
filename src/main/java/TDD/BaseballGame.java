package TDD;

import java.util.Random;

public class BaseballGame {

    public static void main(String[] args) {
        System.out.println(generateRandomNumber());
    }

    public static String generateRandomNumber() {

        Random random = new Random();

        int number1 = 0;
        int number2 = 0;
        int number3 = 0;

        do {
            number1 = random.nextInt(9) + 1;
            number2 = random.nextInt(9) + 1;
            number3 = random.nextInt(9) + 1;
        } while (number1 == number2 || number1 == number3 || number2 == number3);

        return "" + number1 + number2 + number3;


    }
}
