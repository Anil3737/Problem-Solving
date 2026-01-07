import java.util.*;
public class ReverseArray {
	static void input(int s) {
		Scanner scanner = new Scanner(System.in);
		int []arr = new int[s];
		for(int i=0;i<s;i++) {
			arr[i] = scanner.nextInt();
		}
		reverse(arr);
	}
	static void reverse(int[] arr) {
		int n = arr.length;
		for(int i=0;i<n/2;i++) {
			int temp = arr[i];
			arr[i] = arr[n-1-i];
			arr[n-1-i] = temp;
		}
		for(int num : arr) {
			System.out.print(num+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		
		input(size);
		
	}

}
