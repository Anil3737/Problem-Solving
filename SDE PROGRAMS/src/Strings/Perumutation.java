package Strings;

import java.util.*;

public class Perumutation {
	static void permute(String str, String prefix) {
		if (str.length() == 0) {
			System.err.println(prefix);
		} else {
			for (int i = 0; i < str.length(); i++) {
				String rem = str.substring(0, i) + str.substring(i + 1);
				permute(rem, prefix + str.charAt(i));
				
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		permute(str, "");
		scanner.close();
	}

}
