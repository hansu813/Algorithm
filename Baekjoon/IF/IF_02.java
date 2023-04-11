package java_basic;

import java.util.Scanner;

/**
 * 백준 9498번
 * 시험 점수를 입력 받아 90~100점은 A, 80~89점은 B,
 * 70~79점는 C, 60~69점은 D, 나머지는 F를 출력하는 프로그램을 작성하시오.
 * @author 김한수
 */
public class IF_02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int score = in.nextInt();
		in.close();
		if(score > 89) {
			System.out.println('A');
		} else if(score > 79) {
			System.out.println('B');
		} else if(score > 69) {
			System.out.println('C');
		} else if(score > 59) {
			System.out.println('D');
		} else {
			System.out.println('F');
		}
	}
}
