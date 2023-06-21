package src.비선형자료구조.우선순위큐;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * packageName    : src.비선형자료구조.우선순위큐
 * fileName       : Practice05
 * author         : Hansu
 * date           : 2023-06-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-21        shn81       최초 생성
 * 연습문제 :
 * nums 배열에 주어진 정수들 중에서 가장 많이 발생한 숫자들 순으로 k 번째 까지 출력하세요
 * 빈도가 같은 경우에는 값이 작은 숫자가 먼저 출력되도록 구현
 */
public class Practice05 {
    static void solution1(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>
                ((x, y) -> y.getValue() == x.getValue() ? x.getValue() - y.getValue() : y.getValue() - x.getValue());

        for (Map.Entry<Integer, Integer> item : map.entrySet()) {
            pq.add(item);
        }

        for (int i = 0; i < k; i++) {
            Map.Entry<Integer, Integer> cur = pq.poll();
            System.out.print(cur.getKey() + " ");
        }
        System.out.println();
    }

    static void solution2(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        PriorityQueue<Num> pq = new PriorityQueue();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.add(new Practice05().new Num(entry.getKey(), entry.getValue()));
        }

        for(int i = 0; i < k; i++) {
            Num cur = pq.poll();
            System.out.print(cur.key + " ");
        }
        System.out.println();
    }

    class Num implements Comparable<Num> {
        int key;
        int freq;

        public Num(int key, int freq) {
            this.key = key;
            this.freq = freq;
        }

        @Override
        public int compareTo(Num o) {
            if(this.freq == o.freq) {
                return this.freq - o.freq;
            } else {
                return o.freq - this.freq;
            }
        }
    }

    public static void main(String[] args) {
        // Test code
        int[] nums = {1, 1, 1, 2, 2, 3};
        solution1(nums, 2);
        solution2(nums, 2);
        System.out.println();

        nums = new int[]{3, 1, 4, 4, 3, 3, 1, 2, 2, 1, 3};
        solution1(nums, 3);
        solution2(nums, 3);
    }
}
