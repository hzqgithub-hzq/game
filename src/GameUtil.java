import java.awt.*;
import java.util.Random;

public class GameUtil {
    public static final int Rock = 0;
    public static final int Paper = 1;
    public static final int Scissors = 2;

    public static final int EQ = 0;
    public static final int FirstWin = 1;
    public static final int SecondWin = 2;


    public static String getAction(int action) {
        if (action == Rock) {
            return "石头";
        }
        if (action == Paper) {
            return "布";
        }
        if (action == Scissors) {
            return "剪刀";
        }
        return "";
    }

    /**
     * 排除一个Action
     *
     * @param exceptAction
     * @return
     */
    public static int nextAction(int exceptAction) {
        Random random = new Random();
        int randomInt = random.nextInt(3);
        if (exceptAction == -1) {
            return randomInt;
        }
        if (exceptAction == randomInt) {
            return nextAction(exceptAction);
        }
        return randomInt;
    }


    public static String getGameResultNAme(int gameResult) {
        if (gameResult == EQ) {
            return "双方平局";
        }
        if (gameResult == FirstWin) {
            return "甲获胜";
        }
        if (gameResult == SecondWin) {
            return "乙获胜";
        }
        return "";
    }


    /**
     * 0表示平，1表示firstWin，2表示secondWin
     *
     * @param firstAction
     * @param secondAction
     * @return
     */
    public static int gameResult(int firstAction, int secondAction) {
        if (firstAction == secondAction) {
            return EQ;
        }

        if (firstAction == Rock) {
            if (secondAction == Paper) {
                return SecondWin;
            }
            return FirstWin;
        }

        if (firstAction == Paper) {
            if (secondAction == Rock) {
                return FirstWin;
            }
            return SecondWin;
        }

        if (firstAction == Scissors) {
            if (secondAction == Rock) {
                return SecondWin;
            }
            return FirstWin;
        }

        return EQ;
    }


}
