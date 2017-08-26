package level1;

public class GetMinMaxString {
    public String getMinMaxString(String str) {
    	StringBuilder result = new StringBuilder();
    	
    	String[] splitStr = str.split(" ");
    	
    	int max = 0;
    	int min = 0;
    	int index = 0;
    	int valNow = 0;
    	
    	for(String s : splitStr){
    		valNow = Integer.parseInt(s);
    		
    		if(index == 0){
    			max = min = valNow;
    		}else{
    			if(valNow < min)
    				min = valNow;
    			else if(valNow > max)
    				max = valNow;
    		}
    		index++;
    	}
    	
    	result.append(min);
    	result.append(" ");
    	result.append(max);
    	
        return result.toString();
    }
    /* "효보아빠"님 풀이
    public String getMinMaxString(String str) {
        String[] tmp = str.split(" ");
        int min, max, n;
        min = max = Integer.parseInt(tmp[0]);
        for (int i = 1; i < tmp.length; i++) {
                n = Integer.parseInt(tmp[i]);
            if(min > n) min = n;
            if(max < n) max = n;
        }

        return min + " " + max;

    }
    */
    public static void main(String[] args) {
        String str = "-4 -2 -3 -1 0 -10";
        GetMinMaxString minMax = new GetMinMaxString();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println("최대값과 최소값은?" + minMax.getMinMaxString(str));
    }
}