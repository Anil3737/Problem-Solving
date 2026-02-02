import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int arr[] = new int[num];
        int count=0;
        for(int i=0;i<num;i++){
            arr[i] = scanner.nextInt();
        }
        for(int i:arr){
            if(i%2==0 && i%3==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
