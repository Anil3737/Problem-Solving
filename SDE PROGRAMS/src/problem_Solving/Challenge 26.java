import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt(),count=0;
        for(int i=1;i<=num;i++){
            if(num % i == 0){
                count++;
            }
        }
        System.out.println(count>2);
    }
}
