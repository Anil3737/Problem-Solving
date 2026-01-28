import java.util.*;

class Happy {

    static int sum(int n) {
        int s = 0, d;
        while (n != 0) {
            d = n % 10;
            s += d * d;
            n /= 10;
        }
        return s;
    }

    static void check(int num) {
        while (num != 1 && num != 4) {
            num = sum(num);   // update num
        }

        if (num == 1)
            System.out.println("true");
        else
            System.out.println("false");
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        Happy.check(num);   // static call
    }
}
