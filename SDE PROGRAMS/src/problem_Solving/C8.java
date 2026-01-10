package problem_Solving;
// Hacker Rank Challenge 8
import java.util.*;
class Hrc8{
	static void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Five Numbers :: ");
		int a = sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),d=sc.nextInt(),e=sc.nextInt();
		smallOfFive(a,b,c,d,e);
	}
	public static void smallOfFive(int a,int b,int c,int d,int e) {
		if(a<b && a<c && a<d && a<e) {
			System.out.println(a);
		}
		else if(b<a && b<c && b<d && b<e) {
			System.out.println(b);
		}else if(c<d && c<e) {
			System.out.println(c);
		}else if(d<e) {
			System.out.println(d);
		}else {
			System.out.println(e);
		}
	}
}
public class C8 {
	public static void main(String[] args) {
		Hrc8 c = new Hrc8();
		c.input();
	}

}
