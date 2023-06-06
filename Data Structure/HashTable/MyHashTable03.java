package data_structure.해시테이블;

/**
 * packageName    : data_structure.해시테이블
 * fileName       : HashTable03
 * author         : Hansu
 * date           : 2023-06-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-06        shn81       최초 생성
 * 해시 충돌 해결 - 개방 주소법( 선형 탐사법 )
 */
class MyHashTable2 extends MyHashTable1 {
    MyHashTable2(int size) {
        super(size);
    }

    public void setValue(int key, int data) {
        int idx = this.getHash(key);
        if(this.elemCnt == this.table.length) {
            System.out.println("Hash is full!");
            return;
        } else if(this.table[idx] == null) {
            int newIdx = idx;
            while(true) {
                newIdx = (newIdx + 1) % this.table.length;
                if(this.table[newIdx] == null) {
                    break;
                }
            }
            this.table[newIdx] = data;
        }
        elemCnt++;
    }
}

public class MyHashTable03 {
    public static void main(String[] args) {
//      Test Code
        MyHashTable2 ht = new MyHashTable2(5);
        ht.setValue(1, 1);
        ht.setValue(3, 3);
        ht.printHashTable();

        ht.setValue(1, 10);
        ht.printHashTable();

        ht.setValue(1, 20);
        ht.setValue(1, 30);
        ht.setValue(1, 40);
        ht.printHashTable();
    }
}
