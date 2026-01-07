package Strings;

import java.util.*;

public class DuplicateString {
	static void duplicate(String str) {
		char[] ch = str.toCharArray();
		String []ch1 = "";
		char i = 0;
		for (char c = 0; c < ch.length; c++) {
			if (ch[c] == ch[c + 1]) {
				if (i == 0 || ch1[i - 1] != ch1[i]) {
					ch1[i++] = ch[c];
				}
			}
		}
		for (char c = 0; c < i; c++) {
			System.out.print(ch1[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		duplicate(str);

	}

}
