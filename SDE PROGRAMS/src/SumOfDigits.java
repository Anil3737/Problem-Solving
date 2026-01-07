import java.util.*;
public class SumOfDigits {
	static void sum(int num) {
		int sumofdigits=0,rem;
		while(num != 0) {
			rem = num  % 10;
			sumofdigits +=rem;
			num /= 10;
		}
		System.out.println(sumofdigits);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		sum(number);

	}

}
