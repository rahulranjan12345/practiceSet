package ArrayRelatedQuestion;

public class SecondLargestElementFromArray {
    public static void main(String[] args) {
        int arr [] = {7,3,8,2,4,5,9};
        int seconDLargestElemrnt = seconDLargestElemrntFromArray(arr);
        System.out.println("second largest element: "+seconDLargestElemrnt);
    }

    private static int seconDLargestElemrntFromArray(int[] arr) {
        int secondLargestElement = arr[0];
        int largestElement = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > largestElement) {
                secondLargestElement = largestElement;
                largestElement = arr[i];
            }
            else if(arr[i] < largestElement && arr[i] > secondLargestElement) {
                secondLargestElement = arr[i];
            }
        }
        return secondLargestElement;
    }
}
