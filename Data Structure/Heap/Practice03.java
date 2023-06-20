package src.비선형자료구조.힙;

/**
 * packageName    : src.비선형자료구조.힙
 * fileName       : Practice03
 * author         : Hansu
 * date           : 2023-06-20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-20        shn81       최초 생성
 * 최소 힙, 최대 힙을 이용하여 데이터를 오름차순으로 정렬하라
 */
public class Practice03 {
    static void solution(MinHeap minHeap) {
        MaxHeap maxHeap = new MaxHeap();

        System.out.println("오름차순 : ");
        while (minHeap.heap.size() != 1) {
            int data = minHeap.delete();
            System.out.print(data + " ");
            maxHeap.insert(data);
        }
        System.out.println();

        System.out.println("내림차순 : ");
        while(maxHeap.heap.size() != 1) {
            System.out.print(maxHeap.delete() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Test code
        MinHeap minHeap = new MinHeap();
        minHeap.insert(30);
        minHeap.insert(40);
        minHeap.insert(10);
        minHeap.insert(50);
        minHeap.insert(60);
        minHeap.insert(70);
        minHeap.insert(20);
        minHeap.insert(30);

        solution(minHeap);
    }
}
