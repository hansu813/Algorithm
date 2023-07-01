package src.알고리즘.최소신장트리;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * packageName    : src.알고리즘.최소신장트리
 * fileName       : Main2
 * author         : Hansu
 * date           : 2023-07-01
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-07-01        shn81       최초 생성
 * 프림 알고리즘
 */
public class Main2 {
    static class Node {
        int to;
        int weight;

        public Node(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }

    static int prim(int[][] data, int v, int e) {
        int weightSum = 0;

        ArrayList<ArrayList<Node>> graph = new ArrayList<>();
        for (int i = 0; i < v + 1; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < e; i++) {
            graph.get(data[i][0]).add(new Node(data[i][1], data[i][2]));
            graph.get(data[i][1]).add(new Node(data[i][0], data[i][2]));
        }

        boolean[] visited = new boolean[v + 1];
        PriorityQueue<Node> pq = new PriorityQueue<>((x, y) -> x.weight - y.weight);
        pq.offer(new Node(1, 0));

        int cnt = 0;
        while (!pq.isEmpty()) {
            Node cur = pq.poll();
            cnt += 1;

            if (visited[cur.to]) {
                continue;
            }
            visited[cur.to] = true;
            weightSum += cur.weight;

            if (cnt == v) {
                return weightSum;
            }

            for (int i = 0; i < graph.get(cur.to).size(); i++) {
                Node adjNode = graph.get(cur.to).get(i);
                if (visited[adjNode.to]) {
                    continue;
                }
                pq.offer(adjNode);
            }
        }
        return weightSum;
    }

    public static void main(String[] args) {
        // Test case
        int v = 7;
        int e = 10;
        int[][] graph = {{1, 3, 1}, {1, 2, 9}, {1, 6, 8}, {2, 4, 13}, {2, 5, 2}, {2, 6, 7}, {3, 4, 12}, {4, 7, 17}, {5, 6, 5}, {5, 7, 20}};

        System.out.println(prim(graph, v, e));
    }
}
