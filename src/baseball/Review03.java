package baseball;

public class Review03 {

    public static void main(String[] args) {
        BaseBallTeam bbt1 = new BaseBallTeam("東京ヤクルトスワローズ", 80, 59, 4);
        bbt1.report();
        BaseBallTeam bbt2 = new BaseBallTeam("横浜DeNAベイスターズ", 73, 68, 2);
        bbt2.report();
        BaseBallTeam bbt3 = new BaseBallTeam("阪神タイガース", 68, 71, 4);
        bbt3.report();
        BaseBallTeam bbt4 = new BaseBallTeam("読売ジャイアンツ", 68, 72, 3);
        bbt4.report();
        BaseBallTeam bbt5 = new BaseBallTeam("広島東洋カープ", 66, 74, 3);
        bbt5.report();
        BaseBallTeam bbt6 = new BaseBallTeam("中日ドラゴン", 66, 75, 2);
        bbt6.report();


    }

}
