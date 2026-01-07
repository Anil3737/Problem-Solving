import java.util.Scanner;

public class Factorial {
	static void factorial(int num) {
		int fact = 1;
		for(int i=1;i<=num;i++) {
			fact *= i;
		}
		System.out.println(fact);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		factorial(num);

	}

}
