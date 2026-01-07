package Strings;
import java.util.*;
public class AnagramString {
	static void angram(String input1,String input2) {
		char[] ch1 = input1.toCharArray();
		char[] ch2 = input2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(Arrays.equals(ch1, ch2)) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String input1 = scanner.next();
		String input2 = scanner.next();
		angram(input1,input2);

	}

}
