package baseball;

public class BaseBallTeam {

    private String name; // チーム名
    private int win; // 勝利した数
    private int lose; // 負けた数
    private int draw;// 引き分け

    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    public double getRate() {
        return (double)win / (win + lose);
    }

    public void report() {
        System.out.println(name + " の2022年の成績は " + win + "勝 " + lose + "敗 " + draw + "分、勝率は" + getRate() + " です。");
    }

}
