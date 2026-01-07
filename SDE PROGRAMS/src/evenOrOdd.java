import java.util.*;

public class evenOrOdd {
	static int findEvenOrOdd(int n) {
		if(n %2 == 0) {
			System.out.println("Even");
		}else
		{
			System.out.println("Odd");
		}
		return n;
	}
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = scanner.nextInt();
		findEvenOrOdd(num);
		//System.out.println(res);
		scanner.close();
	}
}