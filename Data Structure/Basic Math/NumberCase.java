package mathBasic;
/**
 * 경우의 수
 * @author 김한수
 *
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;


public class NumberCase {
//	약수
	public ArrayList getDivisor(int num) {
		ArrayList result = new ArrayList();
		for(int i = 1; i <= (int)num/2; i++) {
			if(num % i == 0) {
				result.add(i);
			}
		}
		return result;
	}
	
//	최대공약수
	public int getGCD(int numA, int numB) {
		int gcd = -1;
		
		ArrayList divisorA = this.getDivisor(numA);
		ArrayList divisorB = this.getDivisor(numB);
		
		for(int itemA : (ArrayList<Integer>) divisorA) {
			for(int itemB : (ArrayList<Integer>) divisorB) {
				if(itemA == itemB) {
					if(itemA > gcd) {
						gcd = itemA;
					}
				}
			}
		}
		return gcd;
	}
	
//	최소공배수
	public int getLCM(int numA, int numB) {
		int lcm = -1;
		int gcd = this.getGCD(numA, numB);
		if(gcd != -1) {
			lcm = numA * numB / gcd;
		}
		return lcm;
	}

	public static void main(String[] args) {
//		합의 법칙
		System.out.println("=== 합의 법칙 ===");
		
		int[] dice1 = {1, 2, 3, 4, 5, 6};
		int[] dice2 = {1, 2, 3, 4, 5, 6};
		
		int nA = 0;
		int nB = 0;
		int nAandB = 0;
		
//		기본 풀이
		for(int item1 : dice1) {
			for(int item2 : dice2) {
				if((item1 + item2) % 3 == 0) {
					nA += 1;
				}
				if((item1 + item2) % 4 == 0) {
					nB += 1;
				}
				if((item1 + item2) % 12 == 0) {
					nAandB += 1;
				}
			}
		}
		System.out.println("결과 : " + (nA + nB - nAandB));
		
//		HashSet 이용
		HashSet<ArrayList<Integer>> allCase = new HashSet<>();
		for(int item1 : dice1) {
			for(int item2 : dice2) {
				if((item1 + item2) % 3 == 0 || (item1 + item2) % 4 == 0) {
					ArrayList list = new ArrayList(Arrays.asList(item1, item2));
					allCase.add(list);
				}
			}
		}
		System.out.println("결과 : " + allCase.size());

		
//		곱의 법칙
		System.out.println("=== 곱의 법칙 ===");
		nA = 0;
		nB = 0;
		for(int item1 : dice1) {
			if(item1 % 3 == 0) {
				nA++;
			}
		}
		for(int item2 : dice2) {
			if(item2 % 4 == 0) {
				nB++;
			}
		}
		System.out.println("결과 : " + (nA * nB));
		
//		Test Code
		int number1 = 10;
		int number2 = 6;
		
		NumberCase nc = new NumberCase();
		ArrayList l1 = nc.getDivisor(number1);
		ArrayList l2 = nc.getDivisor(number2);
		System.out.println("l1 : " + l1);
		System.out.println("l2 : " + l2);
	
		System.out.println("최대 공약수 = " + nc.getGCD(number1, number2));
		System.out.println("최소 공배수 = " + nc.getLCM(number1, number2));
	}
}
