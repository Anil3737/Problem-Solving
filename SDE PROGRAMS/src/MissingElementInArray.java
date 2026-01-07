import java.util.*;

public class MissingElementInArray {
	static void input() {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		int arr[] = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = scanner.nextInt();
		}
		int sum = 0;
		int n= arr.length+1;
		int total = n*(n+1)/2;
		for (int i : arr) {
			sum += i;
		}
		System.out.println(total-sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input();

//		int[] arr = { 1, 2, 4, 5 };
//		int n = arr.length + 1;
//		int total = n * (n + 1) / 2;
//		int sum = 0;
//		for (int num : arr)
//			sum += num;
//		System.out.println("Missing Number: " + (total - sum));

	}

}
