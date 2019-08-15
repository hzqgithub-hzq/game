public class YiPerson extends Person {
    public YiPerson() {
        super("乙");
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
        if (lastAction == GameUtil.Rock) {
            return lastAction = GameUtil.Scissors;
        }
        return lastAction = GameUtil.nextAction(-1);
    }
}
