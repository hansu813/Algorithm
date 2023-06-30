package src.알고리즘.최단경로;

/**
 * packageName    : src.알고리즘.최단경로
 * fileName       : Practice03
 * author         : Hansu
 * date           : 2023-06-30
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-30        shn81       최초 생성
 * n 개의 도시와 한 도시에서 다른 도시에 도착하는 m 개의 버스가 있다.
 * 각 버스는 한 번 사용할 때 필요한 비용이 있다.
 * 모든 도시의 쌍 (A, B)에 대해서 도시 A 에서 도시 B 로 가는데 필요한 비용의 최솟값을
 * 구하는 프로그램을 작성하시오.
 */
public class Practice03 {

    static int[][] dist;
    static final int INF = 100000000;

    public static void solution(int city, int bus, int[][] busInfo) {
        dist = new int[city + 1][city + 1];
        for(int i = 1; i < city + 1; i++) {
            for (int j = 1; j < city + 1; j++) {
                if(i != j) {
                    dist[i][j] = INF;
                }
            }
        }

        for (int i = 0; i < bus; i++) {
            dist[busInfo[i][0]][busInfo[i][1]] = Math.min(dist[busInfo[i][0]][busInfo[i][1]], busInfo[i][2]);
        }
        floydWarshall(city);

        for (int i = 1; i < city + 1; i++) {
            for (int j = 1; j < city + 1; j++) {
                if(dist[i][j] >= INF) {
                    System.out.printf("%5d ", 0);
                } else {
                    System.out.printf("%5d ", dist[i][j]);
                }
            }
            System.out.println();
        }
    }

    public static void floydWarshall(int v) {
        for (int k = 1; k < v + 1; k++) {
            for (int i = 1; i < v + 1; i++) {
                for (int j = 1; j < v + 1; j++) {
                    if(dist[i][k] != INF && dist[k][j] != INF) {
                        dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        // Test case
        int city = 5;
        int bus = 14;
        int[][] busInfo = {{1, 2, 2}, {1, 3, 3}, {1, 4, 1}, {1, 5, 10}, {2, 4, 2}, {3, 4, 1}, {3, 5, 1}, {4, 5, 3}, {3, 5, 10}, {3, 1, 8}, {1, 4, 2}, {5, 1, 7}, {3, 4, 2}, {5, 2, 4}};
        solution(city, bus, busInfo);
    }
}
