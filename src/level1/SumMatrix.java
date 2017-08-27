package level1;

class SumMatrix {
	int[][] sumMatrix(int[][] A, int[][] B) {	
		int sizeOfRow = A.length;
		int sizeOfColumn = A[0].length;		
		
		int[][] answer = A;
		
		for(int i = 0; i < sizeOfRow; i++){
			for(int j = 0; j < sizeOfColumn; j++){
				answer[i][j] += B[i][j];
			}
		}
		
		return answer;
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		SumMatrix c = new SumMatrix();
		int[][] A = { { 1, 2, 3 }, { 2, 3, 10 }, { 2, 3, 10 } };
		int[][] B = { { 3, 4, 0 }, { 5, 6, 2 }, { 2, 3, 10 } };
		int[][] answer = c.sumMatrix(A, B);
		
		System.out.print("\n\nmain----------------------\n(");
		for(int i = 0; i < answer[0].length; i++){
			System.out.print("(");
			for(int j = 0; j < answer[0].length; j++){
				System.out.print(answer[i][j] + ", ");
			}
			System.out.print(")");
		}
		System.out.print(")");
	}
}
