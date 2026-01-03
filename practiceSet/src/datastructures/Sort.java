package datastructures;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int arr[] = {8,6,9,2,4,5};
        bubbleSortUsingRecursion(arr, arr.length-1);
        System.out.println();
        bubbleSort(arr);
        System.out.println();
        selectionSort(arr);
        System.out.println("::::::: insertionSort:::::");
        insertionSort(arr);
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
                    temp = arr[i];
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

    /**
     * Time Complexity = O(n²)
     * Space Complexity = O(1)
     * @param arr
     */
    private static void selectionSort(int[] arr) {
        int temp =0;
        int max_value_index = 0;
        //int arr[] = {8,6,9,2,4,5};
        for (int i = arr.length-1; i <0 ; i--) {
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
