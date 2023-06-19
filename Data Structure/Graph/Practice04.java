package src.비선형자료구조.그래프;

/**
 * packageName    : src.비선형자료구조.그래프
 * fileName       : Practice04
 * author         : Hansu
 * date           : 2023-06-19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-19        shn81       최초 생성
 * 연습 문제
 * Center Node 찾기
 * Undirected 그래프에서 center node 를 출력하시오.
 * Center node 는 다른 모든 노드와 연결 된 노드를 의미
 * <p>
 * 간선의 총 개수 = 노드의 개수 - 1
 * 모든 노드는 연결되어 있다.
 * <p>
 * Input Graph : {{1, 2}, {2, 3}, {4, 2}}
 * Result : 2
 * <p>
 * Input Graph : {{1, 2}, {5, 1}, {1, 3}, {1, 4}}
 * Result : 1
 */
public class Practice04 {
    static int solution(int[][] e) {
        MyGraphMatrix graph = new MyGraphMatrix(e.length + 1);

        for (int i = 0; i < e.length; i++) {
            graph.addEdge(e[i][0] - 1, e[i][1] - 1);
        }

        int[] edgeCnt = new int[e.length + 1];
        for (int i = 0; i < graph.adjMat.length; i++) {
            for (int j = 0; j < graph.adjMat[i].length; j++) {
                if (graph.adjMat[i][j] == 1) {
                    edgeCnt[i]++;
                }
            }
        }
        int maxCnt = -1;
        int maxIdx = -1;
        for (int i = 0; i < edgeCnt.length; i++) {
            if (maxCnt < edgeCnt[i]) {
                maxCnt = edgeCnt[i];
                maxIdx = i;
            }
        }

        return maxIdx + 1;
    }

    static int solution2(int[][] e) {
        return e[0][0] == e[1][0] || e[0][0] == e[1][1] ? e[0][0] : e[0][1];
    }

    public static void main(String[] args) {
        // Test code
        int[][] edges = {{1, 2}, {2, 3}, {4, 2}};
        System.out.println(solution(edges));
        System.out.println(solution2(edges));

        edges = new int[][]{{1, 2}, {5, 1}, {1, 3}, {1, 4}};
        System.out.println(solution(edges));
        System.out.println(solution2(edges));
    }
}
