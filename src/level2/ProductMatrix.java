package level2;

class ProductMatrix {
	public int[][] productMatrix(int[][] A, int[][] B) {
		int answerRowSize = A.length;
		int answerColumnSize = B[0].length;
		int middleSize = A[0].length;
		int sum = 0;
		int[][] answer = new int[answerRowSize][answerColumnSize];

		for(int ar = 0; ar < answerRowSize; ar++){
			for(int ac = 0; ac < answerColumnSize; ac++){
				sum = 0;
				for(int ms = 0; ms < middleSize; ms++){
					//System.out.println("GOT IN THE DEEPEST FOR");
					sum += A[ar][ms] * B[ms][ac];
					//System.out.println(A[ar][ms] + " * " + B[ms][ac] + " = " + A[ar][ms] * B[ms][ac]);
					//System.out.println("sum : " + sum);
				}
				answer[ar][ac] = sum;
			}
		}
		
		return answer;
	}
	
	/* JBK 님 풀이
	public int[][] productMatrix(int[][] A, int[][] B) {
        int[][] answer = new int[A.length][B[0].length];
        if(A[0].length == B.length){
            for (int i = 0; i < answer.length; i++) {
                for (int j = 0; j < answer[0].length; j++) {
                    for (int k = 0; k < A[0].length; k++) {
                        answer[i][j]+=A[i][k]*B[k][j];
                    }
                }

            }
        }
        return answer;
    }
	*/
	
	public static void main(String[] args) {
		ProductMatrix c = new ProductMatrix();
		int[][] a = { { 1, 2 }, { 2, 3 } };
		int[][] b = { { 3, 4 }, { 5, 6 } };
		
		// 아래는 테스트로 출력해 보기 위한 코드입니다.
	    int[][] ret = c.productMatrix(a, b);
	    
	    System.out.println("(");
	    for(int i = 0; i < ret.length; i++){
	    	System.out.print("(");
	    	for(int j = 0; j < ret.length; j++){
	    		System.out.print(ret[i][j]);
	    		System.out.print(", ");
	    	}
	    	System.out.println("), ");
	    }
	    System.out.println(")");
	}
}
