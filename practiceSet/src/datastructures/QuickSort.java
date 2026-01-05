package datastructures;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {8,6,9,2,4,5};
        quickSort(arr,0,arr.length-1);
        Arrays.stream(arr).forEach((System.out ::print));
    }

    /**
     * Time Complexity : O(n log n)
     * @param arr
     * @param low
     * @param high
     */
    private static void quickSort(int[] arr,int low,int high) {
        if(low < high){
            int pivotIndex = findPivotIndex(arr,low,high);
            quickSort(arr,low,pivotIndex-1);
            quickSort(arr,pivotIndex+1,high);
        }

    }
    private static int findPivotIndex(int[] arr,int low,int high){
        int pivotValue = arr[high];
        int i = low-1;
        for (int j = low; j < high; j++) {
            if(pivotValue > arr[j]){
                i++;
               swapValue(arr,i,j);

            }
        }
        swapValue(arr,i+1,high);
        return i+1;
    }

    private static void swapValue(int[] arr,int firstInd, int secondInd) {
        int temp = arr[secondInd];
        arr[secondInd] = arr[firstInd];
        arr[firstInd] = temp;
    }
}
