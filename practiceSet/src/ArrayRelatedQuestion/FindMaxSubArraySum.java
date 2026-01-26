package ArrayRelatedQuestion;

public class FindMaxSubArraySum {
    public static void main(String[] args) {
        int arr[] = {1,5,-8,7,0,-1,4};

        System.out.println("max value: "+getMaxSubArraySum(arr));
    }

    /**
     * time camplicity = O(n)
     * @param arr
     * @return
     */
    public static int getMaxSubArraySum(int arr[]){
        int max_SumValue = arr[0];
        int current_sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            current_sum = Math.max(arr[i],current_sum + arr[i]);
            max_SumValue = Math.max(current_sum, max_SumValue);
        }
        return max_SumValue;
    }
}
