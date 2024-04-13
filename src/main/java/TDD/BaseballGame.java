package TDD;

import java.util.Random;
import java.util.Scanner;

public class BaseballGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String targetNubmer = generateRandomNumber();
        System.out.println(targetNubmer);

        while (true) {

            System.out.print("숫자를 입력해주세요 : ");
            String inputNumber = scanner.nextLine();
            System.out.println("INPUT : " + inputNumber);

            IsCorrect(targetNubmer, inputNumber);

        }



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

    public static Boolean IsCorrect(String targetNumber, String inputNumber) {
        return targetNumber.equals(inputNumber);
    }

}
