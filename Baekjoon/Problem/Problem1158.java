package baekjoon;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * packageName    : baekjoon
 * fileName       : Problem1158
 * author         : Hansu
 * date           : 2023-06-16
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-16        shn81       최초 생성
 * 요세푸스 순열
 */
public class Problem1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();
        List<Integer> list = new LinkedList<>();
        for(int i = 1; i <= n; i++) {
            list.add(i);
        }
        sb.append("<");
        int idx = 0;
        while(list.size() > 1) {
            idx = (idx + k - 1) % list.size();
            sb.append(list.remove(idx)).append(", ");
        }
        sb.append(list.remove(0)).append(">");
        System.out.println(sb);
    }
}
