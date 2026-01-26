import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int [] arr= new int[size];
        for(int i=0;i<size;i++){
            arr[i] = scanner.nextInt();
        }
        int sum =0;
        for(int i=0;i<size;i++){
            if(arr[i ] % 10 == 3){
                sum =sum + arr[i];
            }
        }
        System.out.println(sum);
    }
}
