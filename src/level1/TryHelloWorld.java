package level1;

import java.util.Arrays;

class TryHelloWorld {
    public int[] gcdlcm(int a, int b) {
        int[] answer = new int[2];
        
        int gcd, lcm;
        int tmpA = a;
        int tmpB = b;
        int ret = -1;
        
        while(ret != 0){
        	if(a > b)       		
        		ret = a = a%b;
        	else        		
        		ret = b = b%a;
        }
        
        gcd = a > b ? a : b;
        lcm = tmpA * tmpB / gcd;

        answer[0] = gcd;
        answer[1] = lcm;
        
        return answer;
    }
    
    
    /* 이홍원 님 풀이
    public int[] gcdlcm(int a, int b) {
        int[] answer = new int[2];

          answer[0] = gcd(a,b);
        answer[1] = (a*b)/answer[0];
        return answer;
    }
    
    public static int gcd(int p, int q) {
     if (q == 0) return p;
     return gcd(q, p%q);
    }
	*/
    
    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        TryHelloWorld c = new TryHelloWorld();
        System.out.println(Arrays.toString(c.gcdlcm(3, 12)));
        System.out.println(Arrays.toString(c.gcdlcm(39, 7)));
        System.out.println(Arrays.toString(c.gcdlcm(40, 32)));
    }
}
