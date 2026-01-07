import java.util.Scanner;

public class Fibonacii {
	static int fibonaciiSeries(int n) {
		int a=0,b=1,temp;
		for(int i=0;i<=n;i++) {
			System.out.print(a+",");
			temp = a+b;
			a=b;
			b=temp;
			
			
		}
		return 0;
		
	}
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		fibonaciiSeries(num);
	}

}
