package src.알고리즘.분할정복;

/**
 * packageName    : src.알고리즘.분할정복
 * fileName       : Main
 * author         : Hansu
 * date           : 2023-06-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-27        shn81       최초 생성
 */
public class Main {
    public static int getMax(int[] arr, int left, int right) {
        int m = (left + right) / 2;
        if (left == right) {
            return arr[left];
        }

        left = getMax(arr, left, m);
        right = getMax(arr, m + 1, right);
        return (left > right) ? left : right;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 10, 50, 25, 30, 1, 15};
        System.out.println(getMax(arr, 0, arr.length - 1));
    }
}
