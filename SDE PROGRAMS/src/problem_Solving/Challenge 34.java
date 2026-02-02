import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        int arr[] = new int[num];
        int p_num=0,n_num=0,zero=0;
        for(int i=0;i<num;i++){
            arr[i] = obj.nextInt();
        }
        for(int i:arr){
            if(i>0)
                p_num++;
            else if(i<0)
                n_num++;
            else
                zero++;
        }
        System.out.print(p_num+" "+n_num+" "+zero);
    }
}
