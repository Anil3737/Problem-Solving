package problem_Solving;
// Hacker Rank Challenge 11
// Product of digits of number
import java.util.*;
class Hrc11{
	void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number :: ");
		int num = scanner.nextInt();
		productOfDigits(num);
		scanner.close();
	}
	static void productOfDigits(int num) {
		int product = 1;
		while(num!=0) {
			int rem  = num % 10;
			product *= rem;
			num /= 10;
		}
		display(product);
	}
	static void display(int result) {
		System.out.println(result);
	}
}
public class C11 {
	public static void main(String[] args) {
		Hrc11 c = new Hrc11();
		c.input();
	}

}
