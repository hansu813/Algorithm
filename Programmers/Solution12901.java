package programers;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * packageName    : programers
 * fileName       : Solution12901
 * author         : Hansu
 * date           : 2023-06-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-10        shn81       최초 생성
 * 2016년
 */
public class Solution12901 {
    public static String solution(int a, int b) {
        Calendar cal = Calendar.getInstance();
        int mon = a - 1;
        cal.set(2016, mon, b);
        return cal.getTime().toString().toUpperCase().split(" ")[0];
    }

    public static void main(String[] args) {
        System.out.println(solution(5, 24));
    }
}
