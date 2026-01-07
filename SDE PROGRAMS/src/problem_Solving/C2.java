package problem_Solving;
// Hacker Rank Challenge 2
import java.util.*;
class Hrc2{
	public void mult(int n) {
		System.out.println(n*(n+1));
	}
}
public class C2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number :: ");
		int num = scanner.nextInt();
		Hrc2 c = new Hrc2();
		c.mult(num);
		scanner.close();
		
	}
}
