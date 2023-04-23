package java_basic;
import java.io.IOException;
/**
 * 백준 10798번
 * 주어진 단어를 새로 읽기로 변환하여 출력
 * @author 김한수
 */
import java.util.Scanner;

public class ARRAY2_03 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		char[][] cWord = new char[5][15];
		int max = 0;	// 입력받는 문자열 중 가장 긴 문자열의 길이

		for(int i=0; i<5; i++) {
			String str = scan.next();
			max = Math.max(max, str.length());	// 가장 긴 문자열 체크
			for(int j=0; j<str.length(); j++)
				cWord[i][j] = str.charAt(j);
		}

		for(int i=0; i<max; i++) {
			for(int j=0; j<5; j++) {
				if(cWord[j][i] == '\0')	// char 배열의 초깃값 = '\0'
					continue;
				System.out.print(cWord[j][i]);
			}
		}
		scan.close();
	}
}
