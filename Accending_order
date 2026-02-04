
package Array;

import java.util.Scanner;

public class Acceding_Order {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number:: ");
		int size = scanner.nextInt();
		int []arr = new int[size];
		for(int i=0;i<size;i++) {
			arr[i] = scanner.nextInt();
		}
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i]> arr[j]) {
					arr[i] = arr[i]^arr[j];
					arr[j] = arr[i]^arr[j];
					arr[i] = arr[i]^arr[j];
				}
			}
		}
		for(int i=0;i<size;System.out.println(arr[i]),i++);
		scanner.close();
	}

}
