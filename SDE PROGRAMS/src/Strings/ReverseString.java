package Strings;

import java.util.Scanner;

public class ReverseString {
	static void reverse(String str) {
		String[] words = str.split(" ");
		String reverse = "";
//		for (String word : words) {
//            String rev = "";
//            for (int i = word.length() - 1; i >= 0; i--) {
//                rev += word.charAt(i);
//            }
//            reverse += rev + " "; // add reversed word to result
//        }
//		System.out.println(reverse.trim());
		for(int i=str.length()-1;i>=0;i--) {
			reverse +=str.charAt(i);
		}
		System.out.println(reverse.toString());
		if(reverse.equals(str)) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		reverse(str);
		scanner.close();
	}

}
