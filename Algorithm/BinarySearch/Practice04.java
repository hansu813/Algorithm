package src.알고리즘.이진탐색;

/**
 * packageName    : src.알고리즘.이진탐색
 * fileName       : Practice04
 * author         : Hansu
 * date           : 2023-06-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-24        shn81       최초 생성
 * 연습문제 4)
 * 정수형 배열 weights 와 정수 days 가 주어졌다.
 * weights 에는 각 상품의 무게들에 대한 정보가 들어있고, days 는 운송 납기일이다.
 * 상품들은 weights 에 적혀있는 순서대로 실어서 운송해야 하는데
 * days 이내에 운성을 하기 위한 차량의 최소한의 적재량을 계산
 */
public class Practice04 {
    public static int solution(int[] weights, int days) {
        int left = 0;
        int right = 0;
        for(int i : weights) {
            left = Math.max(left, i);
            right += i;
        }

        while(left <= right) {
            int mid = (left + right) / 2;
            int cnt = 1;
            int cur = 0;
            for(int x : weights) {
                if(cur + x > mid) {
                    cnt++;
                    cur = 0;
                }
                cur += x;
            }

            if(cnt > days){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        // Test code
        int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(solution(weights, 5));
    }
}
