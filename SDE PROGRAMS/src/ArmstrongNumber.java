import java.util.*;

public class ArmstrongNumber {
	static void armstrong(int num) {
		int rem,sum=0,temp;
		int n = String.valueOf(num).length();
		temp = num;
		while(num > 0) {
			rem = num % 10;
			sum += Math.pow(rem, n);
			num /= 10;
		}
		if(temp == sum) {
			System.out.println("Armstrong");
		}else {
			System.out.println("NOT");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
				int number = scanner.nextInt();
				armstrong(number);
				
	}

}
