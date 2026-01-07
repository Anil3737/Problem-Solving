import java.util.*;
public class SumOfElements {
	static void sum(int []arr) {
		int sum=0;
		for(int num : arr) {
			sum+=num;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<size;i++) {
			arr[i] = scanner.nextInt();
		}
		sum(arr);

	}

}
