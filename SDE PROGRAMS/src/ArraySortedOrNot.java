import java.util.*;

public class ArraySortedOrNot {
	static void input() {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if (num <= 0) {
			System.out.println("Invalid Input");
		}
		int arr[] = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = scanner.nextInt();
		}
		check(arr);
	}

	static boolean check(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] > arr[i + 1]) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input();

	}

}
