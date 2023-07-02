package src.알고리즘.연습문제;

import java.util.ArrayList;

/**
 * packageName    : src.알고리즘.연습문제
 * fileName       : Practice03
 * author         : Hansu
 * date           : 2023-07-02
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-07-02        shn81       최초 생성
 * n 구 짜리 멀티탭 하나와 k 개의 전기 제품이 있을 때, 다음과 같은 상황을 가정해보자.
 * k 개의 전기 제품 1 ~ k 에 대해 제품의 사용 순서가 2,3,2,3,1,2,7 번 순으로
 * 사용된다고 했을 때,
 * 전기 제품 사용을 위해 멀티탭에 교체하는 수가 최소가 되는 값을 구하는 프로그램을 작성
 */
public class Practice03 {
    public static int solution(int n, int[] items) {
        boolean[] used = new boolean[items.length + 1];

        int idx = 0;
        int cnt = 0;

        while (cnt < n) {
            if (!used[items[idx]]) {
                used[items[idx]] = true;
                cnt++;
            }
            idx++;
        }
        int result = 0;
        while (idx < items.length) {
            if (!used[items[idx]]) {
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = idx; i < items.length; i++) {
                    if (used[items[i]] && !list.contains(items[i])) {
                        list.add(items[i]);
                    }
                }
                if (list.size() == n) {
                    used[list.get(n - 1)] = false;
                } else {
                    for (int i = 1; i <= items.length; i++) {
                        if (used[i] && !list.contains(i)) {
                            used[i] = false;
                            break;
                        }
                    }
                }
                used[items[idx]] = true;
                result++;
            }
            idx++;
        }
        return result;
    }

    public static void main(String[] args) {
        // Test case
        int n = 2;
        int[] items = {2, 3, 2, 3, 1, 2, 7};
        System.out.println(solution(n, items));

    }
}
