package problem_Solving;
// Hacker Rank Challenge 9
import java.util.*;
class Hrc9{
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Strings :: ");
		String str1 = sc.next();
		String str2 = sc.next();
		equal(str1,str2);
		
	}
	public static void equal(String st1, String st2) {
		int l1 = st1.length();
		int l2 = st2.length();
		System.out.println(l1==l2);
	}
}
public class C9 {
	public static void main(String[] args) {
		Hrc9 c = new Hrc9();
		c.input();
	}

}
