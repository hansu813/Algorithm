package src.비선형자료구조.이진탐색트리;

import java.util.HashSet;

/**
 * packageName    : src.비선형자료구조.이진탐색트리
 * fileName       : Practice07
 * author         : Hansu
 * date           : 2023-06-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-18        shn81       최초 생성
 * 연습문제
 * 주어진 BST에서 두 노드의 합이 target 값이 되는 경우가 있는지 확인하세요.
 * 있다면 true, 없다면 false 반환
 * <p>
 * Input Tree : 5, 3, 6, 2, 4, null, 7
 * target : 9
 * Result : true
 * <p>
 * Input Tree : 5, 3, 6, 2, 4, null, 7
 * target : 28
 * Result : false
 */
public class Practice07 {
    public static void solution(Integer[] data, int target) {
        BinarySearchTree01 bst = new BinarySearchTree01(data[0]);

        for(int i = 1; i < data.length; i++) {
            if(data[i] == null) {
                continue;
            }
            bst.addNode(data[i]);
        }

        HashSet<Integer> set = new HashSet<>();
        boolean result = search(bst.head, set, target);
        System.out.println(result);
    }

    public static boolean search(Node01 node, HashSet<Integer> set, int target) {
        if(node == null) {
            return false;
        }
        if(set.contains(target - node.key)) {
            return true;
        }
        set.add(node.key);
        if(search(node.left, set, target)) {
            return true;
        }
        if(search(node.right, set, target)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Integer[] data = {5, 3, 6, 2, 4, null, 7};
        int target = 9;
        solution(data, target);

        data = new Integer[]{5, 3, 6, 2, 4, null, 7};
        target = 28;
        solution(data, target);
    }
}
