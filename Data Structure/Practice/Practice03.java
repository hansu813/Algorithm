package src.비선형자료구조.연습문제;

import java.util.*;

/**
 * packageName    : src.비선형자료구조.연습문제
 * fileName       : Practice03
 * author         : Hansu
 * date           : 2023-06-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-24        shn81       최초 생성
 * 연습문제 3)
 * 이메일 정보를 병합하는 프로그램을 구현하려고 한다.
 * 이메일 정보가 들어있는 2차원 문자열 배열 accounts 가 주어지고,
 * 각각의 accounts[i] 에 대해 accounts[i][0] 에는 사람 이름을, 나머지는 이메일이다.
 * 이름이 같고 이메일이 다르면 동명이인이다.
 */
public class Practice03 {
    public static ArrayList<ArrayList<String>> solution(ArrayList<ArrayList<String>> accounts) {
        HashMap<String, HashSet<String>> graph = new HashMap<>();
        HashMap<String, String> name = new HashMap<>();

        for (ArrayList<String> account : accounts) {
            String userName = account.get(0);

            for (int i = 1; i < account.size(); i++) {
                if (!graph.containsKey(account.get(i))) {
                    graph.put(account.get(i), new HashSet<>());
                }
                name.put(account.get(i), userName);
                if (i == 1) {
                    continue;
                }

                graph.get(account.get(i)).add(account.get(i - 1));
                graph.get(account.get(i - 1)).add(account.get(i));
            }
        }

        HashSet<String> visited = new HashSet<>();
        ArrayList<ArrayList<String>> result = new ArrayList<>();

        for (String email : name.keySet()) {
            ArrayList<String> list = new ArrayList<>();

            if (visited.add(email)) {
                dfs(graph, email, visited, list);
                Collections.sort(list);
                list.add(0, name.get(email));
                result.add(list);
            }
        }
        return result;
    }

    public static void dfs(HashMap<String, HashSet<String>> graph, String email, HashSet<String> visited, ArrayList<String> list) {
        list.add(email);
        for (String next : graph.get(email)) {
            if (visited.add(next)) {
                dfs(graph, next, visited, list);
            }
        }
    }

    public static void main(String[] args) {

    }
}
