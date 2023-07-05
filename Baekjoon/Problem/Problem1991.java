package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * packageName    : baekjoon
 * fileName       : Problem1991
 * author         : Hansu
 * date           : 2023-07-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-07-05        shn81       최초 생성
 */
public class Problem1991 {
    static class Node {
        char data;
        Node left, right;

        public Node(char data) {
            this.data = data;
        }
    }

    static class BinaryTree {
        Node head;

        public void insertNode(char data, char left, char right) {
            if (this.head == null) {
                this.head = new Node(data);
                this.head.left = left != '.' ? new Node(left) : null;
                this.head.right = right != '.' ? new Node(right) : null;
            } else {
                findNode(this.head, data, left, right);
            }
        }

        public void findNode(Node node, char data, char left, char right) {
            if (node == null) {
                return;
            } else if (node.data == data) {
                node.left = left != '.' ? new Node(left) : null;
                node.right = right != '.' ? new Node(right) : null;
            } else {
                findNode(node.left, data, left, right);
                findNode(node.right, data, left, right);
            }
        }

        public void preOrder(Node node, StringBuilder sb) {
            if (node != null) {
                {
                    sb.append(node.data);
                    if (node.left != null) {
                        preOrder(node.left, sb);
                    }
                    if (node.right != null) {
                        preOrder(node.right, sb);
                    }
                }
            }
        }

        public void inOrder(Node node, StringBuilder sb) {
            if (node != null) {
                if (node.left != null) {
                    inOrder(node.left, sb);
                }
                sb.append(node.data);
                if (node.right != null) {
                    inOrder(node.right, sb);
                }
            }
        }

        public void postOrder(Node node, StringBuilder sb) {
            if (node != null) {
                if (node.left != null) {
                    postOrder(node.left, sb);
                }
                if (node.right != null) {
                    postOrder(node.right, sb);
                }
                sb.append(node.data);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        BinaryTree bt = new BinaryTree();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char node = st.nextToken().charAt(0);
            char left = st.nextToken().charAt(0);
            char right = st.nextToken().charAt(0);
            bt.insertNode(node, left, right);
        }

        StringBuilder sb = new StringBuilder();
        bt.preOrder(bt.head, sb);
        sb.append("\n");
        bt.inOrder(bt.head, sb);
        sb.append("\n");
        bt.postOrder(bt.head, sb);

        System.out.println(sb.toString());
    }
}
