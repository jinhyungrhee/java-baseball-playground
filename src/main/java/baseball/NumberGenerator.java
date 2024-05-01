package baseball;

import java.util.*;

public class NumberGenerator {

    public List<Integer> generateRandomNumbers(){

        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();

        while(isDuplicated(numbers)) {


            Integer randomNumber1 = random.nextInt(9) + 1;
            Integer randomNumber2 = random.nextInt(9) + 1;
            Integer randomNumber3 = random.nextInt(9) + 1;

            numbers = Arrays.asList(randomNumber1, randomNumber2, randomNumber3);

        }

        return numbers;
    }

    private Boolean isDuplicated(List<Integer> numbers) {

        // #1. 초기 빈 리스트인 경우, 무조건 true 리턴
        if (numbers.isEmpty()) return true;

        // #2. 하나라도 같으면 true 리턴
        return numbers.get(0) == numbers.get(1)
                || numbers.get(1) == numbers.get(2)
                || numbers.get(2) == numbers.get(0);
    }
}
