import java.util.Scanner;

public class PalindromeNumber {
	static void reverse(int num) {
		int rem,rev=0;
		int temp = num;
		while(num!=0){
			rem = num%10;
			rev = 10*rev+rem;
			num /= 10;
		}
		System.out.println(rev);
		if(temp == rev) {
			System.out.println("Palindrome");
		}else {
			System.out.println("NOT");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		reverse(number);
	}

}
