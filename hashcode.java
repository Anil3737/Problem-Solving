package Array;

import java.util.*;

public class hashcode {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] f = new int[] { 1, 2, 3, 4, 5 };

		System.out.println(Arrays.toString(f));
		for (int i = 0; i < f.length; i++) {
			System.out.println();
		}
		System.out.println(f.hashCode());
	}
}
