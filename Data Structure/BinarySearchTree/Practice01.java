package src.비선형자료구조.이진탐색트리;

import java.util.LinkedList;
import java.util.Queue;

/**
 * packageName    : src.비선형자료구조.이진탐색트리
 * fileName       : Practice01
 * author         : Hansu
 * date           : 2023-06-17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-17        shn81       최초 생성
 * Main class의 BST 삽입, 삭제 코드를 재귀 형태로 구현
 */
class BinarySearchTree03 {
    Node01 head;

    BinarySearchTree03(int key) {
        this.head = new Node01(key, null, null);
    }

    public Node01 addNodeRecursive(Node01 cur, int key) {
        if(cur == null) {
            return new Node01(key, null, null);
        }
        if(key < cur.key) {
            cur.left = addNodeRecursive(cur.left, key);
        } else {
            cur.right = addNodeRecursive(cur.right, key);
        }
        return cur;
    }

    public Node01 removeNodeRecursive(Node01 cur, int key) {
        if(cur == null) {
            return null;
        }
        if(key < cur.key) {
            cur.left = removeNodeRecursive(cur.left, key);
        } else if(key > cur.key) {
            cur.right = removeNodeRecursive(cur.right, key);
        } else {
            if(cur.left == null) {
                return cur.right;
            } else if(cur.right == null) {
                return cur.left;
            } else {
                Node01 predecessor = cur;
                Node01 successor = cur.left;

                while(successor.right != null) {
                    predecessor = successor;
                    successor = successor.right;
                }

                predecessor.right = successor.left;
                cur.key = successor.key;
            }
        }
        return cur;
    }

    public void levelOrder(Node01 node) {
        Queue<Node01> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            Node01 cur = queue.poll();

            System.out.print(cur.key + " ");
            if (cur.left != null) {
                queue.offer(cur.left);
            }
            if (cur.right != null) {
                queue.offer(cur.right);
            }
        }
        System.out.println();
    }
}

public class Practice01 {
    public static void main(String[] args) {
//      Test code
//      Add Node
        BinarySearchTree03 bst = new BinarySearchTree03(20);
        bst.head = bst.addNodeRecursive(bst.head, 10);
        bst.head = bst.addNodeRecursive(bst.head, 30);
        bst.head = bst.addNodeRecursive(bst.head, 1);
        bst.head = bst.addNodeRecursive(bst.head, 15);
        bst.head = bst.addNodeRecursive(bst.head, 25);
        bst.head = bst.addNodeRecursive(bst.head, 13);
        bst.head = bst.addNodeRecursive(bst.head, 35);
        bst.head = bst.addNodeRecursive(bst.head, 27);
        bst.head = bst.addNodeRecursive(bst.head, 40);
        bst.levelOrder(bst.head);

//      Remove Node
        bst.head = bst.removeNodeRecursive(bst.head, 40);
        bst.levelOrder(bst.head);
        bst.head = bst.removeNodeRecursive(bst.head, 25);
        bst.levelOrder(bst.head);
        bst.head = bst.removeNodeRecursive(bst.head, 20);
        bst.levelOrder(bst.head);
    }
}
