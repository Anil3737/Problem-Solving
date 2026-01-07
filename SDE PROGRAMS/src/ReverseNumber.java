import java.util.Scanner;

public class ReverseNumber {
	static void reverse(int num) {
		int rev=0, rem;
		while(num != 0) {
			rem = num %10;
			rev = rev*10+rem;
			num /=10;
		}
		System.out.println("reverse = "+rev);

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.println(num);
		reverse(num);
		

	}

}
