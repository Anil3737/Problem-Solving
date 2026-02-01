import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int arr[] = new int[num];
        int max=0;
        int sum=0;
        for(int i=0;i<num;i++){
            arr[i]=scanner.nextInt();
            sum+=arr[i];
        }
        for(int i:arr){
            if(max<i){
                max=i;
            }
        }
        System.out.println("Total Candies: "+sum);
        System.out.println("Highest Candies: "+max);
    }
}
