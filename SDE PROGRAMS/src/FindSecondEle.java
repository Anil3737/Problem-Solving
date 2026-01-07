import java.util.*;
public class FindSecondEle {
	static void input() {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if(number<2) {
			System.out.println("Array Must have 2 elements :: ");
			return;
		}
		int arr[] = new int[number];
		for(int i=0;i<number;i++) {
			arr[i] = scanner.nextInt();
		}
		second(arr);
		scanner.close();
	}
	static void second(int []arr) {
		Arrays.sort(arr);
		int n = arr.length;
		System.out.println(arr[n-2]);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		input();
	}

}
