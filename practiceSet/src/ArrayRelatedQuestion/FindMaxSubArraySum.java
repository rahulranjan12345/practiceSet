package ArrayRelatedQuestion;

public class FindSubsetOfArrayWhichreturnMaxValue {
    public static void main(String[] args) {
        int arr[] = {1,5,-8,7,0,-1,4};
        int max_value = arr[0];
        int sum = arr[0];
        int start =0;
        for (int i = 1; i < arr.length; i++) {
            sum = sum + arr[i];
            //max_value = max_value < sum ? sum : max_value;
            if(max_value < sum){
                max_value = sum;
            } else if (sum < 0) {
                start = i+1;
                sum = 0;
            }
        }
        System.out.println("max value: "+max_value);
    }
}
