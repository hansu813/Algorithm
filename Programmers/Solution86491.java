package programers;

/**
 * packageName    : programers
 * fileName       : Solution86491
 * author         : Hansu
 * date           : 2023-06-09
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-09        shn81       최초 생성
 * 최소 직사각형
 */
public class Solution86491 {
    public static int solution(int[][] sizes) {
        int longMax = 1;
        int shortMax = 1;
        for(int i = 0; i < sizes.length; i++) {
            int longLength = Math.max(sizes[i][0], sizes[i][1]);
            int shortLength = Math.min(sizes[i][0], sizes[i][1]);
            if(longLength > longMax) {
                longMax = longLength;
            }
            if(shortLength > shortMax) {
                shortMax = shortLength;
            }
        }
        return longMax * shortMax;
    }

    public static void main(String[] args) {
        int[][] arr = {{60, 50}, {30,70}, {60,30}, {80,40}};
        System.out.println(solution(arr));
    }
}
