import java.util.*;

/**
 * Created by codez on 2017/10/13.
 *
 * 1. Two Sum
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class TwoSum {
    public static void main(String args[]) {
        TwoSum t = new TwoSum();
        int[] nums = {1,2,3,4,5,6,7};
        System.out.println("result:" + Arrays.toString(t.twoSum(nums, 6)));
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();//key:value->nums[i]:i
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target-nums[i])) {
                result[0] = map.get(target-nums[i]);
                result[1] = i;
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }

}
