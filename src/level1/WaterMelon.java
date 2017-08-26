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

	// 실행을 위한 테스트코드입니다.
	public static void  main(String[] args){
		WaterMelon wm = new WaterMelon();
		System.out.println("n이 3인 경우: " + wm.watermelon(5));
		System.out.println("n이 4인 경우: " + wm.watermelon(4));
	}
}