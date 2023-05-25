package mathBasic;

public class Square {
	
	static double pow(int a, double b) {
		double result = 1;
		boolean isMinus = false;
		
		if(b == 0) {
			return 1;
		} else if(b < 0) {
			b *= -1;
			isMinus = true;
		}
		
		for(int i = 0; i < b; i++) {
			result *= a;
		}
		
		return isMinus ? 1 / result : result;
	}
	
	static double sqlt(int a) {
		double result = 1;
		
		for(int i = 0; i < 10; i++) {
			result = (result + a / result) / 2;
		}
		
		return result;
	}
	public static void main(String[] args) {
		
//		1. 제곱, 제곱근, 지수
		System.out.println("=== 제곱 ===");
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.pow(2, -3));
		System.out.println(Math.pow(-2, -3));
		
		System.out.println(Math.pow(2, 30));
		System.out.printf("%.0f\n", Math.pow(2, 30));
		
		System.out.println("=== 제곱근 ===");
		System.out.println(Math.sqrt(16));
		System.out.println(Math.pow(16, 1.0/2));
		
//		참고 ) 절대 값
		System.out.println("=== 절대 값 ===");
		System.out.println(Math.abs(5));
		
//		2. 로그
		System.out.println(Math.E);
		System.out.println(Math.log(2.718281828459045));
		System.out.println(Math.log(1000));
		
		
//		Test Code
		System.out.println("=== My Pow ===");
		System.out.println(pow(2, 3));
		
		System.out.println("=== My sqrt ===");
		System.out.println(sqlt(16));
	}

}
