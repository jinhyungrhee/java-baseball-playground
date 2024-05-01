package baseball;

import java.util.List;

public class Judgement {

    public int correctCount(List<Integer> computer, List<Integer> player) {

        return (int) computer.stream().filter(player::contains).count();

    }

    public boolean hasPlace(List<Integer> numbers, int index, int number) {
        return false;
    }

}
