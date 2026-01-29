import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int price=1,d;
        while(num!=0){
            d = num % 10;
            price = price * d;
            num /= 10;
        }
        System.out.println(price);
        
    }
}
