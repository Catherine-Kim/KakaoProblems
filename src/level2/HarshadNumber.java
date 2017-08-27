package level2;

public class HarshadNumber{
	public boolean isHarshad(int num){
		int sum = 0;
		
		String str = String.valueOf(num);
		for(int i = 0; i < str.length(); i++)
			sum += Integer.parseInt(Character.toString(str.charAt(i)));
		
		return num%sum == 0;
	}
  
       // 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void  main(String[] args){
		HarshadNumber sn = new HarshadNumber();
		System.out.println(sn.isHarshad(33));
	}
}