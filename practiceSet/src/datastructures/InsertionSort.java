package datastructures;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {8,6,9,2,4,5};
        System.out.println("::::::: insertionSort:::::");
        insertionSort(arr);

    }


    /**
     * Time Complexity = O(n²)
     * Space Complexity = O(1)
     * @param arr
     */
    private static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j=i-1;
            while (j>= 0 && arr[j]> temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        Arrays.stream(arr).forEach((System.out ::print));
    }

}
