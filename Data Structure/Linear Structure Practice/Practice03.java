package data_structure.선형자료구조_연습문제;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * packageName    : data_structure.선형자료구조_연습문제
 * fileName       : Practice03
 * author         : Hansu
 * date           : 2023-06-07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-07        shn81       최초 생성
 */
class Node {
    int data;
    int cmd;

    boolean visited;
    Node next;
    Node prev;

    public Node(int data, int cmd, boolean visited, Node next, Node prev) {
        this.data = data;
        this.cmd = cmd;
        this.visited = visited;
        this.next = next;
        this.prev = prev;
    }
}

class LinkedListC {
    Node head;

    public void add(int data, int cmd) {
        if(this.head == null) {
            this.head = new Node(data, cmd, false, null, null);
            this.head.next = this.head;
            this.head.prev = this.head;
        } else {
            Node cur = this.head;
            while(cur.next != this.head) {
                cur = cur.next;
            }
            cur.next = new Node(data, cmd, false, cur.next, cur);
            this.head.prev = cur.next;
        }
    }
}

public class Practice03 {
    public static void solution(int[] arr) {
        LinkedListC linkedListC = new LinkedListC();
        for(int i = 0; i < arr.length; i++) {
            linkedListC.add(i + 1, arr[i]);
        }
        Node cur = linkedListC.head;

        int visitCnt = 0;
        int cmd = 0;
        while (visitCnt != arr.length) {
            int cnt = 0;
            while(cnt != Math.abs(cmd)) {
                if(cmd > 0) {
                    cur = cur.next;
                } else {
                    cur = cur.prev;
                }
                if(cur.visited == false) {
                    cnt++;
                }
            }
            System.out.println(cur.data + " ");
            cur.visited = true;
            visitCnt++;
            cmd = cur.cmd;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,2,1,-3,-1};
        solution(arr);
    }

}
