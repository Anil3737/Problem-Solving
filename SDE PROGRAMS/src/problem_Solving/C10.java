package problem_Solving;

// Hacker Rank Challenge 10
import java.util.Scanner;

class Hrc10 {
	void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number :: ");
		int num = scanner.nextInt();
		
		scanner.close();
		check(num);
	}
	static void check(int n) {
		int cube = n*n*n;
		int lastNum = cube%10;
		System.out.println(lastNum == n);
	}
}

public class C10 {
	public static void main(String[] args) {
		Hrc10 c = new Hrc10();
		c.input();
	}
}
