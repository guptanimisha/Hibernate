package deutsche;


public class PrimeNumberTest {

	public static void main(String[] args) {

		int inputNumber = 4;

		boolean isPrime = false;
		
		for(int i = 2; i < inputNumber; i++){
			if(i != inputNumber){
				if(inputNumber%i != 0){
					isPrime = true;
					continue;
				}
				else{
					System.out.println("Number is not prime");
					break;
				}
			}
		}

		if(isPrime){
			System.out.println("Number is prime");
		}
	}
}
