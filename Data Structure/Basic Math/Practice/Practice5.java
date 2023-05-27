package mathBasic;

/**
 * 영토에 대한 지도 정보 row x col grid 맵 형태
 * 이때 grid[i][j] == 1 이면 땅
 * 이때 grid[i][j] == 0 이면 물
 * 땅의 둘레를 구하라.
 * @author 김한수
 *
 */
public class Practice5 {
	
	public static int solution(int[][] arr) {
		int round = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] == 1) {
					round += 4;
					if(i > 0 && arr[i - 1][j] == 1) {
						round-= 2;
					}
					if(j > 0 && arr[i][j - 1] == 1) {
						round-= 2;
					}
				}
			}
		}
		return round;
	}
	
	public static int solution2(int[][] grid) {
		int[][] direction = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
		
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[i].length; j++) {
				if(grid[i][j] == 1) {
					return recursion(grid, direction, i, j);
				}
			}
		}
		return 0;
	}
	
	public static int recursion(int[][] grid, int[][] direction, int i, int j) {
		int row = grid.length;
		int col = grid[0].length;
		
		grid[i][j] = -1;
		int cnt = 0;
		for(int[] d : direction) {
			int x = i + d[0];
			int y = j + d[1];
			if(x < 0 || y < 0 || x >= row || y >= col || grid[x][y] == 0) {
				cnt++;
			} else {
				if(grid[x][y] == 1) {
					cnt += recursion(grid, direction, x, y);
				}
			}
		}
		
		return cnt;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(new int[][] {{1}}));
		System.out.println(solution(new int[][] {{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}}));

		System.out.println(solution2(new int[][] {{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}}));
	}
}
