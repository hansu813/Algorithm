package src.알고리즘.연습문제;

/**
 * packageName    : src.알고리즘.연습문제
 * fileName       : Practice02
 * author         : Hansu
 * date           : 2023-07-02
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-07-02        shn81       최초 생성
 * 회전 초밥 집에서 가을 맞이 이벤트를 진행한다.
 * 보통 회전 초밥 집에서는 회전 벨트 위에서 먹고 싶은 접시를 선택하여 먹지만
 * 이번 이벤트 내용은, 손님이 처음 선택한 접시 위치부터 연속해서 n 개의 접시를 골라
 * 식사를 하면 할인을 해주는 이벤트이다.
 * 이때, 추가로 쿠폰이 제공되는데 쿠폰에 적혀있는 번호의 초밥을 즉석에서 만들어 제공한다.
 * 이벤트에 참가하는 손님의 입장에서 가장 많은 종류의 초밥을 먹을 수 있는
 * 최대 값을 구하는 프로그램을 작성하라.
 */
public class Practice02 {
    public static int solution(int n, int[] plates, int type, int coupon) {
        int[] selected = new int[type + 1];
        int cnt = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            if (selected[plates[i]] == 0) {
                cnt++;
            }
            selected[plates[i]]++;
        }
        max = cnt;

        for (int i = 1; i < plates.length; i++) {

            if (max <= cnt) {
                if (selected[coupon] == 0) {
                    max = cnt + 1;
                } else {
                    max = cnt;
                }
            }

            int p1 = i - 1;
            int p2 = (i + n - 1) % plates.length;

            selected[plates[p1]]--;
            if (selected[plates[p1]] == 0) {
                cnt--;
            }

            if (selected[plates[p2]] == 0) {
                cnt++;
            }
            selected[plates[p2]]++;

        }
        return max;
    }

    public static void main(String[] args) {
        int n = 4;
        int[] plates = {7, 9, 7, 30, 2, 7, 9, 25};
        int type = 30;
        int coupon = 30;
        System.out.println(solution(4, plates, type, coupon));

    }
}
