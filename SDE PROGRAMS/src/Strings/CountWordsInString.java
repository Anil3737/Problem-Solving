package Strings;

import java.util.Scanner;

public class CountWordsInString {
	static void count(String str) {
		int c=1;
		for(int i=0;i<str.length();i++) {
			if((str.charAt(i)==' ') && (str.charAt(i+1)!=0)) {
				c++;
			}
		}
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		count(str);
		scanner.close();

	}

}
