import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count=0;
        while(num!=0){
            if(num%2==1){
                count++;
            }
            num/=2;
        }
        System.out.println(count);



    }
}
