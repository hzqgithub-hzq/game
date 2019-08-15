import java.math.BigDecimal;

/**
 * 玩家的基类
 */
public abstract class Person {
    private String name;
    private int roundCount = 0;
    private int winCount = 0;

    public Person(String name) {
        this.name = name;
        roundCount = 0;
        winCount = 0;
    }

    public abstract int nextAction();


    public int getWinRepeat() {
        return winRepeat;
    }

    private int winRepeat = 0;

    public int win() {
        winRepeat++;
        roundCount++;
        winCount++;
        return winRepeat;
    }

    public void fail() {
        winRepeat = 0;
        roundCount++;
    }

    public void eq() {
        winRepeat = 0;
        roundCount++;
    }

    public int getWinRate() {
        int rate = getWinCount() * 100 / getRoundCount();
        return rate;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoundCount() {
        return roundCount;
    }

    public void setRoundCount(int roundCount) {
        this.roundCount = roundCount;
    }

    public int getWinCount() {
        return winCount;
    }

    public void setWinCount(int winCount) {
        this.winCount = winCount;
    }
}

