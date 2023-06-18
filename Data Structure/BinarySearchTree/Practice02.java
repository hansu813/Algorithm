package src.비선형자료구조.이진탐색트리;

import java.util.LinkedList;
import java.util.Queue;

/**
 * packageName    : src.비선형자료구조.이진탐색트리
 * fileName       : Practice02
 * author         : Hansu
 * date           : 2023-06-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-18        shn81       최초 생성
 * AVL 트리 - 삽입
 */
class Node02 {
    int key;
    int height;
    Node02 left;
    Node02 right;

    public Node02(int key, Node02 left, Node02 right) {
        this.key = key;
        this.height = 0;
        this.left = left;
        this.right = right;
    }
}

class AVLTree {
    Node02 head;

    public int height(Node02 node) {
        if(node == null) {
            return -1;
        }
        return node.height;
    }

    public Node02 rightRotate(Node02 node) {
        Node02 lNode = node.left;

        node.left = lNode.right;
        lNode.right = node;

        node.height = Math.max(height(node.left), height(node.right)) + 1;
        lNode.height = Math.max(height(lNode.left), height(lNode.right)) + 1;

        return lNode;
    }

    public Node02 leftRotate(Node02 node) {
        Node02 rNode = node.right;

        node.right = rNode.left;
        rNode.left = node;

        node.height = Math.max(height(node.left), height(node.right)) + 1;
        rNode.height = Math.max(height(rNode.left), height(rNode.right)) + 1;

        return rNode;
    }

    public Node02 lrRotate(Node02 node) {
        node.left = leftRotate(node.left);
        return rightRotate(node);
    }

    public Node02 rlRotate(Node02 node) {
        node.right = rightRotate(node.right);
        return leftRotate(node);
    }

    public int getBalance(Node02 node) {
        if(node == null) {
            return 0;
        }
        return height(node.left) - height(node.right);
    }

    public void insert(int key) {
        this.head = insert(this.head, key);
    }

    public Node02 insert(Node02 node, int key) {
        if(node == null) {
            return new Node02(key, null, null);
        }
        if(key < node.key) {
            node.left = insert(node.left, key);
        } else {
            node.right = insert(node.right, key);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;

        int balance = getBalance(node);

        // LL
        if(balance > 1 && key < node.left.key) {
            return rightRotate(node);
        }
        // RR
        if(balance < -1 && key > node.right.key) {
            return leftRotate(node);
        }
        // LR
        if(balance > 1 && key > node.left.key) {
            return lrRotate(node);
        }
        // RL
        if(balance < -1 && key < node.right.key) {
            return rlRotate(node);
        }
        return node;
    }

    public void  levelOrder(Node02 node) {
        Queue<Node02> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            Node02 cur = queue.poll();
            System.out.print(cur.key + " ");
            if(cur.left != null) {
                queue.offer(cur.left);
            }
            if(cur.right != null) {
                queue.offer(cur.right);
            }
        }
        System.out.println();
    }
}

public class Practice02 {
    public static void main(String[] args) {
//      Test code
        AVLTree avl = new AVLTree();

//      Insert
        avl.insert(30);
        avl.insert(20);
        avl.insert(10); // LL
        avl.levelOrder(avl.head);

        avl.insert(40);
        avl.insert(50); // RR
        avl.levelOrder(avl.head);

        avl.insert(5);
        avl.insert(7); // LR
        avl.levelOrder(avl.head);

        avl.insert(60); // LR
        avl.insert(55); // LR
        avl.levelOrder(avl.head);

    }
}
