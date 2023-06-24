package src.알고리즘.이진탐색;

/**
 * packageName    : src.알고리즘.이진탐색
 * fileName       : Main
 * author         : Hansu
 * date           : 2023-06-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-24        shn81       최초 생성
 */
public class Main {
    // 반복문 구조
    static int binarySearch(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    static int binarySearch2(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;

        if (target == arr[mid]) {
            return mid;
        } else if (target < arr[mid]) {
            return binarySearch2(arr, target, left, mid - 1);
        } else {
            return binarySearch2(arr, target, mid + 1, right);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 10, 20, 30, 40, 50, 60};
        System.out.println("Loop Index : " + binarySearch(arr, 30));
        System.out.println();
        System.out.println("Recursive Index : " + binarySearch2(arr, 30, 0, arr.length - 1));
    }
}
