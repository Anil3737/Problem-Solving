package problem_Solving;

// Hacker Rank Challenge 6
import java.util.Scanner;

class Hrc6 {
	void range(int a, int b) {
		System.out
				.println((a >= 30 && a <= 40) && (b >= 30 && b <= 40) || (a >= 40 && a <= 50) && (b >= 40 && b <= 50));

	}
}

public class C6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number :: ");
		int a = scanner.nextInt(), b = scanner.nextInt();
		Hrc6 c = new Hrc6();
		c.range(a, b);
		scanner.close();

	}

}
