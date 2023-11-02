package view;

import java.util.Arrays;
import java.util.List;

public class Mainview {

    private final static String[] MONEY_OF_WINNING = {"5,000원", "50,000원", "1,500,000원",
            "30,000,000원", "2,000,000,000원"};

    public void askForHowMany() {
        System.out.println("구입금액을 입력해 주세요.");
    }

    public void requestNumbers() {
        System.out.println("당첨 번호를 입력해 주세요.");
    }

    public void requestBonusNumber() {
        System.out.println("보너스 번호를 입력해 주세요.");
    }

    public void printresult(int[] result) {
        System.out.println("당첨통계\n---");
        for (int i = 0; i < result.length; i++) {
            if(i <= 2) {
                System.out.println(3 + i + "개 일치 (" + MONEY_OF_WINNING[i] + ") - " + result[i] + "개");
            }
            else if(i == 3)
            {
                System.out.println(5+ "개 일치, 보너스 볼 일치 (" + MONEY_OF_WINNING[i] + ") - " + result[i] + "개");
            }
            else if(i == result.length-1)
            {
                System.out.println(6+ "개 일치 (" + MONEY_OF_WINNING[i] + ") - " + result[i] + "개");
            }
        }
    }

    public void printRateOfProfit(String rate)
    {
        System.out.println("총 수익률은 "+rate+"%입니다.");
    }

    public void printHowManyAndLottos(List<Integer[]> computerLottos)
    {
        System.out.println(computerLottos.size()+"개를 구매했습니다.");
        for (Integer[] lotto : computerLottos)
        {
            System.out.println(Arrays.toString(lotto));
        }
    }
}
