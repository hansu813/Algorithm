package data_structure.해시테이블;

/**
 * packageName    : data_structure.해시테이블
 * fileName       : MyHashTable02
 * author         : Hansu
 * date           : 2023-06-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-06        shn81       최초 생성
 */
class MyHashTable1 {
    Integer[] table;
    int elemCnt;

    MyHashTable1() {}
    MyHashTable1(int size) {
        this.table = new Integer[size];
        this.elemCnt = 0;
    }

    public int getHash(int key) {
        return key % this.table.length;
    }

    public void setValue(int key, int data) {
        int idx = this.getHash(key);
        this.table[idx] = data;
        this.elemCnt++;
    }

    public int getValue(int key) {
        int idx = this.getHash(key);
        return this.table[idx];
    }

    public void removeValue(int key) {
        int idx = this.getHash(key);
        this.table[key] = null;
        this.elemCnt--;
    }

    public void printHashTable() {
        System.out.println("<< Hash Table >>");
        for(int i = 0; i < this.table.length; i++) {
            System.out.println(i + " : " + this.table[i]);
        }
    }
}

public class MyHashTable02 {
    public static void main(String[] args) {
//        Test Code
        MyHashTable1 ht = new MyHashTable1(7);
        ht.setValue(1, 1);
        ht.setValue(2, 2);
        ht.setValue(3, 3);
        ht.setValue(4, 4);
        ht.setValue(5, 5);
        ht.printHashTable();
        ht.setValue(8, 6);
        ht.printHashTable();
    }
}
