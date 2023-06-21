package src.비선형자료구조.우선순위큐;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * packageName    : src.비선형자료구조.우선순위큐
 * fileName       : Practice01
 * author         : Hansu
 * date           : 2023-06-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-21        shn81       최초 생성
 * 자바 기본 PriorityQueue 응용
 * 나이 순으로 오름차 순 또는 내림차 순 출력
 */
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public int compareTo(Person o) {
//        // 1이 리턴 되면 변경을 안하고 -1이면 변경
//        // 새롭게 추가하는 데이터가 더 적을 때 변경( 적은 값이 위로, 오름차순 )
//        return this.age >= o.age ? 1 : -1;
//
//        // 내림차순
////        return this.age >= o.age -1 : 1;
//    }
}

public class Practice01 {
//    static void solution(String[] name, int[] age) {
//        PriorityQueue<Person> pq = new PriorityQueue<>();
//
//        for (int i = 0; i < name.length; i++) {
//            pq.offer(new Person(name[i], age[i]));
//        }
//
//        System.out.println("== 실제 출력 순서 ==");
//        while(!pq.isEmpty()) {
//            Person p = pq.poll();
//            System.out.println(p.name + " " + p.age);
//        }
//    }

    public static void main(String[] args) {
        String[] name = {"A", "B", "C", "D", "E"};
        int[] age = {30, 20, 45, 62, 35};
//        solution(name, age);

        PriorityQueue<Person> pq2 = new PriorityQueue<>
                ((Person p1, Person p2) -> p1.age >= p2.age ? 1 : -1);
        for(int i = 0; i < name.length; i++) {
            pq2.offer(new Person(name[i], age[i]));
        }
        while(!pq2.isEmpty()) {
            Person p = pq2.poll();
            System.out.println(p.name + " " + p.age);
        }
    }
}
