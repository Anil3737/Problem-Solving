package problem_Solving;
import java.util.*;
// Hacker Rank Challenge 7
class Hrc7{
	public void percentage(int n) {
		int result;
		result = (7/n)*100;
		System.out.println(n-result);
	}
}
public class C7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number ::");
		int num = scanner.nextInt();
		Hrc7  c = new Hrc7();
		c.percentage(num);
	}

}
