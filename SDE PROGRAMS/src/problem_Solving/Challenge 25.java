import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt(),sum=0,digit;
        while(num!=0){
            digit = num % 10;
            sum = sum + digit;
            num /= 10;
        }
        if(num % sum == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
