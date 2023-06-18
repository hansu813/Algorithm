package src.비선형자료구조.이진탐색트리;

import java.util.LinkedList;
import java.util.Queue;

/**
 * packageName    : src.비선형자료구조.이진탐색트리
 * fileName       : Main
 * author         : Hansu
 * date           : 2023-06-17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-17        shn81       최초 생성
 */
class Node01 {
    int key;
    Node01 left;
    Node01 right;

    Node01(int key, Node01 left, Node01 right) {
        this.key = key;
        this.left = left;
        this.right = right;
    }
}

class BinarySearchTree01 {
    Node01 head;

    BinarySearchTree01(){}
    BinarySearchTree01(int key) {
        this.head = new Node01(key, null, null);
    }

    public void addNode(int key) {
        if (this.head == null) {
            this.head = new Node01(key, null, null);
        } else {
            Node01 cur = this.head;
            while (true) {
                Node01 pre = cur;
                if (key < cur.key) {
                    cur = cur.left;
                    if (cur == null) {
                        pre.left = new Node01(key, null, null);
                        break;
                    }
                } else {
                    cur = cur.right;
                    if (cur == null) {
                        pre.right = new Node01(key, null, null);
                        break;
                    }
                }
            }
        }
    }

    public void removeNode(int key) {
        Node01 parent = null;
        Node01 successor = null;
        Node01 predecessor = null;
        Node01 child = null;

        Node01 cur = this.head;
        while (cur != null) {
            if (key == cur.key) {
                break;
            }

            parent = cur;
            if (key < cur.key) {
                cur = cur.left;
            } else {
                cur = cur.right;
            }
        }

        if (cur == null) {
            System.out.println("Key에 해당하는 노드가 없습니다.");
            return;
        }

        if (cur.left == null && cur.right == null) { // 자식 노드가 없을 경우
            if (parent == null) {
                this.head = null;
            } else {
                if (parent.left == cur) {
                    parent.left = null;
                } else {
                    parent.right = null;
                }
            }
        } else if (cur.left != null && cur.right == null || cur.left == null && cur.right != null) { // 자식 노드가 하나일 경우
            if (cur.left != null) {
                child = cur.left;
            } else {
                child = cur.right;
            }

            if (parent == null) {
                this.head = child;
            } else {
                if (parent.left == cur) {
                    parent.left = child;
                } else {
                    parent.right = child;
                }
            }
        } else { // 자식 노드가 둘인 경우
            predecessor = cur;
            successor = cur.left;

            while (successor.right != null) {
                predecessor = successor;
                successor = successor.right;
            }

            predecessor.right = successor.left;
            successor.left = cur.left;
            successor.right = cur.right;

            if (parent == null) {
                this.head = successor;
            } else {
                if (parent.left == cur) {
                    parent.left = successor;
                } else {
                    parent.right = successor;
                }
            }
        }
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

public class Main {
    public static void main(String[] args) {
//      Test code
//      Add Node
        BinarySearchTree01 bst = new BinarySearchTree01(20);
        bst.addNode(10);
        bst.addNode(30);
        bst.addNode(1);
        bst.addNode(15);
        bst.addNode(25);
        bst.addNode(13);
        bst.addNode(35);
        bst.addNode(27);
        bst.addNode(40);
        bst.levelOrder(bst.head);

//      Remove Node
        bst.removeNode(40);
        bst.levelOrder(bst.head);
        bst.removeNode(25);
        bst.levelOrder(bst.head);
        bst.removeNode(20);
        bst.levelOrder(bst.head);
    }
}
