import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = new int[num];

        int sum = 0;
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }

        int average = sum / num;
        int robotsToCharge = 0;
        for (int i = 0; i < num; i++) {
            if (arr[i] < 50) {
                robotsToCharge++;
            }
        }

        System.out.println("Average Battery: " + average);
        System.out.println("Robots to Charge: " + robotsToCharge);
        scanner.close();
    }
}
