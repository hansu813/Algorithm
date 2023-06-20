package src.비선형자료구조.힙;

import java.util.ArrayList;
import java.util.stream.IntStream;

/**
 * packageName    : src.비선형자료구조.힙
 * fileName       : Practice04
 * author         : Hansu
 * date           : 2023-06-20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-20        shn81       최초 생성
 * 연습문제
 * 정수들을 힙 자료구조에 추가하고 n번 삭제 후 절대 값이 큰 값부터 출력
 *
 * Input : 3, 0, -2, -5, 9, 6, -11, 20, -30
 * Remove Cnt : 1
 * Result : 20, -11, 9, 6, -5, 3, -2, 0
 */
class Num {
    int val;
    boolean isMinus;

    public Num(int val) {
        this.isMinus = val < 0 ? true : false;
        this.val = Math.abs(val);
    }
}

class MaxHeap2 {
    ArrayList<Num> heap;

    public MaxHeap2() {
        this.heap = new ArrayList<>();
        this.heap.add(new Num(0));
    }

    public void insert(int data) {
        heap.add(new Num(data));

        int cur = heap.size() - 1;
        while (cur > 1 && heap.get(cur / 2).val < heap.get(cur).val) {
            Num parentVal = heap.get(cur / 2);
            heap.set(cur / 2, heap.get(cur));
            heap.set(cur, parentVal);

            cur /= 2;
        }
    }

    public Num delete() {
        if (heap.size() == 1) {
            System.err.println("Heap is empty!");
            return null;
        }
        Num target = heap.get(1);

        heap.set(1, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);

        int cur = 1;
        while (true) {
            int leftIdx = cur * 2;
            int rightIdx = cur * 2 + 1;
            int targetIdx = -1;

            if (rightIdx < heap.size()) {
                targetIdx = heap.get(leftIdx).val > heap.get(rightIdx).val ? leftIdx : rightIdx;
            } else if (leftIdx < heap.size()) {
                targetIdx = leftIdx;
            } else {
                break;
            }

            if (heap.get(cur).val > heap.get(targetIdx).val) {
                break;
            } else {
                Num parentVal = heap.get(cur);
                heap.set(cur, heap.get(targetIdx));
                heap.set(targetIdx, parentVal);
                cur = targetIdx;
            }
        }
        return target;
    }
}

public class Practice04 {
    static void solution(int[] nums, int deleteCnt) {
        MaxHeap2 maxHeap = new MaxHeap2();
        IntStream.of(nums).forEach(x -> maxHeap.insert(x));

        int cnt = 0;
        while (maxHeap.heap.size() != 1) {
            Num cur = maxHeap.delete();

            if(cnt++ < deleteCnt) {
                continue;
            }

            int oriVal = cur.isMinus ? cur.val * -1 : cur.val;
            System.out.print(oriVal + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int nums[] = {3, 0, -2, -5, 9, 6, -11, 20, -30};
        int deleteCnt = 1;
        solution(nums, deleteCnt);
    }
}
