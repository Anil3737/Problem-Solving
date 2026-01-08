package problem_Solving;
// Hacker Rank Challenge 5
import java.util.Scanner;
class Hrc5{
	public void ctonum(char c) {
		System.out.println((int)c);
	}
}
public class C5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char ch = scanner.nextLine().charAt(0);
		Hrc5 c = new Hrc5();
		c.ctonum(ch);
		
		scanner.close();
	}

}
