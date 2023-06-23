package src.비선형자료구조.트라이;

import java.util.HashMap;

/**
 * packageName    : src.비선형자료구조.트라이
 * fileName       : Main
 * author         : Hansu
 * date           : 2023-06-23
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-23        shn81       최초 생성
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

    public Trie() {
        this.root = new Node();
    }

    public void insert(String str) {
        Node cur = this.root;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

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

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (cur.child.containsKey(c)) {
                cur = cur.child.get(c);
            } else {
                return false;
            }
            if (i == str.length() - 1) {
                if (!cur.isTerminal) {
                    return false;
                }
            }
        }
        return true;
    }

    public void delete(String str) {
        boolean ret = this.delete(this.root, str, 0);
        if (ret) {
            System.out.println(str + " 삭제 완료");
        } else {
            System.out.println(str + "단어가 없습니다.");
        }
    }

    public boolean delete(Node node, String str, int idx) {
        char c = str.charAt(idx);
        if(!node.child.containsKey(c)) {
            return false;
        }
        Node cur = node.child.get(c);
        idx++;

        if(idx == str.length()) {
            if(!cur.isTerminal) {
                return false;
            } else {
                cur.isTerminal = false;
                if(cur.child.isEmpty()) {
                    node.child.remove(c);
                }
            }
        } else {
            if(!this.delete(cur, str, idx)) {
                return false;
            }

            if(!cur.isTerminal && cur.child.isEmpty()) {
                node.child.remove(c);
            }
        }
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        // Test code
        Trie trie = new Trie();
        trie.insert("apple");
        trie.insert("april");
        trie.insert("app");
        trie.insert("ace");
        trie.insert("bear");
        trie.insert("best");
        System.out.println(trie.search("apple"));
        System.out.println(trie.search("april"));
        System.out.println(trie.search("app"));
        System.out.println(trie.search("ace"));
        System.out.println(trie.search("bear"));
        System.out.println(trie.search("best"));

        System.out.println();
        trie.delete("apple");
        System.out.println(trie.search("apple"));
        System.out.println(trie.search("april"));
        System.out.println(trie.search("appl"));
        trie.delete("apple");
    }
}
