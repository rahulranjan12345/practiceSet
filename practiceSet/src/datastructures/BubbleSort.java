package datastructures;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {8,6,9,2,4,5};
        System.out.println("::::::: bubbleSortUsingRecursion:::::");
        bubbleSortUsingRecursion(arr, arr.length-1);
        int arr1[] = {8,6,9,2,4,5};
        System.out.println();
        System.out.println("::::::: bubbleSort:::::");
        bubbleSort(arr1);


    }

    /**
     * Time Complexity = O(n²)
     * Space Complexity = O(1)
     * @param arr
     */
    private static void bubbleSort(int[] arr) {
        int temp =0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

            Arrays.stream(arr).forEach((System.out ::print));
    }
    /**
     * Time Complexity = O(n²)
     * Space Complexity = O(1)
     * @param arr
     */
    private static void bubbleSortUsingRecursion(int[] arr,int length) {
        int temp =0;

        for (int i = 0; i < length; i++) {
            if (arr[i]>arr[i+1]) {
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        length --;
        if(length >= 1)
            bubbleSortUsingRecursion(arr,length);
        else
            Arrays.stream(arr).forEach((System.out ::print));
    }


}
