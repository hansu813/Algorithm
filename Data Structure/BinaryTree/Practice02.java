package 비선형자료구조.이진트리;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * packageName    : 비선형자료구조.이진트리
 * fileName       : Practice02
 * author         : Hansu
 * date           : 2023-06-11
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-11        shn81       최초 생성
 * 연결 리스트를 이용한 트리 구성, 순회
 */
class Node {
    char data;
    Node left;
    Node right;

    public Node(char data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}

class BinaryTree2 {
    Node head;

    public BinaryTree2() {}
    public BinaryTree2(char[] arr) {
        Node[] nodes = new Node[arr.length];
        for(int i = 0; i < nodes.length; i++) {
            nodes[i] = new Node(arr[i], null, null);
        }
        for(int i = 0; i < arr.length; i++) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            if(left < arr.length) {
                nodes[i].left = nodes[left];
            }
            if(right < arr.length) {
                nodes[i].right = nodes[right];
            }
        }
        this.head = nodes[0];
    }

    public void preOrder(Node node) {
        if(node == null) {
            return;
        }
        System.out.print(node.data + " ");
        this.preOrder(node.left);
        this.preOrder(node.right);
    }

    public void inOrder(Node node) {
        if(node == null) {
            return;
        }

        this.inOrder(node.left);
        System.out.print(node.data + " ");
        this.inOrder(node.right);
    }

    public void postOrder(Node node) {
        if(node == null) {
            return;
        }

        this.postOrder(node.left);
        this.postOrder(node.right);
        System.out.print(node.data + " ");
    }

    public void levelOrder(Node node) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()) {
            Node cur = queue.poll();
            System.out.print(cur.data + " ");
            if(cur.left != null) {
                queue.offer(cur.left);
            }
            if(cur.right != null) {
                queue.offer(cur.right);
            }
        }
    }
}

public class Practice02 {
    public static void main(String[] args) {
//      Test code
        char[] arr = new char[10];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (char)('A' + i);
        }

        BinaryTree2 bt = new BinaryTree2(arr);

        System.out.println("== Preorder ==");
        bt.preOrder(bt.head);
        System.out.println();

        System.out.println("== Inorder ==");
        bt.inOrder(bt.head);
        System.out.println();

        System.out.println("== Postorder ==");
        bt.postOrder(bt.head);
        System.out.println();

        System.out.println("== Levelorder ==");
        bt.levelOrder(bt.head);
        System.out.println();
    }
}
