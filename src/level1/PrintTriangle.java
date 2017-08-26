package level1;

public class PrintTriangle {
	public String printTriangle(int num){
		StringBuffer stars = new StringBuffer();
		
		for(int i = 1; i <= num; i++){
			for(int j = 0; j < i; j++){
				stars.append("*");
			}
			stars.append("\n");
		}
		
		return stars.toString();		
	}
	
	/* "정찬형"님 풀이
	 public String printTriangle(int num){
	    String result = "";
	        String stars = "*";
	        for(int i=0; i<num; ++i){
	            result += stars+"\n";
	            stars += "*";
	        }
	        return result;
	    }
	 */

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		PrintTriangle pt = new PrintTriangle();
		System.out.println( pt.printTriangle(3) );
	}
}