package kr.eddi.demo.entity.basic.utility.basic.twelveth;

public class BettingMoneyManager {

    private static int totalBetMoney = 0;

    public static void betMoney(int betMoney) {
        totalBetMoney += betMoney;
    }
}