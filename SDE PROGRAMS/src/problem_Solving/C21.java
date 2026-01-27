import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        int evenSum=0,oddSum=0;
        while(num!=0){
            int d = num % 10;
            if(d%2==0){
                evenSum ++;
            }
            else{
                oddSum ++;
            }
            num/=10;
        }
        System.out.println(evenSum);
        System.out.println(oddSum);
    }
}
