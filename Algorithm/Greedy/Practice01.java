package src.알고리즘.그리디알고리즘;

import java.util.HashMap;
import java.util.Map;

/**
 * packageName    : src.알고리즘.그리디알고리즘
 * fileName       : Practice01
 * author         : Hansu
 * date           : 2023-06-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-27        shn81       최초 생성
 * 거스름돈 문제
 */
public class Practice01 {
    public static void getChangeCoin(int receivedMoney, int price) {
        final int[] coins = {500, 100, 50, 10, 5, 1};
        HashMap<Integer, Integer> result = new HashMap<>();

        int change = receivedMoney - price;
        int cnt = 0;

        for (int i = 0; i < coins.length; i++) {
            if (change < coins[i]) {
                continue;
            }
            int q = change / coins[i];
            result.put(coins[i], result.getOrDefault(coins[i], 0) + q);

            change %= coins[i];
            cnt += q;
        }
        System.out.println("거스름돈 동전 수 : " + cnt);
        for (Map.Entry<Integer, Integer> cur : result.entrySet()) {
            System.out.println(cur.getKey() + " : " + cur.getValue());
        }
    }

    public static void main(String[] args) {
        // Test code
        getChangeCoin(1000, 100);
        getChangeCoin(1234, 500);
    }
}
