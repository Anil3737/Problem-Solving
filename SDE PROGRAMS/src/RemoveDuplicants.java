import java.util.*;

public class RemoveDuplicants {
	static void input() {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if(num<=0) {
			System.out.println("Invalid input:: ");
			return;
		}
		int arr[] = new int[num];
		for(int i=0;i<num;i++) {
			arr[i] = scanner.nextInt();
		}
		duplicate(arr);
		scanner.close();
	}
	static void duplicate(int []arr) {
		Arrays.sort(arr);
		int n = arr.length;
		int temp[] = new int[n];
		int j=0;
		for(int i=0;i<n-1;i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n-1];
		display(temp,j);
	}
	static void display(int[] temp, int size) {
		for(int i=0;i<size;i++){
			System.out.print(temp[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input();

	}

}
