package problem_Solving;

// Hacker Rank Challenge1
import java.util.Scanner;

class main {
	static void sum(int n) {
		System.out.println(n % 10 + (n / 10) % 10 + (n / 100) % 10);
	}

}

public class C1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number :: ");
		int num = scanner.nextInt();
		main c = new main();
		c.sum(num);
	}
}
