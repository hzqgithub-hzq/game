import java.util.Random;

public class JiaPerson extends Person {
    public JiaPerson() {
        super("甲");
    }

    private int lastAction = -1;

    public int getLastAction() {
        return lastAction;
    }

    public void setLastAction(int lastAction) {
        this.lastAction = lastAction;
    }

    @Override
    public int nextAction() {
        if (lastAction == GameUtil.Paper) {
            return lastAction = GameUtil.nextAction(GameUtil.Paper);
        }
        return lastAction = GameUtil.nextAction(-1);
    }
}
