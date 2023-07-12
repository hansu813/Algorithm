package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : baekjoon
 * fileName       : Problem1439
 * author         : Hansu
 * date           : 2023-07-12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-07-12        shn81       최초 생성
 */
public class Problem1439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        StringTokenizer oneToken = new StringTokenizer(s, "1");
        StringTokenizer zeroToken = new StringTokenizer(s, "0");

        System.out.println(Math.min(oneToken.countTokens(), zeroToken.countTokens()));
    }
}
