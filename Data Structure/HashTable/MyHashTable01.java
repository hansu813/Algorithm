package data_structure.해시테이블;

import java.util.Hashtable;
import java.util.Map;

/**
 * packageName    : data_structure.해시테이블
 * fileName       : MyHashTable
 * author         : Hansu
 * date           : 2023-06-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-06        shn81       최초 생성
 */
public class MyHashTable01 {
//    해시 함수
    public static int getHash(int key) {
        return key % 5;
    }

    public static void main(String[] args) {
        Hashtable<String, Integer> ht = new Hashtable<>();
        ht.put("Key1", 10);
        ht.put("Key2", 20);
        ht.put("Key3", 30);
        ht.put("Key3", 50);

        for(Map.Entry<String, Integer> item : ht.entrySet()) {
            System.out.println(item.getKey() + " - " + item.getValue());
        }

//      해시 충돌 케이스 ( 해시 함수 사용 )
        Hashtable<Integer, Integer> ht2 = new Hashtable<>();
        ht2.put(getHash(1), 10);
        ht2.put(getHash(2), 20);
        ht2.put(getHash(3), 30);
        ht2.put(getHash(4), 40);
        ht2.put(getHash(5), 50);
        System.out.println("<< 충돌 전 >>");
        for(Map.Entry<Integer, Integer> item : ht2.entrySet()) {
            System.out.println(item.getKey() + " - " + item.getValue());
        }


        System.out.println("<< 충돌 후 >>");
        ht2.put(getHash(6), 60);
        for(Map.Entry<Integer, Integer> item : ht2.entrySet()) {
            System.out.println(item.getKey() + " - " + item.getValue());
        }

    }
}
