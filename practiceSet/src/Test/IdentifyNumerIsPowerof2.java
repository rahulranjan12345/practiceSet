package Test;

import java.util.Scanner;

public class IdentifyNumerIsPowerof2 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.println("enter a number:");
        int num = scn.nextInt();
        boolean result = isPowerOfTwo(num);
        System.out.println(result);

    }

    /**
     * Time Complexity = O(1)
     * Space Complexity = O(1)
     * @param num
     * @return
     */
    public static boolean isPowerOfTwo(int num){
        return num > 0 && (num & (num - 1)) == 0;
    }
}
