import java.util.Scanner;

public class NumberOfDigits {
	static void digits(int num) {
		int n = String.valueOf(num).length();
		int a=0;
		while(num>0) {
			num /= 10;
			a++;
		}
		
		System.out.println(n);
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		digits(number);
		

	}

}
