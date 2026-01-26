import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int res=0,d;
        while(num!=0){
            d = num % 10;
            if(d==0){
                res=1;
                break;
            }
            num/=10;
        }
        if(res==1){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
