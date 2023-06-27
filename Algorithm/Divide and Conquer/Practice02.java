package src.알고리즘.분할정복;

/**
 * packageName    : src.알고리즘.분할정복
 * fileName       : Practice02
 * author         : Hansu
 * date           : 2023-06-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-27        shn81       최초 생성
 * 2차원 정수형 배열 lists 가 주어졌다.
 * lists[i] 에는 각 링크드 리스트의 원소 정보가 들어있고,
 * 원소들은 오름차순으로 정렬된 상태이다.
 * 모든 링크드 리스트를 하나의 정렬된 링크드 리스트로 합병하세요.
 */
class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Practice02 {

    public static Node solution(Node[] lists) {
        return divideList(lists, 0, lists.length - 1);
    }

    public static Node divideList(Node[] list, int left, int right) {
        if (left == right) {
            return list[left];
        }
        int mid = left + (right - left) / 2;
        Node l1 = divideList(list, left, mid);
        Node l2 = divideList(list, mid + 1, right);

        return margeList(l1, l2);
    }

    public static Node margeList(Node l1, Node l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        Node marge = new Node(0);
        Node cur = marge;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        if (l1 != null) {
            cur.next = l1;
        }
        if (l2 != null) {
            cur.next = l2;
        }
        return marge.next;
    }

    public static void setUptLinkedList(Node[] node, int[][] list) {
        for (int i = 0; i < list.length; i++) {
            node[i] = new Node(list[i][0]);
        }

        for (int i = 0; i < list.length; i++) {
            Node cur = node[i];

            for (int j = 1; j < list[i].length; j++) {
                cur.next = new Node(list[i][j]);
                cur = cur.next;
            }
        }
    }

    public static void printList(Node node) {
        Node cur = node;
        while (cur.next != null) {
            System.out.print(cur.val + " -> ");
            cur = cur.next;
        }
        System.out.println(cur.val);
    }

    public static void main(String[] args) {
        int[][] lists = {{2, 3, 9}, {1, 5, 7}, {3, 6, 7, 11}};
        Node[] node = new Node[lists.length];
        setUptLinkedList(node, lists);
        Node combinedNode = solution(node);
        printList(combinedNode);
    }
}
