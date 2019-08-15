public class Game implements Runnable {
    public static void main(String[] args) {
        new Thread(new Game()).start();
    }

    @Override
    public void run() {
        final int repeatMax = 3;

        JiaPerson jia = new JiaPerson();
        YiPerson yi = new YiPerson();

        while (jia.getWinRepeat() != repeatMax && yi.getWinRepeat() != repeatMax) {
            int jiaAction = jia.nextAction();
            int yiAction = yi.nextAction();
            int result = GameUtil.gameResult(jiaAction, yiAction);

            switch (result) {
                case GameUtil.EQ: {
                    jia.eq();
                    yi.eq();
                }
                break;
                case GameUtil.FirstWin: {
                    jia.win();
                    yi.fail();
                }
                break;
                case GameUtil.SecondWin: {
                    jia.fail();
                    yi.win();
                }
                break;
                default:
                    break;
            }

            int roundCount = jia.getRoundCount();
            System.out.println("Round" + roundCount +
                    "    甲->" + GameUtil.getAction(jia.getLastAction()) +
                    "    乙->" + GameUtil.getAction(yi.getLastAction()) + "   结果：" + GameUtil.getGameResultNAme(result));
        }

        System.out.println("甲得分：" + jia.getWinCount());
        System.out.println("乙得分：" + yi.getWinCount());

        System.out.println("甲胜率：" + jia.getWinRate());
    }

}
