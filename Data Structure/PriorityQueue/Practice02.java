package src.비선형자료구조.우선순위큐;

import java.util.PriorityQueue;

/**
 * packageName    : src.비선형자료구조.우선순위큐
 * fileName       : Practice02
 * author         : Hansu
 * date           : 2023-06-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-21        shn81       최초 생성
 * 문자열 사전식 오름차순
 */
class Person2 {
    String name;
    int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Practice02 {
    public static void solution(String[] names, int[] ages) {
        PriorityQueue<Person2> pq = new PriorityQueue<>((Person2 p1, Person2 p2) -> p1.name.compareTo(p2.name));
        for(int i = 0; i < names.length; i++) {
            pq.offer(new Person2(names[i], ages[i]));
        }

        while(!pq.isEmpty()) {
            Person2 p = pq.poll();
            System.out.println(p.name + " " + p.age);
        }
    }

    public static void main(String[] args) {
        String[] name = {"A", "C", "D", "B", "E"};
        int[] age = {10, 20, 30, 40, 50};
        solution(name, age);
    }
}
