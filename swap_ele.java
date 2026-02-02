package Array;

import java.util.*;

public class swap_ele {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Array Length :: ");
		int size = scanner.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; arr[i] = scanner.nextInt(), i += 1);
		for (int i = 0; i < size - 1; i += 2) {
			int temp = arr[i];
			arr[i] = arr[i + 1];
			arr[i + 1] = temp;

		}
		for (int i = 0; i < size; System.out.print(arr[i] + ","), i++)
			;
		scanner.close();
	}

}

