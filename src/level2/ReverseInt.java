package level2;

import java.util.ArrayList;
import java.util.List;

public class ReverseInt {
	public int reverseInt(int n){
		String[] nIntoStr = String.valueOf(n).split("");
		List<Integer> list = new ArrayList<Integer>();
		
		int nowVal = 0;
		boolean foundMyPlace = false;
		
		for(String s : nIntoStr){
			nowVal = Integer.parseInt(s);
			if(list.isEmpty()){
				list.add(nowVal);
			}else{
				foundMyPlace = false;
				for(int i = 0; i < list.size(); i++){
					if(nowVal > list.get(i)){
						list.add(i, nowVal);
						foundMyPlace = true;
						break;
					}
				}
				if(!foundMyPlace)
					list.add(nowVal);
			}
		}
		
		int result = 0;
		for(int i = 0; i < list.size(); i++){
			result += list.get(i) * (Math.pow(10, (list.size() - i - 1)));
		}
		
		return result;
	}
  
	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void  main(String[] args){
		ReverseInt ri = new ReverseInt();
		System.out.println(ri.reverseInt(287019));
	}
}