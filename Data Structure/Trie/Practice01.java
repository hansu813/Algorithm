package src.비선형자료구조.트라이;

/**
 * packageName    : src.비선형자료구조.트라이
 * fileName       : Practice01
 * author         : Hansu
 * date           : 2023-06-23
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-23        shn81       최초 생성
 * 연습문제
 * 문자열 배열 strs 와 문자열 prefix 가 주어졌을 때
 * 문자열 배열 내에 prefix 로 시작하는 단어가 있는지를 확인하는 프로그램
 * prefix 로 시작하는 단어가 존재한다면 true 없다면 false 를 반환하세요.
 */
public class Practice01 {
    static boolean solution(String[] strs, String prefix) {
        Trie trie = new Trie();
        for(String str : strs) {
            trie.insert(str);
        }
        Node cur = trie.root;
        for(int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);

            if(cur.child.get(c) == null) {
                return false;
            } else {
                cur = cur.child.get(c);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String[] strs = {"apple", "april", "app", "ace", "bear", "best"};
        System.out.println(solution(strs, "app"));

        System.out.println(solution(strs, "pre"));

        System.out.println(solution(strs, "be"));
    }
}
