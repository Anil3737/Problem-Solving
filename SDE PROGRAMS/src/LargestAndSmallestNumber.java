import java.util.*;

public class LargestAndSmallestNumber {
	static void maximum(int arr[]) {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = scanner.nextInt();
		}
		for (int i : arr) {
			System.out.print("," + i);
		}
		// maximum(arr[]);
		int max = arr[0];
		int min = arr[0];
		for (int num : arr) {
			if (num > arr[0]) {
				max = num;
			}
			if (num < arr[0]) {
				min = num;
			}
		}
		System.out.println("Maximun = "+max);
		System.out.println("Minimum = "+min);

	}

}
