import java.util.Scanner;

public class primeNumber {
	static boolean isPrime(int num) {
		for(int i=2;i<=num/2;i++) {
			if(num%i == 0){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if(isPrime(num)) {
			System.out.println("Prime");
		}else {
			System.out.println("Not");
		}
	}

}
