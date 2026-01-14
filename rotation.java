package Array;

import java.util.Scanner;

public class rotation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number :: ");
		int num = scanner.nextInt();
		int []arr = new int[num];
		for(int i=0;i<num;arr[i]=scanner.nextInt(),i++);
		int rotation = scanner.nextInt();
		int count = rotation%num;
		for(int i=count;i<count;i++) {
			System.out.println(arr[i]+" ");
		}
		for(int i=0;i<count;i++) {
			System.out.println(arr[i]+" ");
		}
		scanner.close();
		}

}
