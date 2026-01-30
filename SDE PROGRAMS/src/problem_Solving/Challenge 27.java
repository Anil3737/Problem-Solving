import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner obj = new Scanner(System.in);
        int start = obj.nextInt(),end = obj.nextInt();
        int digit;
        for(int i=start;i<=end;i++){
            digit = i % 10;
            if(digit==3){System.out.print(i+" ");
                     }
            
        }
       // System.out.println(digit);
    }
}
