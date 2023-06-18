package src.비선형자료구조.이진탐색트리;

import java.util.ArrayList;

/**
 * packageName    : src.비선형자료구조.이진탐색트리
 * fileName       : Practice05
 * author         : Hansu
 * date           : 2023-06-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-18        shn81       최초 생성
 * 연습 문제
 * 주어진 이진 탐색 트리에서 N 번째로 작은 수 구하기
 * <p>
 * Input Tree : 3, 1, 4, null, 2
 * N = 1
 * Result : 1
 * <p>
 * Input Tree : 5, 3, 6, 2, 4, null, null, 1
 * N = 3
 * Result : 3
 */

public class Practice05 {
    public static void solution(Integer[] data, int n) {
        BinarySearchTree01 bst = new BinarySearchTree01(data[0]);

        for (int i = 1; i < data.length; i++) {
            if (data[i] == null) {
                continue;
            }
            bst.addNode(data[i]);
        }
        ArrayList<Integer> list = new ArrayList();
        inOrder(bst.head, list);
        System.out.println(list.get(n - 1));
    }

    public static void inOrder(Node01 node, ArrayList list) {
        if (node == null) {
            return;
        }
        inOrder(node.left, list);
        list.add(node.key);
        inOrder(node.right, list);
    }

    public static void main(String[] args) {
        // Test code
        Integer[] data = {3, 1, 4, null, 2};
        int n = 1;
        solution(data, n);

        data = new Integer[]{5, 3, 6, 2, 4, null, null, 1};
        n = 3;
        solution(data, n);
    }
}
