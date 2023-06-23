package src.비선형자료구조.트라이;

/**
 * packageName    : src.비선형자료구조.트라이
 * fileName       : Practice03
 * author         : Hansu
 * date           : 2023-06-23
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-23        shn81       최초 생성
 * 문자열 배열 strs 와 targets 가 주어졌을 때
 * targets 내의 단어 중 한 문자만 바꾸면 strs 중의 단어가 되는지 판별하는 프로그램을 작성하세요.
 *
 */
public class Practice03 {
    static void solution(String[] strs, String[] targets) {
        Trie trie = new Trie();
        for(String str : strs) {
            trie.insert(str);
        }

        for(String target : targets) {
            boolean result = examineWord(trie.root, target, 0, false);
            System.out.print(result + " ");
        }
        System.out.println();
    }

    public static boolean examineWord(Node node, String target, int i, boolean flag) {
        if(i < target.length()) {
            if(node.child.containsKey(target.charAt(i))) {
                if(examineWord(node.child.get(target.charAt(i)), target, i + 1, flag)) {
                    return true;
                }
            }

            if(!flag) {
                for(char c : node.child.keySet()) {
                    if(c != target.charAt(i) && examineWord(node.child.get(c), target, i + 1, true)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return flag && node.isTerminal;
    }

    public static void main(String[] args) {
        String[] strs = {"apple", "banana", "kiwi"};
        String[] targets = {"applk", "bpple", "apple", "banan", "kiww"};
        solution(strs, targets); // true, true, false, false, true
    }
}
