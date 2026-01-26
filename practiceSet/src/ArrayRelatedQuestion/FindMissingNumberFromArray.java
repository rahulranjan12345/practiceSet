package ArrayRelatedQuestion;

public class FindMissingNumberFromArray {
    public static void main(String[] args) {

        int arr[] = {1,3,5,2,6,7};
        missingElementByXOR(arr);
        missingElement(arr);

    }

    /**
     * Time Complexity = O(n)
     *  Space Complexity =O(1)
     */
    public static void missingElementByXOR(int []arr){
        int xor1 = 0;
        int xor2 = 0;
        int missing_value =0;
        int n = arr.length + 1; // because one number is missing
        // XOR all numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            xor1 ^= i;
        }
        // XOR all numbers in array
        for (int num : arr) {
            xor2 ^= num;
        }
        missing_value = xor1^xor2;
        System.out.println("missing_value : " + missing_value);
    }

    /**
     * Time Complexity = O(n)
     *  Space Complexity =O(1)
     *  overflow when n is large
     * Example: with n ≈ 65,000, (n*(n+1))/2 may exceed int
     * Must assume numbers start at 1 and are consecutive
     */
    public static void missingElement(int arr[]){
        int n = arr.length + 1; // because one number is missing
        int sumOfArrayElement = 0;
        int sumOfArrayElementWithMissingNumber = (n*(n+1))/2;
        int missingNumber =0;
        for (int num : arr) {
            sumOfArrayElement +=num;
        }
        missingNumber = sumOfArrayElementWithMissingNumber - sumOfArrayElement;
        System.out.println("missing number: "+missingNumber);
    }
}
