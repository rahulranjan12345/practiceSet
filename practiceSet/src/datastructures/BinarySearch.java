package datastructures;


public class BinarySearch {
    public static void main(String[] args) {
        //take a shorted array
        //int[] arr = new int[1000];
        int[] arr = {2,4,6,7,8,9,14,32};
        int searchElement =7;
        int binarySearchResult = binarySearch(arr,searchElement);
        int binarySearchUsingRecusion =binarySearchUsingRecusion(arr,searchElement,0,arr.length-1);
        if(binarySearchResult != -1)
            System.out.println(searchElement +" : present in array on index "+binarySearchResult);
        else
            System.out.println(searchElement +" : not present in array on index ");

    }


    /** binary Search:- searching element on help of mid value
     * mid value = (start index + last index) / 2
     * time capacity O(log(n))
     */
    static int binarySearch(int[] arr, int searchElement){
        int startInd = 0 ,lastIndex = arr.length-1,midIndex =0;
        int step = 0;
        while(startInd <= lastIndex) {
            step++;
            midIndex =startInd+(lastIndex-startInd)/2;
            if(arr[midIndex] == searchElement) {
                System.out.println("stape taken by binary search: "+step);
                return midIndex;
            }else if(arr[midIndex] < searchElement){
                startInd= midIndex + 1;
            }else if(arr[midIndex] > searchElement){
                lastIndex = midIndex - 1;
            }
        }
        System.out.println("stape taken by binary search: "+step);
        return -1;
    }


    static int binarySearchUsingRecusion(int[] arr, int searchElement,int startInd,int lastIndex){
        int midIndex =(lastIndex+startInd)/2;
        if(startInd <= lastIndex){
            if(arr[midIndex] < searchElement){
                binarySearchUsingRecusion(arr,searchElement,midIndex+1,lastIndex);
            }
            else if(arr[midIndex] > searchElement){
                binarySearchUsingRecusion(arr,searchElement,startInd,midIndex-1);
            }
            if(arr[midIndex] == searchElement) {
                return midIndex;
            }
        }
        return -1;
    }
}
