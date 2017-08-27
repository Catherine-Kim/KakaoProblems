package level1;

class SumDivisor {
	public int sumDivisor(int num) {
		int answer = 0;
		int sum = 0;
		
		for(int i = 2; i <= num; i++){
			if(num%i == 0){
				sum += i;
			}
		}
		
		answer = sum + 1;
		
		return answer;
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		SumDivisor c = new SumDivisor();
		System.out.println(c.sumDivisor(12));
	}
}
