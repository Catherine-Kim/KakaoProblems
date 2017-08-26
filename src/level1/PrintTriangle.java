package level1;

public class PrintTriangle {
	public String printTriangle(int num){
		StringBuffer stars = new StringBuffer();
		int sum = 0;
		
		for(int i = 1; i <= num; i++){
			for(int j = 0; j < i; j++){
				stars.append("*");
			}
			stars.append("\n");
		}
		
		return stars.toString();		
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		PrintTriangle pt = new PrintTriangle();
		System.out.println( pt.printTriangle(3) );
	}
}