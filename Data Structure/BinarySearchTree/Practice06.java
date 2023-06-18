package src.비선형자료구조.이진탐색트리;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

/**
 * packageName    : src.비선형자료구조.이진탐색트리
 * fileName       : Practice06
 * author         : Hansu
 * date           : 2023-06-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-18        shn81       최초 생성
 * 연습문제
 * 주어진 BST 에서  인접한 노드 간의 차이값 중 최소값을 구하여라.
 * <p>
 * Input Tree : 4, 2, 6, 1, 3
 * Result : 1
 * <p>
 * Input Tree : 5, 1, 48, null, null, 12, 51
 * Result : 3
 */
public class Practice06 {
    public static void solution(Integer[] data) {
        BinarySearchTree01 bst = new BinarySearchTree01(data[0]);

        for(int i = 1; i < data.length; i++) {
            if(data[i] == null) {
                continue;
            }
            bst.addNode(data[i]);
        }

        ArrayList<Integer> list = new ArrayList();
        levelOrder(bst.head, list);

//        int min = list.stream().min((x1, x2) -> x1 > x2 ? 1 : -1).get();
        int min = Collections.min(list);
        System.out.println(min);
    }

    public static void levelOrder(Node01 node, ArrayList<Integer> list) {
        Queue<Node01> queue = new LinkedList<>();
        queue.add(node);

        while(!queue.isEmpty()) {
            Node01 cur = queue.poll();
            if(cur.left != null) {
                queue.offer(cur.left);
                list.add(Math.abs(cur.key - cur.left.key));
            }
            if(cur.right != null) {
                queue.offer(cur.right);
                list.add(Math.abs(cur.key - cur.right.key));
            }
        }
    }

    public static void main(String[] args) {
        // Test code
        Integer[] data = {4, 2, 6, 1, 3};
        solution(data);

        data = new Integer[]{5, 1, 48, null, null, 12, 51};
        solution(data);
    }
}
