package src.알고리즘.그리디알고리즘;

import java.util.ArrayList;
import java.util.Collections;

/**
 * packageName    : src.알고리즘.그리디알고리즘
 * fileName       : Main
 * author         : Hansu
 * date           : 2023-06-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-27        shn81       최초 생성
 */
class Activity {
    String name;
    int start;
    int end;

    public Activity(String name, int start, int end) {
        this.name = name;
        this.start = start;
        this.end = end;
    }
}

public class Main {
    public static void selectActivity(ArrayList<Activity> list) {
        Collections.sort(list, (x1, x2) -> x1.end - x2.end);
        int curTime = 0;
        ArrayList<Activity> result = new ArrayList<>();
        for(Activity item : list) {
            if(curTime <= item.start) {
                curTime = item.end;
                result.add(item);
            }
        }

        for (Activity item : result) {
            System.out.print(item.name + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Activity> list = new ArrayList<>();
        list.add(new Activity("A", 1, 5));
        list.add(new Activity("B", 4, 5));
        list.add(new Activity("C", 2, 3));
        list.add(new Activity("D", 4, 7));
        list.add(new Activity("E", 6, 10));
        selectActivity(list);
    }
}

