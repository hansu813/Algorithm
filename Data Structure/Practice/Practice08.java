package src.비선형자료구조.연습문제;

import java.util.PriorityQueue;

/**
 * packageName    : src.비선형자료구조.연습문제
 * fileName       : Practice08
 * author         : Hansu
 * date           : 2023-06-25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-25        shn81       최초 생성
 * n 개의 정수로 이루어진 배열 target 이 주어졌다.
 * 아래와 같은 방법을 통해 초기 배열에서 target 을 만들 수 있는지 판별하는 프로그램을 작성
 * 예를 들어 n 이 3이고 target 이 [9, 3, 5]으로 주어지고, 우선 초기 배열은 [1, 1, 1]로 시작 된다.
 * 1. 초기 배열의 모든 원소의 합을 구한 후 임의의 위치를 해당 값으로 교체한다.
 * 2. 위의 방법을 반복한다
 * 이와 같이 초기 배열에서부터 원소의 합을 구하고 새롭게 배치하는 반복작업을 통해
 * target 을 만들수 있다면 true, 불가능하면 false 를 반환
 */
public class Practice08 {
    public static boolean solution(int[] target) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((x, y) -> y - x);
        int sum = 0;
        for (int num : target) {
            sum += num;
            pq.add(num);
        }

        while (pq.peek() != 1) {
            int num = pq.poll();
            sum -= num;
            if (num <= sum || sum < 1) {
                return false;
            }
            num -= sum;
            sum += num;
            pq.add(num > 0 ? num : sum);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{9, 3, 5})); // true
        System.out.println(solution(new int[]{8, 5})); // true
        System.out.println(solution(new int[]{1, 1, 1, 2})); // false
    }

}
