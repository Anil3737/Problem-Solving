import java.io.*;
import java.util.*;


class Happy{
    static int sum(int n){
        int s=0,d;
        while(n!=0){
            d = n % 10;
            s = s+(d*d);
            n /= 10;
        }
        return s;
    }
    static void check(int num){
        while(num!=0){
            if(num>0 && num<9){
                if(num==1){
                    System.out.println("true");
                    break;
                }else
                    System.out.println("false");
            }            
        }
        sum(num);
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        Happy h = new Happy();
        h.check(num);
        
    }
}
