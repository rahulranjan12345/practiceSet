package ArrayRelatedQuestion;

public class MoveAllZeroesToEndFromArray {
    public static void main(String[] args) {
        int arr[] ={1,0,4,5,0,0,6,2};
        moveAllZeroesElementAtEndTakeFirstZeroElementIndex(arr);

    }

    /**
     * Move all zero element at end and position not changed for nonzero element
     * Take first zero element index  and swap with all nonzero element
     * Time Complicity = O(n)
     * @param arr
     */
    public static void moveAllZeroesElementAtEndTakeFirstZeroElementIndex(int arr[]){
        int firstZeroElementIndex = -1; //{1,0,4,5,0,0,6,2};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0 && firstZeroElementIndex < 0)
                firstZeroElementIndex =i;
            else if (firstZeroElementIndex > 0 && arr[i] != 0){
                // Swap with XOR
                arr[firstZeroElementIndex] = arr[firstZeroElementIndex] ^ arr[i];
                arr[i] = arr[firstZeroElementIndex] ^ arr[i];
                arr[firstZeroElementIndex] = arr[firstZeroElementIndex] ^ arr[i];
                firstZeroElementIndex++;
            }
        }
        for ( int i: arr) {
            System.out.print(i+" ");
        }
    }

    /**
     *
     *  Time Complicity = O(n)
     * @param arr
     */
    public static void moveAllZeroesElementAtEndNonZeroElementOrderChange(int arr[]){
        int temp =0;
        int lastIndex = arr.length-1;
        for (int i = 0; i < lastIndex; i++) {
            if (arr[i]==0){
                temp = arr[i];
                arr[i]= arr[lastIndex];
                arr[lastIndex]=temp;
                lastIndex--;
            }
        }
    }
}
