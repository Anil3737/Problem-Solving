import java.util.Scanner;

public class SwapWithout {
	static void swap(int n1,int n2) {
		n1 = n1 + n2;
		n2 = n1 - n2;
		n1 = n1 - n2;
		System.out.println("After " +n1+" "+n2);
	}
	static void withTemp(int a,int b) {
		int temp ;
		temp = a;
		a = b;
		b = temp;
		System.out.println("With Temp "+a+" "+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		System.out.println("Before "+num1+" "+num2);
		swap(num1,num2);
		System.out.println("With Temp ");
		withTemp(num1,num2);
		

	}

}
