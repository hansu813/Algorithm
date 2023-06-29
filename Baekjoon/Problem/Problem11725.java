package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * packageName    : baekjoon
 * fileName       : Problem11725
 * author         : Hansu
 * date           : 2023-06-29
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-29        shn81       최초 생성
 */
public class Problem11725 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < n - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken()) - 1;
            int n2 = Integer.parseInt(st.nextToken()) - 1;
            list.get(n1).add(n2);
            list.get(n2).add(n1);
        }

        boolean[] visited = new boolean[n];
        int[] parentNode = new int[n];

        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        visited[0] = true;
        while (!queue.isEmpty()) {
            int num = queue.poll();
            for (int node : list.get(num)) {
                if (!visited[node]) {
                    visited[node] = true;
                    queue.offer(node);
                    parentNode[node] = num;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < n; i++) {
            sb.append(parentNode[i] + 1).append("\n");
        }
        System.out.println(sb.toString());
    }
}
