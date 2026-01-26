package ArrayRelatedQuestion;

public class FindUniqueNumberFromArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,1,4,2};
        int unickNumber = findUniqueNumber(arr);
        System.out.println("unique number in array is "+unickNumber);

    }

    /**
     * Time complicity = O(n)
     * Space Complicity = O(1)
     * XOR(^) :- 0^n = n and n^n = 0
     * @param arr
     * @return
     */
    static int findUniqueNumber(int arr[]){
        int uniqueNumber =0;
        for (int i = 0; i < arr.length; i++) {
            uniqueNumber = uniqueNumber^arr[i];
        }
        return uniqueNumber;
    }

}
