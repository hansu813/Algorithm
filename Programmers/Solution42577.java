package programers;

import java.util.*;

/**
 * packageName    : programers
 * fileName       : Solution42577
 * author         : Hansu
 * date           : 2023-07-02
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-07-02        shn81       최초 생성
 * 전화번호 목록
 */
public class Solution42577 {
//    static boolean solution(String[] phone_book) { // 시간 초과 Case
//        boolean answer = true;
//        Arrays.sort(phone_book, (x, y) -> x.length() - y.length());
//        for (int i = 0; i < phone_book.length - 1; i++) {
//            for (int j = i + 1; j < phone_book.length; j++) {
//                if (phone_book[j].indexOf(phone_book[i]) == 0) {
//                    answer = false;
//                    break;
//                }
//            }
//        }
//        return answer;
//    }

    static boolean solution(String[] phone_book) {
        Set<String> set = new HashSet<>();
        for (String phone : phone_book) {
            set.add(phone);
        }
        for (String phone : phone_book) {
            for (int i = 1; i < phone.length(); i++) {
                if(set.contains(phone.substring(0, i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] phoneBook = {"119", "97674223", "1195524421" };
        System.out.println(solution(phoneBook));
    }
}
