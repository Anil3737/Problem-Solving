import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        int input = obj.nextInt();
        int count=0,digit;
        while(num!=0){
            digit = num % 10;
            num/=10;
            count++;
        }
       // System.out.println((input==count)+" "+count);
        if(input == count)
            System.out.println("True " +count);
        else
            System.out.println("False "+count);
    }
}
