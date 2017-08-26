package level1;

public class FindKim {
	public String findKim(String[] seoul){
		//x에 김서방의 위치를 저장하세요.
		int x = 0;
		
		for(String s : seoul){
			if(s.equals("Kim"))
				break;
			x++;
		}
		
		return "김서방은 "+ x + "에 있다";
	}
	
	/* "keira"님 풀이
	public String findKim(String[] seoul){
        //x에 김서방의 위치를 저장하세요.
        int x = Arrays.asList(seoul).indexOf("Kim");

        return "김서방은 "+ x + "에 있다";
    }
	*/
	
	// 실행을 위한 테스트코드입니다.
	public static void main(String[] args) {
		FindKim kim = new FindKim();
		String[] names = {"Queen", "Tod","Kim"};
		System.out.println(kim.findKim(names));
	}
}

