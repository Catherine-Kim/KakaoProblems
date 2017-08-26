package level1;

public class WaterMelon {
	public String watermelon(int n){
		StringBuilder str = new StringBuilder();
		
		for(int i = 0; i < n/2; i++)
			str.append("수박");
		
		if(n%2 == 1)
			str.append("수");
		
		return str.toString();
	}
	/* "이재석"님 풀이
	public String watermelon(int n){
        return new String(new char [n/2+1]).replace("\0", "수박").substring(0,n);
    }	
	 */

	// 실행을 위한 테스트코드입니다.
	public static void  main(String[] args){
		WaterMelon wm = new WaterMelon();
		System.out.println("n이 3인 경우: " + wm.watermelon(5));
		System.out.println("n이 4인 경우: " + wm.watermelon(4));
	}
}