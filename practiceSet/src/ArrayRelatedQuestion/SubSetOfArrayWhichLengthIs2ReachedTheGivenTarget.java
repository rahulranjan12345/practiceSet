package ArrayRelatedQuestion;

import java.util.*;

public class SubSetOfArrayWhichLengthIs2ReachedTheGivenTarget {
    public static void main(String[] args) {
        int arr[] = {2,4,-7,7,-3,1,8,5};
        int target = 10;
        System.out.println(Arrays.toString(twoValueSumIndexUsingMap(arr,target)));

        List<int[]> pairs = twoValueSumIndexUsingMapForMultiplePairOfIndex(arr, target);
        for (int[] p : pairs) {
            System.out.println("["+p[0] + ", " + p[1]+"]");
        }

    }

    /**
     * Using Map if one pair index have to return
     * @param arr
     * @param target
     * @return
     */
    public static int[] twoValueSumIndexUsingMap(int arr[],int target){
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(arr[i], i);
        }
        return new int[] {}; // no solution
    }

    public static List twoValueSumIndexUsingMapForMultiplePairOfIndex(int arr[], int target){
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<int[]> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                for (int index : map.get(complement)) {
                    result.add(new int[]{index, i});
                }
            }

            map.putIfAbsent(arr[i], new ArrayList<>());
            map.get(arr[i]).add(i);
        }
        return result;
    }

}
