package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * packageName    : baekjoon
 * fileName       : Problem25556
 * author         : Hansu
 * date           : 2023-06-13
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-13        shn81       최초 생성
 */
public class Problem25556 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Stack<Integer>[] stack = new Stack[4];
        for(int i = 0 ; i < 4; i++) {
            stack[i] = new Stack<Integer>();
            stack[i].push(0);
        }
        boolean checkFlag = true;
        for(int num : arr) {
            boolean check = false;
            for(int i = 0; i < 4; i++) {
                if(num > stack[i].peek()) {
                    stack[i].push(num);
                    check = true;
                    break;
                }
            }
            if(!check) {
                checkFlag = false;
                break;
            }
        }
        System.out.println(checkFlag ? "YES" : "NO");
    }
}
