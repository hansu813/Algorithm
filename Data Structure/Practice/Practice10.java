package src.비선형자료구조.연습문제;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * packageName    : src.비선형자료구조.연습문제
 * fileName       : Practice10
 * author         : Hansu
 * date           : 2023-06-25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-25        shn81       최초 생성
 * 문자열 배열 queries 와 문자열 pattern 이 주어졌을 때,
 * queries 중 pattern 과 매칭되는 문자열은 true 아닌 경우 false 를 배열로 구성하여 반환
 */
class Node {
    HashMap<Character, Node> child;
    boolean isTerminal;

    public Node() {
        this.child = new HashMap<>();
        this.isTerminal = false;
    }
}

class Trie {
    Node root;
    ArrayList<Character> capitals;

    public Trie() {
        this.root = new Node();
        capitals = new ArrayList<>();
    }

    public void insert(String str) {
        Node cur = this.root;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c < 'a') {
                capitals.add(c);
            }

            cur.child.putIfAbsent(c, new Node());
            cur = cur.child.get(c);

            if (i == str.length() - 1) {
                cur.isTerminal = true;
                return;
            }
        }
    }

    public boolean search(String str) {
        Node cur = this.root;
        ArrayList<Character> cap = new ArrayList<>(capitals);
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (cur.child.containsKey(c)) {
                cap.remove(new Character(c));
                cur = cur.child.get(c);
            } else {
                if (c < 'a') {
                    return false;
                } else {
                    continue;
                }
            }
            if (i == str.length() - 1) {
                if (!cur.isTerminal) {
                    return false;
                }
            }
        }
        return cap.size() == 0;
    }
}

public class Practice10 {
    public static ArrayList<Boolean> solution(String[] queries, String pattern) {
        Trie trie = new Trie();
        trie.insert(pattern);

        ArrayList<Boolean> result = new ArrayList<>();
        for (String query : queries) {
            result.add(trie.search(query));
        }
        return result;
    }

    public static void main(String[] args) {
        String[] queries = {"FooBar", "FooBarTest", "FooBall", "FrameBuffer", "ForceFeedBack"};
        System.out.println(solution(queries, "FB"));
        System.out.println(solution(queries, "FoBa"));
        System.out.println(solution(queries, "FoBaT"));
    }
}
