package TDD;

import java.util.Random;
import java.util.Scanner;

public class BaseballGame {

    public static String TARGET_NUMBER = "000";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        generateRandomNumber();

        boolean isCorrect = false;
        do {

            System.out.print("숫자를 입력해주세요 : ");
            String inputNumber = scanner.nextLine();

            System.out.println(getHint(TARGET_NUMBER, inputNumber));

            // 3스트라이크 일 경우, retry 여부 물어서 재시작 or 종료 판단
            isCorrect = isCorrect(TARGET_NUMBER, inputNumber);

        } while (!isCorrect);

    }

    public static void generateRandomNumber() {

        Random random = new Random();
        int number1 = 0;
        int number2 = 0;
        int number3 = 0;

        do {
            number1 = random.nextInt(9) + 1;
            number2 = random.nextInt(9) + 1;
            number3 = random.nextInt(9) + 1;
        } while (number1 == number2 || number1 == number3 || number2 == number3);

        TARGET_NUMBER = "" + number1 + number2 + number3;

    }

    public static Boolean isCorrect(String targetNumber, String inputNumber) {

        boolean isCorrect = targetNumber.equals(inputNumber);
       if (isCorrect) {
           return inquiryQuitOrNO();
       }
        return false;
    }

    public static String getHint(String targetNumber, String inputNumber) {

        int strikeCount = getStrikeCount(targetNumber, inputNumber);
        int ballCount = getBallCount(targetNumber, inputNumber);

        if (strikeCount == 3) {
            return "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
        }

        if (strikeCount != 0 && ballCount != 0) {
            return ballCount + "볼 " + strikeCount + "스트라이크";
        }

        if (ballCount == 0 && strikeCount != 0) {
            return strikeCount + "스트라이크";
        }

        if (strikeCount == 0 && ballCount != 0) {
            return ballCount + "볼";
        }

        return "포볼";
    }

    public static int getStrikeCount(String targetNumber, String inputNumber) {

        int strikeCount = 0;

        char targetFirst = targetNumber.charAt(0);
        char targetSecond = targetNumber.charAt(1);
        char targetThird = targetNumber.charAt(2);

        char inputFirst = inputNumber.charAt(0);
        char inputSecond = inputNumber.charAt(1);
        char inputThird = inputNumber.charAt(2);

        if (inputFirst == targetFirst) strikeCount++;
        if (inputSecond == targetSecond) strikeCount++;
        if (inputThird == targetThird) strikeCount++;

        return strikeCount;
    }

    public static int getBallCount(String targetNumber, String inputNumber) {

        int ballCount = 0;

        char targetFirst = targetNumber.charAt(0);
        char targetSecond = targetNumber.charAt(1);
        char targetThird = targetNumber.charAt(2);

        char inputFirst = inputNumber.charAt(0);
        char inputSecond = inputNumber.charAt(1);
        char inputThird = inputNumber.charAt(2);

        if (inputFirst == targetSecond || inputFirst == targetThird) ballCount++;
        if (inputSecond == targetFirst || inputSecond == targetThird) ballCount++;
        if (inputThird == targetFirst || inputThird == targetSecond) ballCount++;

        return ballCount;
    }

    public static boolean inquiryQuitOrNO() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        int input = scanner.nextInt();
        if (input == 2) return true;

        generateRandomNumber();
        return false;

    }

}
