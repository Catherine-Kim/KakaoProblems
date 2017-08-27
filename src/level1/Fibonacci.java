package level1;

class Fibonacci {	
	public long fibonacci(int num) {
		/*if(num == 0)
			return 0;
		else if(num == 1)
			return 1;
		else
			return fibonacci(num-2) + fibonacci(num - 1);
		
		이 코드는 실행시간이 너무 오래 걸려서 에러뜸
		*/
		
		// 피보나치 수열의 일반항
		return (long) ((Math.pow(((1 + Math.sqrt(5))/2), num) - Math.pow(((1 - Math.sqrt(5))/2), num))/ Math.sqrt(5));
	}

  // 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		Fibonacci c = new Fibonacci();
		int testCase = 10;
		System.out.println(c.fibonacci(testCase));
	}
}
