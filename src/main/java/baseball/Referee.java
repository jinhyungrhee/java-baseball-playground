package baseball;

import java.util.List;

public class Referee {

    Judgement judgement;

    public String compare(List<Integer> computer, List<Integer> player) {

        judgement = new Judgement();
        int correctCount = judgement.correctCount(computer, player);
        if (correctCount == 0) {
            return "낫싱";
        }
        int strikeCount = 0;
        for (int index = 0; index < player.size(); index++) {
            boolean isStrike = judgement.hasPlace(computer, index, player.get(index));
            if(isStrike) strikeCount++;
        }

        int ballCount = correctCount - strikeCount;
        if (ballCount == 0) {
            return strikeCount + "스트라이크";
        }
        if (strikeCount == 0) {
            return ballCount + "볼";
        }

        return ballCount + "볼 " + strikeCount + "스트라이크";
    }
}
