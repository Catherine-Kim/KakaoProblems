package level2;

public class HarshadNumber{
	public boolean isHarshad(int num){
		int sum = 0;
		
		String str = String.valueOf(num);
		for(int i = 0; i < str.length(); i++)
			sum += Integer.parseInt(Character.toString(str.charAt(i)));
		
		return num%sum == 0;
	}
	
	
	/* ixymori 님 풀이
	public boolean isHarshad(int num){
        char[] charArr = String.valueOf(num).toCharArray();
    int divisor = 0;

    for (char c : charArr) {
        divisor += (int) c - 48;
    }
    */
	
	/* 또롱 님 풀이
	public boolean isHarshad(int num) {
		int sum = 0, n = num;
		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}
		if (num % sum == 0)
			return true;
		else
			return false;
	}
	*/
	
	/* 덱스또 님 풀이
	public boolean isHarshad(int num){
        sum = 0;
        Integer.toString(num).chars().forEach(c -> sum += c - '0');
        return num % sum == 0;
    }
	*/
  
       // 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void  main(String[] args){
		HarshadNumber sn = new HarshadNumber();
		System.out.println(sn.isHarshad(33));
	}
}