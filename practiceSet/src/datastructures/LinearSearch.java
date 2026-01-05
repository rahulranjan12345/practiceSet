package datastructures;


public class LinearSearch {
    public static void main(String[] args) {
        //take a shorted array
        //int[] arr = new int[1000];
        int[] arr = {2,4,6,7,8,9,14,32};
        int searchElement =7;
        int linearSearchResult = linearSearch(arr,searchElement);

        if(linearSearchResult != -1)
            System.out.println(searchElement +" : present in array on index "+linearSearchResult);
        else
            System.out.println(searchElement +" : not present in array on index ");

    }

    /** linear search :- searching element on every index
     * time capacity O(n)

     */
    static int linearSearch(int[] arr, int searchElement){
        int step =0;
        for (int i = 0; i < arr.length; i++) {
            step++;
            if(arr[i] == searchElement) {
                System.out.println("stape taken by linear search: "+step);
                return i;
            }
        }
        System.out.println("stape taken by linear search: "+step);
        return -1;
    }

}
