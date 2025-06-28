package pro.abnjava.leetcode.t01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoNumberSum {

    public static void main(String[] args) throws Exception {
        TwoNumberSum instance = new TwoNumberSum();
        var result = instance.solution(new int[]{2, 11, 7, 9}, 9);
        System.out.println(Arrays.toString(result));

        var result2 = instance.solution(new int[]{2, 5, 7, 9, 5}, 10);
        System.out.println(Arrays.toString(result2));
    }

    /*
     * [2,11,7,5]
     */
    public int[] solution(int[] nums, int target) throws Exception {
        // value at Index
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int delta = target - nums[i];
            if (map.containsKey(delta)) {
                return new int[]{map.get(delta), i};
            } else {
                map.put(nums[i], i);
            }
        }
        throw new Exception("Not found numbers");
    }
}
