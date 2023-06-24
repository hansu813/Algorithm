package src.알고리즘.정렬;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * packageName    : src.알고리즘.정렬
 * fileName       : Practice02
 * author         : Hansu
 * date           : 2023-06-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-24        shn81       최초 생성
 *
 * 연습문제 2)
 * 문자열 배열 strings 가 주어졌을 때 anagram 으로 묶어서 출력하는 프로그램 작성
 * anagram 은 철자 순서를 바꾸면 같아지는 문자를 의미한다.
 */
public class Practice02 {
    static ArrayList<ArrayList<String>> solution(String[] strings) {
        if(strings == null || strings.length == 0) {
            return new ArrayList<>();
        }

        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for(String item : strings) {
            char[] cArr = item.toCharArray();
            sort(cArr);
            String key = String.valueOf(cArr);
            if(!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(item);
        }
        return new ArrayList<>(map.values());
    }

    public static void sort(char[] arr) {
        for(int i = 1; i < arr.length; i++) {
            for(int j = i; j > 0; j--) {
                if(arr[j] < arr[j - 1]) {
                    char tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Test code
        String[] strings = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(solution(strings));
    }
}
