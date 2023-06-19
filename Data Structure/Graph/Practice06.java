package src.비선형자료구조.그래프;

/**
 * packageName    : src.비선형자료구조.그래프
 * fileName       : Practice06
 * author         : Hansu
 * date           : 2023-06-19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-19        shn81       최초 생성
 * 연습문제
 * 주어진 그래프를 두 개의 그래프로 분리할 수 있는지 확인하는 프로그램을 작성하시오.
 * 분리 조건 : 인접하지 않은 노드끼리 분리
 * <p>
 * 모든 노드는 연결되어 있다.
 * 분리 가능하면 true, 불가능하면 false
 * <p>
 * Input Case )
 * Graph = {{1, 3}, {0, 2}, {1, 3}, {0, 2}}
 * Result = true
 * <p>
 * Input Case )
 * Graph = {{1, 2, 3}, {0, 2}, {0, 1 ,3}, {0, 2}}
 * Result = false
 */
public class Practice06 {
    static void solution(int[][] graph) {
        int[] flags = new int[graph.length];

        if (checkSplit(graph, flags, 1, 0) == true) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    static boolean checkSplit(int[][] graph, int[] flags, int flag, int node) {
        if(flags[node] != 0) {
            return flags[node] == flag;
        }

        flags[node] = flag;
        for (int adjacentNode : graph[node]) {
            if(!checkSplit(graph, flags, -flag, adjacentNode)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Test code
        int[][] graph = {{1, 3}, {0, 2}, {1, 3}, {0, 2}};
        solution(graph);

        graph = new int[][]{{1, 2, 3}, {0, 2}, {0, 1, 3}, {0, 2}};
        solution(graph);
    }
}
