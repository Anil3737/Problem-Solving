import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        // if(num % 3 == 0 || num % 5 == 0){
        //     System.out.println("true");
        // }
        // else{
        //     System.out.println("false");
        // }
        System.out.println((num%3==0 || num%5==0));
    }
}
