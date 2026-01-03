package Test;

import java.util.Scanner;

public class IdentifyEvenOrOddNumber {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("::::: Enter your number");
        int inputNumber = scanner.nextInt();
        isEvenOrOdd(inputNumber);
        isEvenOrOddWithoutUsingModuler(inputNumber);
        isEvenOrOddUsingBinary(inputNumber);
    }

    private static void isEvenOrOdd(int inputNumber) {
        if(inputNumber % 2  == 0)
            System.out.println(inputNumber +" is even number");
        else
            System.out.println(inputNumber +" is odd number");
    }

    private static void isEvenOrOddWithoutUsingModuler(int inputNumber) {
       if(inputNumber  == (inputNumber / 2) *2)
            System.out.println(inputNumber +" is even number");
        else
            System.out.println(inputNumber +" is odd number");
    }

    private static void isEvenOrOddUsingBinary(int inputNumber) {
        if((inputNumber & 1) == 0)
            System.out.println(inputNumber +" is even number");
        else
            System.out.println(inputNumber +" is odd number");
    }

}
