package java_basic;

import java.util.Scanner;

/**
 * 백준 2753번
 * 첫째 줄에 윤년이면 1, 아니면 0을 출력한다.
 * @author 김한수
 *
 */
public class IF_03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		in.close();
		int d;
		if(year % 4 == 0) {
			d = 1;
			if(year % 100 == 0) {
				d = 0;
				if(year % 400 == 0) {
					d = 1;
				}
			}
		} else {
			d = 0;
		}
		System.out.println(d);
	}
}
