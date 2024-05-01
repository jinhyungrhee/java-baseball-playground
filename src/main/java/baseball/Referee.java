package baseball;

import java.util.List;

public class Referee {

    Judgement judgement;

    public String compare(List<Integer> computer, List<Integer> player) {

        judgement = new Judgement();
        int correctCount = judgement.correctCount(computer, player);

        return "";
    }
}
