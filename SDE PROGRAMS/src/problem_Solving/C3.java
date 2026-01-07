package problem_Solving;

// Hacker Rank Challenge 3
import java.util.*;

class Hrc3 {
	public void equal(int a, int b) {
		System.out.println(a == 10 || b == 10 || (a + b) == 10);
	}
}

public class C3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Two Numbers :: ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		Hrc3 h = new Hrc3();
		h.equal(num1, num2);
		
		scanner.close();
	}

}
