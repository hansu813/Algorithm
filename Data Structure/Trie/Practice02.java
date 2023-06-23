package src.비선형자료구조.트라이;

/**
 * packageName    : src.비선형자료구조.트라이
 * fileName       : Practice02
 * author         : Hansu
 * date           : 2023-06-23
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-23        shn81       최초 생성
 * 문자열 배열 dictionary 와 문자열 sentence 가 주어졌을 때
 * sentence 내의 단어 중 dictionary 의 단어로 시작하는 경우 해당 단어로 변경하여 출력하는 프로그램
 */
public class Practice02 {
    static void solution(String[] dictionary, String sentence) {
        Trie trie = new Trie();
        for (String item : dictionary) {
            trie.insert(item);
        }
        StringBuffer sb = new StringBuffer();
        for (String word : sentence.split(" ")) {
            Node cur = trie.root;
            StringBuffer sbCur = new StringBuffer();

            for(char c : word.toCharArray()) {
                sbCur.append(c);
                if(cur.child.get(c) != null) {
                    if(cur.child.get(c).isTerminal) {
                        break;
                    }
                    cur = cur.child.get(c);
                } else {
                    sbCur = new StringBuffer(word);
                    break;
                }
            }
            sb.append(sbCur).append(" ");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        String[] dictionary = {"cat", "bat", "rat"};
        String sentence = "the cattle was rattled by the battery";
        solution(dictionary, sentence);
    }
}
