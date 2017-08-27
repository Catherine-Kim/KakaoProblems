package level2;

class NumOfPrime {
	int numberOfPrime(int n) {
		int result = 0;
		boolean notPrime = false;
		
		if(n != 0 && n != 1){
			for(int i = 2; i <= n; i++){
				notPrime = false;
				for(int j = 2; j < i; j++){
					if(i%j == 0){
						notPrime = true;
						break;
					}
				}
				if(!notPrime)
					result++;
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		NumOfPrime prime = new NumOfPrime();
		System.out.println( prime.numberOfPrime(5) );
	}

}