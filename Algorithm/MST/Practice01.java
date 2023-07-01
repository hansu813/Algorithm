package src.알고리즘.최소신장트리;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * packageName    : src.알고리즘.최소신장트리
 * fileName       : Practice01
 * author         : Hansu
 * date           : 2023-07-01
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-07-01        shn81       최초 생성
 * 연습 문제 )
 * 2250년, 인류는 지구 뿐 아니라 여러 행성을 다니며 살고 있다.
 * 이 행성 간을 빨리 오가기 위해 새롭게 터널을 구축하려 한다.
 * <p>
 * 행성은 (x, y, z) 좌표로 주어진다.
 * 행성 1 : (x1, y2, z2), 행성 2 : (x2, y2, z2)
 * 이 때 행성 간 터널 비용은 min(|x1-x2|, |y1 - y2|, |z1 - z2| 로 계산한다.
 * <p>
 * n 개의 행성 사이클 n - 1 개의 터널로 연결하는데 드는 최소 비용을 구하는 프로그램을 작성
 */
public class Practice01 {
    static class Point {
        int idx, x, y, z;

        public Point(int idx, int x, int y, int z) {
            this.idx = idx;
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }

    static class Edge implements Comparable<Edge> {
        int from, to, weight;

        public Edge(int from, int to, int weight) {
            this.from = from;
            this.to = to;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge o) {
            return weight - o.weight;
        }
    }

    static int[] parents;
    static ArrayList<Edge> edges;

    static int solution(int[][] data) {
        int n = data.length;

        Point[] points = new Point[n];
        for (int i = 0; i < n; i++) {
            points[i] = new Point(i, data[i][0], data[i][1], data[i][2]);
        }

        edges = new ArrayList<>();

        // x축 기준 간선 추가
        Arrays.sort(points, (p1, p2) -> p1.x - p2.x);
        for (int i = 0; i < n - 1; i++) {
            int weight = Math.abs(points[i].x - points[i + 1].x);
            edges.add(new Edge(points[i].idx, points[i + 1].idx, weight));
        }

        // y축 기준 간선 추가
        Arrays.sort(points, (p1, p2) -> p1.y - p2.y);
        for (int i = 0; i < n - 1; i++) {
            int weight = Math.abs(points[i].y - points[i + 1].y);
            edges.add(new Edge(points[i].idx, points[i + 1].idx, weight));
        }

        // z축 기준 간선 추가
        Arrays.sort(points, (p1, p2) -> p1.z - p2.z);
        for (int i = 0; i < n - 1; i++) {
            int weight = Math.abs(points[i].z - points[i + 1].z);
            edges.add(new Edge(points[i].idx, points[i + 1].idx, weight));
        }

        Collections.sort(edges);
        return kruskal(n, edges);
    }

    static int kruskal(int n, ArrayList<Edge> edges) {
        parents = new int[n];
        for (int i = 0; i < n; i++) {
            parents[i] = i;
        }

        int weightSum = 0;
        for (int i = 0; i < edges.size(); i++) {
            Edge edge = edges.get(i);

            if (find(edge.from) != find(edge.to)) {
                union(edge.from, edge.to);
                weightSum += edge.weight;
            }
        }
        return weightSum;
    }

    static void union(int a, int b) {
        int aP = find(a);
        int bP = find(b);

        if (aP != bP) {
            parents[aP] = bP;
        }
    }

    static int find(int a) {
        if (a == parents[a]) {
            return a;
        }
        return parents[a] = find(parents[a]);
    }

    public static void main(String[] args) {
        // Test case
        int[][] data = {{11, -15, -15}, {14, -5, -15}, {-1, -1, -5}, {10, -4, -1}, {19, -4, 19}};
        System.out.println(solution(data));
    }
}
