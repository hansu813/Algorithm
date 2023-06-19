package src.비선형자료구조.그래프;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * packageName    : src.비선형자료구조.그래프
 * fileName       : Practice02
 * author         : Hansu
 * date           : 2023-06-19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-19        shn81       최초 생성
 * 인접 행렬 그래프의 DFS, BFS
 */
class MyGraphMatrix02 extends MyGraphMatrix {
    public MyGraphMatrix02(int size) {
        super(size);
    }

    public void dfs(int id) {
        boolean[] visited = new boolean[this.elemCnt];
        Stack<Integer> stack = new Stack<>();

        stack.push(id);
        visited[id] = true;

        while (!stack.isEmpty()) {
            int curId = stack.pop();
            System.out.print(this.vertices[curId] + " ");

            for (int i = this.elemCnt - 1; i >= 0; i--) {
                if (this.adjMat[curId][i] == 1 && visited[i] == false) {
                    stack.push(i);
                    visited[i] = true;
                }
            }
        }
        System.out.println();
    }

    public void bfs(int id) {
        boolean[] visited = new boolean[this.elemCnt];
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(id);
        visited[id] = true;

        while (!queue.isEmpty()) {
            int curId = queue.poll();
            System.out.print(this.vertices[curId] + " ");

            for (int i = this.elemCnt - 1; i >= 0; i--) {
                if (this.adjMat[curId][i] == 1 && visited[i] == false) {
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
        System.out.println();
    }
}

public class Practice02 {
    public static void main(String[] args) {
        // Test Code
        MyGraphMatrix02 graph = new MyGraphMatrix02(7);
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');
        graph.addVertex('F');
        graph.addVertex('G');

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);
        graph.addEdge(3, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 6);
        graph.addEdge(5, 6);
        graph.printAdjacentMatrix();

        System.out.println();
        graph.dfs(0);
        graph.bfs(0);
    }
}
