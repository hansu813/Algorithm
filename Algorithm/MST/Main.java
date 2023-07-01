package src.알고리즘.최소신장트리;

import java.util.Arrays;

/**
 * packageName    : src.알고리즘.최소신장트리
 * fileName       : Main
 * author         : Hansu
 * date           : 2023-07-01
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-07-01        shn81       최초 생성
 * 크루스칼 알고리즘
 */
public class Main {
    static int[] parents;

    static int kruskal(int[][] data, int v, int e) {
        int weightSum = 0;
        Arrays.sort(data, (x, y) -> x[2] - y[2]);

        parents = new int[v + 1];
        for (int i = 1; i < v + 1; i++) {
            parents[i] = i;
        }

        for (int i = 0; i < e; i++) {
            if (find(data[i][0]) != find(data[i][1])) {
                union(data[i][0], data[i][1]);
                weightSum += data[i][2];
            }
        }
        return weightSum;
    }

    static void union(int a, int b) {
        int aP = find(a);
        int bP = find(b);
        if(aP != bP) {
            parents[aP] = bP;
        }
    }

    static int find(int a) {
        if(a == parents[a]) {
            return a;
        }
        return parents[a] = find(parents[a]);
    }

    public static void main(String[] args) {
        // Test case
        int v = 7;
        int e = 10;
        int[][] graph = {{1, 3, 1}, {1, 2, 9}, {1, 6, 8}, {2, 4, 13}, {2, 5, 2}, {2, 6, 7}, {3, 4, 12}, {4, 7, 17}, {5, 6, 5}, {5, 7, 20}};

        System.out.println(kruskal(graph, v, e));
    }
}
