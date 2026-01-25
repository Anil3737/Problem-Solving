package logicHack;

import java.io.*;
import java.util.*;

public class C15 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int max = 0;
        while(num != 0){
            int rem = num % 10;
            if(max<rem){
                max = rem;
            }
            num = num / 10;
                
        }
        System.out.println(max);
    }
}