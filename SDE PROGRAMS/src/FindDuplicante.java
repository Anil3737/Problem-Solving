import java.util.*;

public class FindDuplicante {
	static void input() {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if (num <= 0) {
			System.out.println("Invalid Input.");
			return;
		}
		int arr[] = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = scanner.nextInt();
		}
		duplicates(arr);
	}

	static void duplicates(int[] arr) {
		Arrays.sort(arr);
		int n = arr.length;
		int temp[] = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				// Avoid adding same duplicate multiple times
				if (j == 0 || temp[j - 1] != arr[i]) {
					temp[j++] = arr[i];
				}
			}
		}
		for (int i = 0; i < j; i++) {
			System.out.print(temp[i] + ",");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input();
	}

}
