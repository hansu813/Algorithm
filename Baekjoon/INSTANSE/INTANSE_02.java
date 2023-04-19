package java_basic;
/**
 * 백준 2444번
 * 첫째 줄부터 2*N-1번째 줄까지 차례대로 별을 출력하시오.
 * @author 김한수
 */
import java.util.Scanner;

public class INTANSE_02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			for(int j = n - 1; j > i; j--) {
				sb.append(" ");
			}
			for(int j = -1; j < i; j++) {
				sb.append("*");
			}
			for(int j = 0; j < i; j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		for(int i = 0; i < n-1; i++) {
			for(int j = -1; j < i; j++) {
				sb.append(" ");
			}
			for(int j = n - 1; j > i; j--) {
				sb.append("*");
			}
			for(int j = n - 2; j > i; j--) {
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
