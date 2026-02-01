import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner =  new Scanner(System.in);
        String email = scanner.next();
        int len = email.length();
        int hasAt=0,hasDot=0;
        for(int i=0;i<len;i++){
            if(email.charAt(i)=='@')
                hasAt=1;
            if(email.charAt(i)=='.')
                hasDot=1;
            
        }
        System.out.println((hasAt==1 && hasDot==1)?"Valid":"InValid");
        
    }
}
