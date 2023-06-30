package src.알고리즘.최단경로;

/**
 * packageName    : src.알고리즘.최단경로
 * fileName       : Practice02
 * author         : Hansu
 * date           : 2023-06-30
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-30        shn81       최초 생성
 * N 개의 우주가 있고, N 개의 우주 사이에 M 개의 포탈과 W 개의 웜홀이 있다.
 * 각 포탈에는 시간 비율이 있고, 포탈을 통해 우주를 이동했을 때 시간이 흘러 있다.
 * 웜홀에도 시간 비용이 있는데, 웜홀을 통해 우주를 이동하는 경우는 시간이 거꾸로 흘러있다.
 * N 개의 우주 포탈과 웜홀을 통해 이동한다고 했을 때
 * 출발했을 때보다 시간이 거꾸로 흘러가 있는 경우가 있는지 판별하는 프로그램
 */
public class Practice02 {
    static class Edge {
        int from;
        int to;
        int weight;

        public Edge(int from, int to, int weight) {
            this.from = from;
            this.to = to;
            this.weight = weight;
        }
    }

    final static int INF = 100000000;
    static Edge[] edges;
    static int[] dist;

    public static void solution(int n, int m, int w, int[][] portal, int[][] wormhole) {
        edges = new Edge[m + w];
        for (int i = 0; i < m; i++) {
            edges[i] = new Edge(portal[i][0], portal[i][1], portal[i][2]);
        }
        for (int i = 0; i < w; i++) {
            edges[m + i] = new Edge(portal[i][0], portal[i][1], -portal[i][2]);
        }
        dist = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            dist[i] = INF;
        }
        dist[1] = 0;
        System.out.println(bellmanFort(n, m + w));
    }

    public static boolean bellmanFort(int v, int e) {
        boolean isMinusCycle = false;
        for (int i = 0; i < v + 1; i++) {
            for (int j = 0; j < e; j++) {
                Edge cur = edges[j];

                if (dist[cur.from] == INF) {
                    continue;
                }

                if (dist[cur.to] > dist[cur.from] + cur.weight) {
                    dist[cur.to] = dist[cur.from] + cur.weight;

                    if (i == v) {
                        isMinusCycle = true;
                    }
                }
            }
        }
        return isMinusCycle;
    }

    public static void main(String[] args) {
        // Test case
        int n = 3;
        int m = 3;
        int w = 1;
        int[][] portal = {{1, 2, 2}, {1, 3, 4}, {2, 3, 1}};
        int[][] wormhole = {{3, 1, 3}};
        solution(n, m, w, portal, wormhole);
    }
}
