package datastructures;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {8,6,9,2,4,5};
        System.out.println("::::::: selectionSort:::::");
        selectionSort(arr);

    }

    /**
     * Time Complexity = O(n²)
     * Space Complexity = O(1)
     * @param arr
     */
    private static void selectionSort(int[] arr) {
        int temp =0;
        //int arr[] = {8,6,9,2,4,5};
        for (int i = arr.length-1; i > 0 ; i--) {
            int max_value_index = 0;
            for (int j = 0; j <= i; j++) {
                if(arr[max_value_index] < arr[j]){
                    max_value_index =  j;
                }
            }
            temp = arr[i];
            arr[i] = arr[max_value_index];
            arr[max_value_index] = temp;

        }

        Arrays.stream(arr).forEach((System.out ::print));
    }

}
