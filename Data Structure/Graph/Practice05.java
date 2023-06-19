package src.비선형자료구조.그래프;

import java.util.ArrayList;
import java.util.Stack;

/**
 * packageName    : src.비선형자료구조.그래프
 * fileName       : Practice05
 * author         : Hansu
 * date           : 2023-06-19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-19        shn81       최초 생성
 * 연습문제
 * 주어진 그래프에서 시작 노드에서 끝 노드로 가는 길이 있는지 확인하는 프로그램을 작성
 * path 가 존재하면 true 없으면 false 출력
 * <p>
 * Input case )
 * 노드 개수 = 3;
 * 간선 정보 = {{0, 1}, {1, 2}, {2, 0}}
 * 출발 노드 = 0
 * 종착 노드 = 2
 * Result = true
 */
public class Practice05 {
    static void solution(int n, int[][] edges, int source, int dest) {
        MyGraphList graph = new MyGraphList(n);

        for(int i = 0; i < n; i++) {
            graph.addVertex((char) i);
        }

        for(int i = 0; i < edges.length; i++) {
            graph.addEdge(edges[i][0], edges[i][1]);
        }

        ArrayList<Integer> list = new ArrayList<>();
        dfs(graph, 0, list);

        if(list.contains(source) && list.contains(dest)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void dfs(MyGraphList graph, int id, ArrayList<Integer> visitedItem) {
        boolean[] visited = new boolean[graph.vertices.length];
        Stack<Integer> stack = new Stack<>();

        stack.push(id);
        visited[id] = true;

        while(!stack.isEmpty()) {
            int curId = stack.pop();

            visitedItem.add(curId);

            Node01 cur = graph.adjList[curId];
            while (cur != null) {
                if(visited[cur.id] == false) {
                    stack.push(cur.id);
                    visited[cur.id] = true;
                }
                cur = cur.next;
            }
        }
    }

    public static void main(String[] args) {
        // Test code
        int n = 3;
        int[][] edges = {{0, 1}, {1, 2}, {2, 0}};
        int source = 0;
        int dest = 2;
        solution(n, edges, source, dest);

        n = 6;
        edges = new int[][]{{0, 1}, {0, 2}, {3, 5}, {5, 4}, {4, 3}};
        dest = 5;
        solution(n, edges, source, dest);
    }
}
