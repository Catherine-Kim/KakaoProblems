package level1;

import java.util.Arrays;

class Divisible {
	public int[] divisible(int[] array, int divisor) {
		//ret에 array에 포함된 정수중, divisor로 나누어 떨어지는 숫자를 순서대로 넣으세요.
		int[] temp = new int[array.length];
		
		int i = 0;
		for(int d : array){
			if(d%divisor == 0){
				temp[i] = d;
				++i;
			}
		}
		
		int[] ret = new int[i];
		System.arraycopy(temp, 0, ret, 0, ret.length);
			
		return ret;
	}
	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		Divisible div = new Divisible();
		int[] array = {5, 9, 7, 10};
		System.out.println( Arrays.toString( div.divisible(array, 5) ));
	}
}