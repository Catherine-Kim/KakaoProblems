package level1;

class StringExercise{
    String getMiddle(String word){
    	int len = word.length();
    	return len%2 == 0?word.substring(len/2 - 1).substring(0, 2):word.substring(len/2).substring(0, 1);    
    }
    
    /* 강예은 님 풀이
    String getMiddle(String word){
        int length = word.length();
        int index = length / 2;
          return (length%2==0) ? word.substring(index-1, index+1) : word.substring(index, index+1); 
      }
    */
    
    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void  main(String[] args){
        StringExercise se = new StringExercise();
        System.out.println(se.getMiddle("power"));
        System.out.println(se.getMiddle("test"));
        System.out.println(se.getMiddle("elementary"));
    }
}