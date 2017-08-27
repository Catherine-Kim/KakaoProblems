package level1;

import java.util.ArrayList;
import java.util.List;

public class ReverseStr {
	public String reverseStr(String str){
		/*List<Character> charArr = new ArrayList<Character>();
				
		char nowChar = ' ';
		int prevCharAscii = 0;
		int nowCharAscii = 0;
		boolean foundMyPlace = false;
		
		for(int strIndex = 0; strIndex < str.length(); strIndex++){
			nowChar = str.charAt(strIndex);
			foundMyPlace = false;
			
			if(charArr.isEmpty()){
				charArr.add(nowChar);
			}else{
				nowCharAscii = nowChar;
				for(int i = 0; i < charArr.size(); i++){
					prevCharAscii = charArr.get(i);
					
					if(nowCharAscii > prevCharAscii){
						charArr.add(i, nowChar);
						foundMyPlace = true;
						break;
					}
				}
				if(!foundMyPlace){
					charArr.add(nowChar);
				}
			}
		}
	
		return strArr.toString();*/
		
		StringBuffer resultSB = new StringBuffer();
		
		char charVal;
		boolean foundMyPlace;
		
		for(int i = 0; i < str.length(); i++){
			charVal = str.charAt(i);
			foundMyPlace = false;
			
			if(resultSB.length() == 0){
				resultSB.append(charVal);
			}else{
				for(int j = 0; j < resultSB.length(); j++){
					if((int)charVal > (int)(resultSB.charAt(j))){
						foundMyPlace = true;
						resultSB.insert(j, charVal);
						break;
					}
				}
				
				if(!foundMyPlace)
					resultSB.append(charVal);
			}
		}
		
		return resultSB.toString();
	}
	
	/* Sunjin Lee 님 풀이
	
	public String reverseStr(String str){
		char[] sol = str.toCharArray();
    	Arrays.sort(sol);
    	return new StringBuilder(new String(sol)).reverse().toString();
    }
	
	 */

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		ReverseStr rs = new ReverseStr();
		System.out.println( rs.reverseStr("Zbcdefg") );
	}
}